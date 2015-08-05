package com.igs.modbus.cci;

import javax.resource.NotSupportedException;
import javax.resource.ResourceException;
import javax.resource.cci.Connection;
import javax.resource.cci.Interaction;
import javax.resource.cci.InteractionSpec;
import javax.resource.cci.Record;
import javax.resource.cci.ResourceWarning;

import net.wimpi.modbus.ModbusException;
import net.wimpi.modbus.io.ModbusTCPTransaction;
import net.wimpi.modbus.msg.ModbusResponse;
import net.wimpi.modbus.net.TCPMasterConnection;

public class ModbusInteraction implements Interaction, AutoCloseable {

	private ModbusConnection connection;
	private TCPMasterConnection tcpMasterConnection;
	private ModbusTCPTransaction transaction;
	private ModbusRecordFactory recordFactory;

	public ModbusInteraction(ModbusConnection connection)
			throws ResourceException {
		this.connection = connection;
		this.tcpMasterConnection = connection.getTCPMasterConnection();
		this.transaction = new ModbusTCPTransaction(tcpMasterConnection);
		this.recordFactory = connection.getModbusRecordFactory();
	}

	@Override
	public void clearWarnings() throws ResourceException {

	}

	@Override
	public void close() throws ResourceException {
		// ~~
	}

	@Override
	public Record execute(InteractionSpec interactionSpec, Record record)
			throws ResourceException {

		ModbusInteractionSpec modbusConnectionSpec = (ModbusInteractionSpec) interactionSpec;

		RequestRecord requestRecord = (RequestRecord) record;

		transaction.setRequest(requestRecord.getRequest());

		try {
			transaction.execute();
		} catch (ModbusException e) {
			throw new ResourceWarning(e);
		}

		ModbusResponse response = transaction.getResponse();

		ResponseRecord responseRecord = recordFactory
				.createResponseRecord(modbusConnectionSpec.getFunctionId());

		responseRecord.warpResponse(response);
		return responseRecord;
	}

	@Override
	public boolean execute(InteractionSpec interactionSpec, Record inRecord,
			Record outRecord) throws ResourceException {
		throw new NotSupportedException();
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	@Override
	public ResourceWarning getWarnings() throws ResourceException {
		return null;
	}
}
