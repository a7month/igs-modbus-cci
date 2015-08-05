package com.igs.modbus.cci.record;

import com.igs.modbus.cci.ModbusRecord;


abstract class AbstractModbusRecord implements ModbusRecord {

	private static final long serialVersionUID = -1691997781401495756L;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String getRecordName() {
		return null;
	}

	@Override
	public String getRecordShortDescription() {
		return null;
	}

	@Override
	public void setRecordName(String arg0) {
	}

	@Override
	public void setRecordShortDescription(String arg0) {
	}

}
