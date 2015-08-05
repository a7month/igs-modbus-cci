package com.igs.modbus.jamod.editor;

import java.beans.PropertyEditorSupport;

import net.wimpi.modbus.util.BitVector;

public class BitVectorEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {

		Object o = getValue();

		if (o == null) {
			return "[]";
		}

		BitVector bv = (BitVector) getValue();

		StringBuilder sb = new StringBuilder();
		sb.append('[');

		for (int i = 0; i < bv.byteSize(); i++) {
			sb.append(bv.getBit(i)).append(',');
		}

		return sb.deleteCharAt(sb.lastIndexOf(",")).append(']').toString();

	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String t = text.trim();
		if (!(t.startsWith("[") && t.endsWith("]"))) {
			throw new IllegalArgumentException();
		}

		t = t.substring(1, t.length() - 1);

		String[] ts = t.split(",");
		BitVector bv = new BitVector(ts.length);

		int i = 0;
		for (String s : ts) {
			bv.setBit(i, toBoolean(s));
		}

		setValue(bv);
	}

	private boolean toBoolean(String s) {
		if (s.equalsIgnoreCase("f") || s.equalsIgnoreCase("0")
				|| s.equalsIgnoreCase("off") || s.equalsIgnoreCase("false")) {
			return false;
		}
		return true;
	}
}
