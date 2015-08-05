package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusResponse;
import net.wimpi.modbus.msg.WriteCoilResponse;

import com.igs.modbus.cci.ResponseRecord;

public class WriteCoilResponseRecord extends AbstractModbusRecord implements
		ResponseRecord {

	private static final long serialVersionUID = 7402135363172290878L;

	private WriteCoilResponse writeCoilResponse;
	
	@Override
	public void warpResponse(ModbusResponse response) {
		this.writeCoilResponse = (WriteCoilResponse) response;
	}

	public boolean getCoil() {
		return writeCoilResponse.getCoil();
	}
}
