package com.igs.modbus.cci;

import javax.resource.spi.ResourceAdapterInternalException;

import net.wimpi.modbus.msg.ExceptionResponse;

public class ModbusResponseException extends ResourceAdapterInternalException {

	private static final long serialVersionUID = -259915925901523309L;

	private int exceptionCode;

	public ModbusResponseException(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public ModbusResponseException(ExceptionResponse response) {
		this.exceptionCode = response.getExceptionCode();
	}

	public int getExceptionCode() {
		return this.exceptionCode;
	}
}
