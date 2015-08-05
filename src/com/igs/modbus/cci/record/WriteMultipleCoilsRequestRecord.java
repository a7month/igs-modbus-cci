package com.igs.modbus.cci.record;

import net.wimpi.modbus.msg.ModbusRequest;
import net.wimpi.modbus.msg.WriteMultipleCoilsRequest;
import net.wimpi.modbus.util.BitVector;

import com.igs.modbus.cci.RequestRecord;

public class WriteMultipleCoilsRequestRecord extends AbstractModbusRecord
		implements RequestRecord {

	private static final long serialVersionUID = 7928075948569632195L;

	private WriteMultipleCoilsRequest writeMultipleCoilsRequest;

	public WriteMultipleCoilsRequestRecord() {
		this.writeMultipleCoilsRequest = new WriteMultipleCoilsRequest();
	}

	public WriteMultipleCoilsRequestRecord(int ref, int count) {
		this.writeMultipleCoilsRequest = new WriteMultipleCoilsRequest(ref,
				count);
	}

	public WriteMultipleCoilsRequestRecord(int ref, BitVector bv) {
		this.writeMultipleCoilsRequest = new WriteMultipleCoilsRequest(ref, bv);
	}

	public WriteMultipleCoilsRequestRecord(int ref, boolean... coils) {
		this.writeMultipleCoilsRequest = new WriteMultipleCoilsRequest(ref,
				coils.length);
		this.setCoilStatus(coils);
	}

	public void setCoils(BitVector bv) {
		this.writeMultipleCoilsRequest.setCoils(bv);
	}

	public void setCoilStatus(int index, boolean b)
			throws IndexOutOfBoundsException {
		this.writeMultipleCoilsRequest.setCoilStatus(index, b);
	}

	public void setCoilStatus(boolean... coils) {
		for (int i = 0; i < coils.length; i++) {
			setCoilStatus(i++, coils[i]);
		}
	}

	public void setReference(int ref) {
		this.writeMultipleCoilsRequest.setReference(ref);
	}

	@Override
	public ModbusRequest getRequest() {
		return writeMultipleCoilsRequest;
	}
}
