// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XClientMessageEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return ((XlibWrapper.dataModel == 32)?(48):(96)); }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XClientMessageEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XClientMessageEvent() {
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
	public long get_message_type() { log.finest("");return (Native.getLong(pData+((XlibWrapper.dataModel == 32)?(20):(40)))); }
	public void set_message_type(long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(20):(40)), v); }
	public int get_format() { log.finest("");return (Native.getInt(pData+((XlibWrapper.dataModel == 32)?(24):(48)))); }
	public void set_format(int v) { log.finest(""); Native.putInt(pData+((XlibWrapper.dataModel == 32)?(24):(48)), v); }
	public long get_data(int index) { log.finest("");return Native.getLong(pData + ((XlibWrapper.dataModel == 32)?(28):(56))+index*Native.getLongSize()); }
	public void set_data(int index, long v) { log.finest(""); Native.putLong(pData+((XlibWrapper.dataModel == 32)?(28):(56)) + index*Native.getLongSize(), v); }
	public long get_data() { log.finest("");return pData+((XlibWrapper.dataModel == 32)?(28):(56)); }


	String getName() {
		return "XClientMessageEvent"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"type = " + XlibWrapper.eventToString[get_type()] +", ";
		ret += ""+"serial = " + get_serial() +", ";
		ret += ""+"send_event = " + get_send_event() +", ";
		ret += ""+"display = " + get_display() +", ";
		ret += ""+"window = " + getWindow(get_window()) + ", ";
		ret += ""+"message_type = " + XAtom.get(get_message_type()) +", ";
		ret += ""+"format = " + get_format() +", ";
		ret += "{" + get_data(0) + " " + get_data(1) + " " + get_data(2) + " " + get_data(3) + " " + get_data(4) + " " + "}";
		return ret;
	}


}



