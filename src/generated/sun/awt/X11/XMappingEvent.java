// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XMappingEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return ((XlibWrapper.dataModel == 32)?(32):(56)); }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XMappingEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XMappingEvent() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(4):(8)))); }
	public void set_serial(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(4):(8)), v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+((XlibWrapper.dataModel == 32)?(8):(16)))); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+((XlibWrapper.dataModel == 32)?(8):(16)), v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(12):(24)))); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(12):(24)), v); }
	public long get_window() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(16):(32)))); }
	public void set_window(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(16):(32)), v); }
	public int get_request() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(20):(40)))); }
	public void set_request(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(20):(40)), v); }
	public int get_first_keycode() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(24):(44)))); }
	public void set_first_keycode(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(24):(44)), v); }
	public int get_count() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(28):(48)))); }
	public void set_count(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(28):(48)), v); }


	String getName() {
		return "XMappingEvent"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"type = " + XlibWrapper.eventToString[get_type()] +", ";
		ret += ""+"serial = " + get_serial() +", ";
		ret += ""+"send_event = " + get_send_event() +", ";
		ret += ""+"display = " + get_display() +", ";
		ret += ""+"window = " + getWindow(get_window()) + ", ";
		ret += ""+"request = " + get_request() +", ";
		ret += ""+"first_keycode = " + get_first_keycode() +", ";
		ret += ""+"count = " + get_count() +", ";
		return ret;
	}


}



