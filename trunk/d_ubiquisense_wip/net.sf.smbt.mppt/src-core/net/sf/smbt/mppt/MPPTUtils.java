/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 *     PureIso
 ***********************************************************************************/

package net.sf.smbt.mppt;

import net.sf.smbt.ezmppt.EpSolarCmd;
import net.sf.smbt.ezmppt.EzmpptFactory;
import net.sf.smbt.ezmppt.MPPT;
import net.sf.smbt.ezmppt.MpptCmd;

public class MPPTUtils {

	public final static MPPTUtils INSTANCE = new MPPTUtils();

	
	public byte[] dumpMPPTCmd(MpptCmd cmd) {
		
		byte sync1	= Byte.decode(MPPT.SYNCHRO1.getLiteral());
		byte sync2	= Byte.decode(MPPT.SYNCHRO2.getLiteral());
		byte eom	= Byte.decode(MPPT.EOM.getLiteral());
		
		
		byte device		= cmd.getDevice();
		byte command	= cmd.getCommand();
		byte length 	= cmd.getLength();
		byte[] data 	= cmd.getData();
		
		int size		= 6 + 1 + 1 + 1 + (int) length + 2 + 1;
		
		byte[] frame = new byte[size];
		
		frame[0] = sync1;
		frame[1] = sync2;
		frame[2] = sync1;
		frame[3] = sync2;
		frame[4] = sync1;
		frame[5] = sync2;
		
		frame[6] = device;
		frame[7] = command;
		frame[8] = length;

		System.arraycopy(data, 0, frame, 9, length);
		
		byte[] crc = crc16(data);
		
		frame[size-3] = crc[0];
		frame[size-2] = crc[1];
		frame[size-1] = eom;
		
		return frame;
	}
	
	public int getInt(byte[] bytes) {
		return (bytes[0] << 8) + bytes[1];
	}
	
	/*
	 * 

	 	Emission de la commande de lecture des mesures :

		Serial.write(0xEB); Serial.write(0x90);  // Synchro, rŽpŽtŽ 3 fois
		Serial.write(0x00);     // Device
		Serial.write(0xAA);     // Commande
		Serial.write(0x01);     // Longueur de donnees
		Serial.write(0x00);     // Donnee
		Serial.write(0x5D);     // Checksum
		Serial.write(0xDB);     // Checksum
		Serial.write(0x7F);     // Fin de commande
		
		 
		SŽquence reu sur le port sŽrie (en hexadŽcimal)
		
		    Synchro 	EB 90 EB 90 EB 90
		    Adresse 	00
		    Commande 	A0
		    Longueur 	18
		    DonnŽes 	E4 04 14 06 00 00 00 00 4C 04 B3 05 00 00 00 29 00 00 00 01 2B 03 00 00
		    CRC 16 	7F 91
		    Fin de paquet 	7F
		
		DŽtail des donnŽes reues (tension en dizaine de mV, courant en dizaine de mA)
		
		    Tension batterie 	E4 04
		    Tension panneaux 	14 06
		    RŽserve ? 	00 00
		    Consommation 	00 00
		    Batterie faible 	4C 04
		    Batterie pleine 	B3 05
		    Indicateur utilisation connectŽ 	00
		    Indicateur surcharge 	00
		    Indicateur de court-circuit 	00
		    Etat de charge (SOC) 	29
		    Indicateur Battery Over Load 	00
		    Indicateur Battery Over Discharge 	00
		    Indicateur Battery Full 	00
		    Indicateur de charge 	01
		    TempŽrature (degrŽ + 30) 	2B
		    Courant de charge 	03 00
		    RŽserve ? 	00 
	 
	 * 
	 */
	public EpSolarCmd getMpptCmd(byte[] frame) {
		EpSolarCmd cmd = EzmpptFactory.eINSTANCE.createEpSolarCmd();

		// batteries 0..1
		byte _mvBatteries[] = new byte[2];
		System.arraycopy(frame, 0, _mvBatteries, 0, 2);
		cmd.setMVBatteries(new Float(getInt(_mvBatteries)));
		
		// panels 2..3
		byte _mvPanels[] = new byte[2];
		System.arraycopy(frame, 2, _mvPanels, 0, 2);
		cmd.setMVPanels(new Float(getInt(_mvPanels)));
		
		// 15
		cmd.setOngoingLoading(new Float(Byte.valueOf(frame[15])));

		// 20
		cmd.setTemperature(new Float(Byte.valueOf(frame[20])));
		
		return cmd;
	}
	
	public byte[] crc16(byte[] buffer) {
	    //Table lookup
	    int[] table = 
	    {
	            0x0000, 0xC0C1, 0xC181, 0x0140, 0xC301, 0x03C0, 0x0280, 0xC241,
	            0xC601, 0x06C0, 0x0780, 0xC741, 0x0500, 0xC5C1, 0xC481, 0x0440,
	            0xCC01, 0x0CC0, 0x0D80, 0xCD41, 0x0F00, 0xCFC1, 0xCE81, 0x0E40,
	            0x0A00, 0xCAC1, 0xCB81, 0x0B40, 0xC901, 0x09C0, 0x0880, 0xC841,
	            0xD801, 0x18C0, 0x1980, 0xD941, 0x1B00, 0xDBC1, 0xDA81, 0x1A40,
	            0x1E00, 0xDEC1, 0xDF81, 0x1F40, 0xDD01, 0x1DC0, 0x1C80, 0xDC41,
	            0x1400, 0xD4C1, 0xD581, 0x1540, 0xD701, 0x17C0, 0x1680, 0xD641,
	            0xD201, 0x12C0, 0x1380, 0xD341, 0x1100, 0xD1C1, 0xD081, 0x1040,
	            0xF001, 0x30C0, 0x3180, 0xF141, 0x3300, 0xF3C1, 0xF281, 0x3240,
	            0x3600, 0xF6C1, 0xF781, 0x3740, 0xF501, 0x35C0, 0x3480, 0xF441,
	            0x3C00, 0xFCC1, 0xFD81, 0x3D40, 0xFF01, 0x3FC0, 0x3E80, 0xFE41,
	            0xFA01, 0x3AC0, 0x3B80, 0xFB41, 0x3900, 0xF9C1, 0xF881, 0x3840,
	            0x2800, 0xE8C1, 0xE981, 0x2940, 0xEB01, 0x2BC0, 0x2A80, 0xEA41,
	            0xEE01, 0x2EC0, 0x2F80, 0xEF41, 0x2D00, 0xEDC1, 0xEC81, 0x2C40,
	            0xE401, 0x24C0, 0x2580, 0xE541, 0x2700, 0xE7C1, 0xE681, 0x2640,
	            0x2200, 0xE2C1, 0xE381, 0x2340, 0xE101, 0x21C0, 0x2080, 0xE041,
	            0xA001, 0x60C0, 0x6180, 0xA141, 0x6300, 0xA3C1, 0xA281, 0x6240,
	            0x6600, 0xA6C1, 0xA781, 0x6740, 0xA501, 0x65C0, 0x6480, 0xA441,
	            0x6C00, 0xACC1, 0xAD81, 0x6D40, 0xAF01, 0x6FC0, 0x6E80, 0xAE41,
	            0xAA01, 0x6AC0, 0x6B80, 0xAB41, 0x6900, 0xA9C1, 0xA881, 0x6840,
	            0x7800, 0xB8C1, 0xB981, 0x7940, 0xBB01, 0x7BC0, 0x7A80, 0xBA41,
	            0xBE01, 0x7EC0, 0x7F80, 0xBF41, 0x7D00, 0xBDC1, 0xBC81, 0x7C40,
	            0xB401, 0x74C0, 0x7580, 0xB541, 0x7700, 0xB7C1, 0xB681, 0x7640,
	            0x7200, 0xB2C1, 0xB381, 0x7340, 0xB101, 0x71C0, 0x7080, 0xB041,
	            0x5000, 0x90C1, 0x9181, 0x5140, 0x9301, 0x53C0, 0x5280, 0x9241,
	            0x9601, 0x56C0, 0x5780, 0x9741, 0x5500, 0x95C1, 0x9481, 0x5440,
	            0x9C01, 0x5CC0, 0x5D80, 0x9D41, 0x5F00, 0x9FC1, 0x9E81, 0x5E40,
	            0x5A00, 0x9AC1, 0x9B81, 0x5B40, 0x9901, 0x59C0, 0x5880, 0x9841,
	            0x8801, 0x48C0, 0x4980, 0x8941, 0x4B00, 0x8BC1, 0x8A81, 0x4A40,
	            0x4E00, 0x8EC1, 0x8F81, 0x4F40, 0x8D01, 0x4DC0, 0x4C80, 0x8C41,
	            0x4400, 0x84C1, 0x8581, 0x4540, 0x8701, 0x47C0, 0x4680, 0x8641,
	            0x8201, 0x42C0, 0x4380, 0x8341, 0x4100, 0x81C1, 0x8081, 0x4040,
	    };
	    
	    int crc = 0x0000;
	    for (byte b : buffer) 
	    {
	    	crc = (crc >>> 8) ^ table[(crc ^ b) & 0xff];
	    }
	    byte[] results = Integer.toHexString(crc).getBytes();
	    
	    return results;
	}
}
