package test;

import javax.resource.cci.Connection;
import javax.resource.cci.Interaction;

import net.wimpi.modbus.Modbus;

import com.igs.modbus.cci.ModbusConnectionFactory;
import com.igs.modbus.cci.ModbusConnectionSpec;
import com.igs.modbus.cci.ModbusInteractionSpec;
import com.igs.modbus.cci.record.WriteCoilRequestRecord;

public class Test {

	public static void main(String[] args) throws Exception {

		ModbusConnectionFactory connectionFactory = new ModbusConnectionFactory();

		Connection connection = connectionFactory
				.getConnection(new ModbusConnectionSpec("10.45.19.32"));

		Interaction interaction = connection.createInteraction();

		interaction.execute(new ModbusInteractionSpec(Modbus.WRITE_COIL),
				new WriteCoilRequestRecord(0x01, true));

		interaction.close();

		connection.close();
	}
}
