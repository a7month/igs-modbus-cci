package com.igs.modbus.cci;

import java.net.UnknownHostException;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.resource.NotSupportedException;
import javax.resource.ResourceException;
import javax.resource.cci.Connection;
import javax.resource.cci.ConnectionFactory;
import javax.resource.cci.ConnectionSpec;
import javax.resource.cci.RecordFactory;
import javax.resource.cci.ResourceAdapterMetaData;
import javax.resource.spi.ResourceAllocationException;

import com.igs.modbus.jamod.intger.DefaultTcpMasterConnectionFactory;
import com.igs.modbus.jamod.intger.TcpMasterConnectionFactory;

import net.wimpi.modbus.net.TCPMasterConnection;

public class ModbusConnectionFactory implements ConnectionFactory {

	private static final long serialVersionUID = -6487525760128478180L;

	private RecordFactory recordFactory = new ModbusRecordFactory();
	private TcpMasterConnectionFactory tcpMasterConnectionFactory = new DefaultTcpMasterConnectionFactory();

	@Override
	public Connection getConnection(ConnectionSpec connectionSpec)
			throws ResourceException {

		ModbusConnectionSpec modbusConnectionSpec = (ModbusConnectionSpec) connectionSpec;

		TCPMasterConnection tcpMasterConnection = null;

		try {
			tcpMasterConnection = tcpMasterConnectionFactory
					.createTcpMasterConnection(
							modbusConnectionSpec.getHostName(),
							modbusConnectionSpec.getPort());
		} catch (UnknownHostException e) {
			throw new ResourceAllocationException(e);
		}

		return new ModbusConnection(tcpMasterConnection, this);
	}

	@Override
	public RecordFactory getRecordFactory() throws ResourceException {
		return recordFactory;
	}

	// ---------------------------
	@Override
	public void setReference(Reference arg0) {

	}

	@Override
	public Reference getReference() throws NamingException {
		return null;
	}

	@Override
	public Connection getConnection() throws ResourceException {
		throw new NotSupportedException();
	}

	@Override
	public ResourceAdapterMetaData getMetaData() throws ResourceException {
		return null;
	}

	// ---------------------

}
