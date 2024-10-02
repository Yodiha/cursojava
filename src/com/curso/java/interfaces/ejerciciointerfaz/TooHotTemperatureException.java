package com.curso.java.interfaces.ejerciciointerfaz;

public class TooHotTemperatureException extends TemperatureException {

	public TooHotTemperatureException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TooHotTemperatureException [toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
