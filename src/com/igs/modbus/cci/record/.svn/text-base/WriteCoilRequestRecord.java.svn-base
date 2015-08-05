package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusRequest;
import net.wimpi.modbus.msg.WriteCoilRequest;

import com.igs.modbus.cci.RequestRecord;

public class WriteCoilRequestRecord extends AbstractModbusRecord implements
		RequestRecord {

	private static final long serialVersionUID = 7402135363172290878L;

	private WriteCoilRequest writeCoilRequest;

	public WriteCoilRequestRecord() {
		this.writeCoilRequest = new WriteCoilRequest();
	}

	public WriteCoilRequestRecord(int ref, boolean b) {
		this.writeCoilRequest = new WriteCoilRequest(ref, b);
	}

	public void setReference(int ref) {
		this.writeCoilRequest.setReference(ref);
	}

	public void setCoil(boolean coil) {
		this.writeCoilRequest.setCoil(coil);
	}

	@Override
	public ModbusRequest getRequest() {
		return writeCoilRequest;
	}
}
