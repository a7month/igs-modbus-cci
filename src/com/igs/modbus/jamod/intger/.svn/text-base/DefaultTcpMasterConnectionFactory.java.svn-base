package com.igs.modbus.jamod.intger;

import java.net.InetAddress;
import java.net.UnknownHostException;

import net.wimpi.modbus.net.TCPMasterConnection;

public class DefaultTcpMasterConnectionFactory implements
		TcpMasterConnectionFactory {

	@Override
	public TCPMasterConnection createTcpMasterConnection(String hostName,
			int port) throws UnknownHostException {

		InetAddress inetAddress = InetAddress.getByName(hostName);

		TCPMasterConnection connection = new TCPMasterConnection(inetAddress);
		connection.setPort(port);

		return connection;
	}
}
