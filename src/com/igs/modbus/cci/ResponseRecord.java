package com.igs.modbus.cci;

import net.wimpi.modbus.msg.ModbusResponse;

public interface ResponseRecord extends ModbusRecord {
	public void warpResponse(ModbusResponse response);
}
