/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083.util;

import net.sf.smbt.gps.nmea1083.*;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package
 * @generated
 */
public class Nmea1083Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Nmea1083Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nmea1083Switch() {
		if (modelPackage == null) {
			modelPackage = Nmea1083Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Nmea1083Package.NMEA_CMD: {
				NmeaCmd nmeaCmd = (NmeaCmd)theEObject;
				T result = caseNmeaCmd(nmeaCmd);
				if (result == null) result = caseCmd(nmeaCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.AAM: {
				AAM aam = (AAM)theEObject;
				T result = caseAAM(aam);
				if (result == null) result = caseNmeaCmd(aam);
				if (result == null) result = caseCmd(aam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ALM: {
				ALM alm = (ALM)theEObject;
				T result = caseALM(alm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.APA: {
				APA apa = (APA)theEObject;
				T result = caseAPA(apa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.APB: {
				APB apb = (APB)theEObject;
				T result = caseAPB(apb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ASD: {
				ASD asd = (ASD)theEObject;
				T result = caseASD(asd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.BEC: {
				BEC bec = (BEC)theEObject;
				T result = caseBEC(bec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.BOD: {
				BOD bod = (BOD)theEObject;
				T result = caseBOD(bod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.BWC: {
				BWC bwc = (BWC)theEObject;
				T result = caseBWC(bwc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.BWR: {
				BWR bwr = (BWR)theEObject;
				T result = caseBWR(bwr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.BWW: {
				BWW bww = (BWW)theEObject;
				T result = caseBWW(bww);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DBK: {
				DBK dbk = (DBK)theEObject;
				T result = caseDBK(dbk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DBS: {
				DBS dbs = (DBS)theEObject;
				T result = caseDBS(dbs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DBT: {
				DBT dbt = (DBT)theEObject;
				T result = caseDBT(dbt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DPT: {
				DPT dpt = (DPT)theEObject;
				T result = caseDPT(dpt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DSC: {
				DSC dsc = (DSC)theEObject;
				T result = caseDSC(dsc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DSE: {
				DSE dse = (DSE)theEObject;
				T result = caseDSE(dse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DSI: {
				DSI dsi = (DSI)theEObject;
				T result = caseDSI(dsi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DSR: {
				DSR dsr = (DSR)theEObject;
				T result = caseDSR(dsr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.DTM: {
				DTM dtm = (DTM)theEObject;
				T result = caseDTM(dtm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.FSI: {
				FSI fsi = (FSI)theEObject;
				T result = caseFSI(fsi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GBS: {
				GBS gbs = (GBS)theEObject;
				T result = caseGBS(gbs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GGA: {
				GGA gga = (GGA)theEObject;
				T result = caseGGA(gga);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GLC: {
				GLC glc = (GLC)theEObject;
				T result = caseGLC(glc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GLL: {
				GLL gll = (GLL)theEObject;
				T result = caseGLL(gll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GRS: {
				GRS grs = (GRS)theEObject;
				T result = caseGRS(grs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GST: {
				GST gst = (GST)theEObject;
				T result = caseGST(gst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GSA: {
				GSA gsa = (GSA)theEObject;
				T result = caseGSA(gsa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GSV: {
				GSV gsv = (GSV)theEObject;
				T result = caseGSV(gsv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GTD: {
				GTD gtd = (GTD)theEObject;
				T result = caseGTD(gtd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.GXA: {
				GXA gxa = (GXA)theEObject;
				T result = caseGXA(gxa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.HDG: {
				HDG hdg = (HDG)theEObject;
				T result = caseHDG(hdg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.HDM: {
				HDM hdm = (HDM)theEObject;
				T result = caseHDM(hdm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.HDT: {
				HDT hdt = (HDT)theEObject;
				T result = caseHDT(hdt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.HSC: {
				HSC hsc = (HSC)theEObject;
				T result = caseHSC(hsc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.LCD: {
				LCD lcd = (LCD)theEObject;
				T result = caseLCD(lcd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.MSK: {
				MSK msk = (MSK)theEObject;
				T result = caseMSK(msk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.MSS: {
				MSS mss = (MSS)theEObject;
				T result = caseMSS(mss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.MWD: {
				MWD mwd = (MWD)theEObject;
				T result = caseMWD(mwd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.MTW: {
				MTW mtw = (MTW)theEObject;
				T result = caseMTW(mtw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.MWW: {
				MWW mww = (MWW)theEObject;
				T result = caseMWW(mww);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.OLN: {
				OLN oln = (OLN)theEObject;
				T result = caseOLN(oln);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.OSD: {
				OSD osd = (OSD)theEObject;
				T result = caseOSD(osd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ROO: {
				ROO roo = (ROO)theEObject;
				T result = caseROO(roo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RMA: {
				RMA rma = (RMA)theEObject;
				T result = caseRMA(rma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RMB: {
				RMB rmb = (RMB)theEObject;
				T result = caseRMB(rmb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RMC: {
				RMC rmc = (RMC)theEObject;
				T result = caseRMC(rmc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ROT: {
				ROT rot = (ROT)theEObject;
				T result = caseROT(rot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RPM: {
				RPM rpm = (RPM)theEObject;
				T result = caseRPM(rpm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RSA: {
				RSA rsa = (RSA)theEObject;
				T result = caseRSA(rsa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RSD: {
				RSD rsd = (RSD)theEObject;
				T result = caseRSD(rsd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.RTE: {
				RTE rte = (RTE)theEObject;
				T result = caseRTE(rte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.SFI: {
				SFI sfi = (SFI)theEObject;
				T result = caseSFI(sfi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.STN: {
				STN stn = (STN)theEObject;
				T result = caseSTN(stn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.TLL: {
				TLL tll = (TLL)theEObject;
				T result = caseTLL(tll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.TRF: {
				TRF trf = (TRF)theEObject;
				T result = caseTRF(trf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.TTM: {
				TTM ttm = (TTM)theEObject;
				T result = caseTTM(ttm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VBW: {
				VBW vbw = (VBW)theEObject;
				T result = caseVBW(vbw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VDR: {
				VDR vdr = (VDR)theEObject;
				T result = caseVDR(vdr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VHW: {
				VHW vhw = (VHW)theEObject;
				T result = caseVHW(vhw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VLW: {
				VLW vlw = (VLW)theEObject;
				T result = caseVLW(vlw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VPW: {
				VPW vpw = (VPW)theEObject;
				T result = caseVPW(vpw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VTG: {
				VTG vtg = (VTG)theEObject;
				T result = caseVTG(vtg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.VWR: {
				VWR vwr = (VWR)theEObject;
				T result = caseVWR(vwr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.WCV: {
				WCV wcv = (WCV)theEObject;
				T result = caseWCV(wcv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.WDC: {
				WDC wdc = (WDC)theEObject;
				T result = caseWDC(wdc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.WDR: {
				WDR wdr = (WDR)theEObject;
				T result = caseWDR(wdr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.WNC: {
				WNC wnc = (WNC)theEObject;
				T result = caseWNC(wnc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.WPL: {
				WPL wpl = (WPL)theEObject;
				T result = caseWPL(wpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.XDR: {
				XDR xdr = (XDR)theEObject;
				T result = caseXDR(xdr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.XTE: {
				XTE xte = (XTE)theEObject;
				T result = caseXTE(xte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.XTR: {
				XTR xtr = (XTR)theEObject;
				T result = caseXTR(xtr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ZDA: {
				ZDA zda = (ZDA)theEObject;
				T result = caseZDA(zda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ZDL: {
				ZDL zdl = (ZDL)theEObject;
				T result = caseZDL(zdl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ZFO: {
				ZFO zfo = (ZFO)theEObject;
				T result = caseZFO(zfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Nmea1083Package.ZTG: {
				ZTG ztg = (ZTG)theEObject;
				T result = caseZTG(ztg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nmea Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nmea Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNmeaCmd(NmeaCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AAM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AAM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAM(AAM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALM(ALM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPA(APA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPB(APB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASD(ASD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BEC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BEC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBEC(BEC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOD(BOD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWC(BWC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWR(BWR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWW(BWW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBK(DBK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBS(DBS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBT(DBT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPT(DPT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSC(DSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSE(DSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSI(DSI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSR(DSR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTM(DTM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFSI(FSI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBS(GBS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GGA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GGA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGGA(GGA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GLC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GLC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGLC(GLC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GLL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GLL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGLL(GLL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRS(GRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGST(GST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSA(GSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSV(GSV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTD(GTD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GXA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GXA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGXA(GXA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDG(HDG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDM(HDM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDT(HDT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSC(HSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLCD(LCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSK(MSK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSS(MSS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWD(MWD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTW(MTW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MWW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MWW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWW(MWW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OLN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OLN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOLN(OLN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSD(OSD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROO(ROO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMA(RMA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMB(RMB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMC(RMC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROT(ROT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPM(RPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSA(RSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSD(RSD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTE(RTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFI(SFI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTN(STN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLL(TLL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRF(TRF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTM(TTM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VBW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VBW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVBW(VBW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDR(VDR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VHW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VHW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVHW(VHW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLW(VLW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPW(VPW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTG(VTG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VWR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VWR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVWR(VWR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCV(WCV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WDC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WDC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWDC(WDC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WDR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WDR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWDR(WDR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNC(WNC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPL(WPL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDR(XDR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTE(XTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTR(XTR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZDA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZDA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZDA(ZDA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZDL(ZDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZFO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZFO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZFO(ZFO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZTG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZTG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZTG(ZTG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Nmea1083Switch
