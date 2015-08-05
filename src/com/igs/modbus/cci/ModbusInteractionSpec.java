package com.igs.modbus.cci;

import javax.resource.cci.InteractionSpec;

public class ModbusInteractionSpec implements InteractionSpec {

	private static final long serialVersionUID = 7579171312459927296L;

	private int functionId;

	public ModbusInteractionSpec(int functionId) {
		super();
		this.functionId = functionId;
	}

	public int getFunctionId() {
		return functionId;
	}

	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}

}
