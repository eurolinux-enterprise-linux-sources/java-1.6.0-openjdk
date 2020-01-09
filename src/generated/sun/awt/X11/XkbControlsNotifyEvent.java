// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XkbControlsNotifyEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 72; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XkbControlsNotifyEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XkbControlsNotifyEvent() {
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
	public long get_serial() { log.finest("");return (Native.getULong(pData+8)); }
	public void set_serial(long v) { log.finest(""); Native.putULong(pData+8, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+16)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+16, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+32)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+32, v); }
	public int get_xkb_type() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_xkb_type(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public int get_device() { log.finest("");return (Native.getInt(pData+44)); }
	public void set_device(int v) { log.finest(""); Native.putInt(pData+44, v); }
	public int get_changed_ctrls() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_changed_ctrls(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_enabled_ctrls() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_enabled_ctrls(int v) { log.finest(""); Native.putInt(pData+52, v); }
	public int get_enabled_ctrl_changes() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_enabled_ctrl_changes(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public int get_num_groups() { log.finest("");return (Native.getInt(pData+60)); }
	public void set_num_groups(int v) { log.finest(""); Native.putInt(pData+60, v); }
	public int get_keycode() { log.finest("");return (Native.getInt(pData+64)); }
	public void set_keycode(int v) { log.finest(""); Native.putInt(pData+64, v); }
	public byte get_event_type() { log.finest("");return (Native.getByte(pData+65)); }
	public void set_event_type(byte v) { log.finest(""); Native.putByte(pData+65, v); }
	public byte get_req_major() { log.finest("");return (Native.getByte(pData+66)); }
	public void set_req_major(byte v) { log.finest(""); Native.putByte(pData+66, v); }
	public byte get_req_minor() { log.finest("");return (Native.getByte(pData+67)); }
	public void set_req_minor(byte v) { log.finest(""); Native.putByte(pData+67, v); }


	String getName() {
		return "XkbControlsNotifyEvent"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"type = " + XlibWrapper.eventToString[get_type()] +", ";
		ret += ""+"serial = " + get_serial() +", ";
		ret += ""+"send_event = " + get_send_event() +", ";
		ret += ""+"display = " + get_display() +", ";
		ret += ""+"time = " + get_time() +", ";
		ret += ""+"xkb_type = " + get_xkb_type() +", ";
		ret += ""+"device = " + get_device() +", ";
		ret += ""+"changed_ctrls = " + get_changed_ctrls() +", ";
		ret += ""+"enabled_ctrls = " + get_enabled_ctrls() +", ";
		ret += ""+"enabled_ctrl_changes = " + get_enabled_ctrl_changes() +", ";
		ret += ""+"num_groups = " + get_num_groups() +", ";
		ret += ""+"keycode = " + get_keycode() +", ";
		ret += ""+"event_type = " + get_event_type() +", ";
		ret += ""+"req_major = " + get_req_major() +", ";
		ret += ""+"req_minor = " + get_req_minor() +", ";
		return ret;
	}


}



