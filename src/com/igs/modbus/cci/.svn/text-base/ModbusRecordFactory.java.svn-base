package com.igs.modbus.cci;

import javax.resource.ResourceException;
import javax.resource.cci.IndexedRecord;
import javax.resource.cci.MappedRecord;
import javax.resource.cci.RecordFactory;

import net.wimpi.modbus.Modbus;

import com.igs.modbus.cci.record.ModbusExceptionResponseRecord;
import com.igs.modbus.cci.record.ReadMultipleRegistersResponseRecord;
import com.igs.modbus.cci.record.WriteCoilResponseRecord;
import com.igs.modbus.cci.record.WriteMultipleCoilsResponseRecord;
import com.igs.modbus.cci.record.WriteSingleRegisterResponseRecord;

public class ModbusRecordFactory implements RequestRecordFactory,
		ResponseRecordFactory, RecordFactory {

	@Override
	public IndexedRecord createIndexedRecord(String name)
			throws ResourceException {
		throw new ResourceException();
	}

	@Override
	public MappedRecord createMappedRecord(String name)
			throws ResourceException {
		throw new ResourceException();
	}

	@Override
	public RequestRecord createRequestRecord(int functionId)
			throws ResourceException {
		throw new ResourceException();
	}

	@Override
	public ResponseRecord createResponseRecord(int functionId)
			throws ResourceException {

		ResponseRecord response = null;

		switch (functionId) {
		case Modbus.WRITE_COIL:
			response = new WriteCoilResponseRecord();
			break;
		case Modbus.WRITE_MULTIPLE_COILS:
			response = new WriteMultipleCoilsResponseRecord();
			break;
		case Modbus.READ_MULTIPLE_REGISTERS:
			response = new ReadMultipleRegistersResponseRecord();
			break;
		case Modbus.WRITE_SINGLE_REGISTER:
			response = new WriteSingleRegisterResponseRecord();
			break;
		default:
			response = new ModbusExceptionResponseRecord();
			break;
		}

		return response;
	}

}
