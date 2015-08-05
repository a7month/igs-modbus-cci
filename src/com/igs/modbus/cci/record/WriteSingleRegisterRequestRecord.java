package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusRequest;
import net.wimpi.modbus.msg.WriteSingleRegisterRequest;
import net.wimpi.modbus.procimg.Register;
import net.wimpi.modbus.procimg.SimpleRegister;

import com.igs.modbus.cci.RequestRecord;

public class WriteSingleRegisterRequestRecord extends AbstractModbusRecord
		implements RequestRecord {

	private static final long serialVersionUID = 7402135363172290878L;

	private WriteSingleRegisterRequest writeSingleRegisterRequest;

	public WriteSingleRegisterRequestRecord() {
		this.writeSingleRegisterRequest = new WriteSingleRegisterRequest();
	}

	public WriteSingleRegisterRequestRecord(int ref, Register register) {
		this.writeSingleRegisterRequest = new WriteSingleRegisterRequest(ref,
				register);
	}

	public WriteSingleRegisterRequestRecord(int ref, int value) {
		this.writeSingleRegisterRequest = new WriteSingleRegisterRequest(ref,
				new SimpleRegister(value));
	}

	@Override
	public ModbusRequest getRequest() {
		return writeSingleRegisterRequest;
	}
}
