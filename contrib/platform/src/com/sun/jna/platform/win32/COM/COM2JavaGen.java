package com.sun.jna.platform.win32.COM;

import com.sun.jna.WString;
import com.sun.jna.platform.win32.OleAuto;
import com.sun.jna.platform.win32.WinDef.LCID;
import com.sun.jna.platform.win32.WinDef.UINT;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.PointerByReference;

public class COM2JavaGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			WString szFile = new WString("C:\\Program Files (x86)\\Microsoft Office\\Office12\\MSWORD.OLB");
			PointerByReference ppTInfo = new PointerByReference();
			OleAuto.INSTANCE.LoadTypeLib(szFile, ppTInfo);
			
			ITypeLib iTypeLib = new ITypeLib(ppTInfo.getValue());
			UINT typeInfoCount = iTypeLib.GetTypeInfoCount();
			
			
			
//			COMObject comObject = new COMObject("Shell.Application", false);
//			IDispatch iDispatch = comObject.getIDispatch();
//
//			PointerByReference ppTInfo = new PointerByReference();
//			HRESULT hr = iDispatch.GetTypeInfo(new UINT(0), new LCID(0),
//					ppTInfo);
//
//			COMUtils.checkAutoRC(hr);
//			ITypeInfo iTypeInfo = new ITypeInfo(ppTInfo.getValue());
			
			System.out.println("end.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}