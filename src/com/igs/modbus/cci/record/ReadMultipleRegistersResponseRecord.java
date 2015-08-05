package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusResponse;
import net.wimpi.modbus.msg.ReadMultipleRegistersResponse;
import net.wimpi.modbus.procimg.Register;

import com.igs.modbus.cci.ResponseRecord;

public class ReadMultipleRegistersResponseRecord extends AbstractModbusRecord
		implements ResponseRecord {

	private static final long serialVersionUID = -3196901758236365722L;

	private ReadMultipleRegistersResponse readMultipleRegistersResponse;

	public int getRegistersCount() {
		return this.readMultipleRegistersResponse.getWordCount();
	}

	public Register[] getRegisters() {
		return this.readMultipleRegistersResponse.getRegisters();
	}

	@Override
	public void warpResponse(ModbusResponse response) {
		this.readMultipleRegistersResponse = (ReadMultipleRegistersResponse) response;
	}

}
