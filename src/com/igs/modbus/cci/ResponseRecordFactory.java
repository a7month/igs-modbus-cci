package com.igs.modbus.cci;

import javax.resource.ResourceException;

public interface ResponseRecordFactory {
	public ResponseRecord createResponseRecord(int functionId)
			throws ResourceException;
}
