package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ExceptionResponse;
import net.wimpi.modbus.msg.ModbusResponse;

import com.igs.modbus.cci.ResponseRecord;

public class ModbusExceptionResponseRecord extends AbstractModbusRecord
		implements ResponseRecord {

	private static final long serialVersionUID = 1597550994382295562L;

	private ExceptionResponse exceptionResponse;

	@Override
	public void warpResponse(ModbusResponse response) {
		this.exceptionResponse = (ExceptionResponse) response;

	}

	public int getExceptionCode() {
		return exceptionResponse.getExceptionCode();
	}
}
