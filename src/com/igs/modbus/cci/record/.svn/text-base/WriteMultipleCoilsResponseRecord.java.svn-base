package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusResponse;
import net.wimpi.modbus.msg.WriteMultipleCoilsResponse;

import com.igs.modbus.cci.ResponseRecord;

public class WriteMultipleCoilsResponseRecord extends AbstractModbusRecord
		implements ResponseRecord {

	private static final long serialVersionUID = 7402135363172290878L;

	private WriteMultipleCoilsResponse writeMultipleCoilsResponse;

	@Override
	public void warpResponse(ModbusResponse response) {
		this.writeMultipleCoilsResponse = (WriteMultipleCoilsResponse) response;
	}

	public int getBitCount() {
		return writeMultipleCoilsResponse.getBitCount();
	}
}
