package com.igs.modbus.cci;

import javax.resource.cci.ConnectionSpec;

import net.wimpi.modbus.Modbus;

public class ModbusConnectionSpec implements ConnectionSpec {

	private String userName;
	private String hostName;
	private int port;

	public ModbusConnectionSpec() {

	}

	public ModbusConnectionSpec(String userName, String hostName, int port) {
		super();
		this.userName = userName;
		this.hostName = hostName;
		this.port = port;
	}

	public ModbusConnectionSpec(String hostName) {
		this(null, hostName, Modbus.DEFAULT_PORT);
	}

	public ModbusConnectionSpec(String hostName, int port) {
		this(null, hostName, port);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
