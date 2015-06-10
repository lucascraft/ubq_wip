/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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
 ***********************************************************************************/

package net.sf.smbt.chunks;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapCmd;
import net.sf.smbt.ezdxxp.DaapCmdResponse;
import net.sf.smbt.ezdxxp.EzdxxpFactory;

public class ChunkProcessorUtils {
	
	public final static ChunkProcessorUtils INSTANCE = new ChunkProcessorUtils();
	
    protected int readSize(String data) {
        return readSize(data, 4);
    }

    protected int readSize(String data, int j) {
        String elength = "";
        for (int i = 0; i < j; i++) {
            elength += ((int) data.charAt(i) > 15 ? "" : "0")
                    + Integer.toHexString((int) data.charAt(i));
        }
        return Integer.valueOf(elength, 16).intValue();
    }

    protected String dataString(byte[] data, int offset, int i) {
        return readString(data, offset, i);
    }

    public String readString(Chunk chunk) {
        return readString(chunk.getData(), chunk.getOffset(), chunk.getSize());
    }
    
    public String readString(byte[] data, int offset, int i) {
    	String a = "";
        try {
            a = new String(data, offset, i, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return a;
    }

    protected int dataInt(byte[] data, int offset) {
        return readInt(data, offset, 4);
    }

    public int readInt(byte[] data, int offset) {
        int i = 0;
        try {
            ByteArrayInputStream b = new ByteArrayInputStream(data, offset, 4);
            DataInputStream d = new DataInputStream(b);
            i = d.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    public int readInt(Chunk chunk) {
    	return readInt(chunk.getData(), chunk.getOffset(), chunk.getSize());
    }
    
    public int readInt(byte[] data, int offset, int size) {
        int i = 0;
        try {
            ByteArrayInputStream b = new ByteArrayInputStream(data, offset,
                    size);
            DataInputStream d = new DataInputStream(b);
            int pow = size * 2 - 1;
            for (int j = 0; j < size; j++) {
                int num = (0xFF & d.readByte());
                int up = ((int) Math.pow(16, pow)) * (num / 16);
                pow--;
                int down = ((int) Math.pow(16, pow)) * (num % 16);
                i += up + down;
                pow--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    public DaapCmd processResponse(DaapCmdResponse response, byte[] data) {
    	process(response, data, 0);
    	return (DaapCmd)response;
    }
    
    protected void process(DaapCmdResponse response, byte[] data, int offset) {
        if (data.length == 0) {
            System.err.println("zero length data!");
            return;
        }
        /*String dataType =*/ dataString(data, offset, 4);
        offset += 4;
        /*int size =*/ dataInt(data, offset);
        offset += 4;
        List<Chunk> fieldPairs = processDataFields(data, offset);
        
        response.getChunks().addAll(fieldPairs);
    }

    protected List<Chunk> processDataFields(byte[] data, int offset) {
    	List<Chunk> fieldPairs = new ArrayList<Chunk>();
        while (offset < data.length) {
            String name = "";
            name = readString(data, offset, 4);
            offset += 4;
            int size = readInt(data, offset);
            offset += 4;
            if (size > 10000000)
                System.out.println("This host probably uses gzip encoding");
            
            Chunk fp = createChunk(data, name, size, offset);
            offset += size;
            fieldPairs.add(fp);
        }
        return fieldPairs;
    }
    
    protected Chunk createChunk(byte[] data, String name, int size, int offset) {
    	Chunk chunk = EzdxxpFactory.eINSTANCE.createChunk();
    	chunk.setName(name);
    	chunk.setData(data);
    	chunk.setSize(size);
    	chunk.setOffset(offset);
    	return chunk;
    }
    
    public Chunk findChunkByName(DaapCmdResponse cmd, String name) {
    	for (Chunk chunk : cmd.getChunks()) {
    		if (chunk.getName() != null && chunk.getName().equals(name)) {
    			return chunk;
    		}
    	}
    	return null;
    }
    
	public double getServerVersion(DaapCmdResponse cmd) {
		Chunk chunk = findChunkByName(cmd, "apro");
		return  new Double(readInt(chunk.getData(), 0, 2)) + (0.01 * new Double(readInt(chunk.getData(), 2, 2)));
	}
}
