package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusResponse;
import net.wimpi.modbus.msg.WriteSingleRegisterResponse;

import com.igs.modbus.cci.ResponseRecord;

public class WriteSingleRegisterResponseRecord extends AbstractModbusRecord
		implements ResponseRecord {

	private static final long serialVersionUID = -2654553042309771603L;

	private WriteSingleRegisterResponse writeSingleRegisterResponse;

	@Override
	public void warpResponse(ModbusResponse response) {
		writeSingleRegisterResponse = (WriteSingleRegisterResponse) response;
	}

	public int getResigserValue() {
		return writeSingleRegisterResponse.getRegisterValue();
	}

}
