package com.igs.modbus.cci;

import javax.resource.ResourceException;
import javax.resource.cci.Connection;
import javax.resource.cci.ConnectionMetaData;
import javax.resource.cci.Interaction;
import javax.resource.cci.LocalTransaction;
import javax.resource.cci.ResultSetInfo;

import net.wimpi.modbus.net.TCPMasterConnection;

public class ModbusConnection implements Connection, AutoCloseable {

	private TCPMasterConnection tcpMasterConnection;

	private ModbusConnectionFactory modbusConnectionFactory;

	public ModbusConnection(TCPMasterConnection tcpMasterConnection,
			ModbusConnectionFactory modbusConnectionFactory) {
		this.tcpMasterConnection = tcpMasterConnection;
		this.modbusConnectionFactory = modbusConnectionFactory;
	}

	@Override
	public void close() throws ResourceException {
		this.tcpMasterConnection.close();
	}

	@Override
	public Interaction createInteraction() throws ResourceException {
		return new ModbusInteraction(this);
	}

	@Override
	public LocalTransaction getLocalTransaction() throws ResourceException {
		return null;
	}

	@Override
	public ConnectionMetaData getMetaData() throws ResourceException {
		return null;
	}

	@Override
	public ResultSetInfo getResultSetInfo() throws ResourceException {
		return null;
	}

	public TCPMasterConnection getTCPMasterConnection() {
		return this.tcpMasterConnection;
	}

	public ModbusRecordFactory getModbusRecordFactory()
			throws ResourceException {
		return (ModbusRecordFactory) this.modbusConnectionFactory
				.getRecordFactory();
	}
}
