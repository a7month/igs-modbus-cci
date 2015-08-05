package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusRequest;
import net.wimpi.modbus.msg.ReadMultipleRegistersRequest;

import com.igs.modbus.cci.RequestRecord;

public class ReadMultipleRegistersRequestRecord extends AbstractModbusRecord
		implements RequestRecord {

	private static final long serialVersionUID = -7401222340763038028L;

	private ReadMultipleRegistersRequest readMultipleRegistersRequest;

	public ReadMultipleRegistersRequestRecord(int ref, int count) {
		this.readMultipleRegistersRequest = new ReadMultipleRegistersRequest(
				ref, count);
	}

	@Override
	public ModbusRequest getRequest() {
		return readMultipleRegistersRequest;
	}

}
