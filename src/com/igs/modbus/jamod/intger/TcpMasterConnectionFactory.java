package com.igs.modbus.jamod.intger;

import java.net.UnknownHostException;

import net.wimpi.modbus.net.TCPMasterConnection;

public interface TcpMasterConnectionFactory {

	public TCPMasterConnection createTcpMasterConnection(String hostName,
			int port) throws UnknownHostException;
}