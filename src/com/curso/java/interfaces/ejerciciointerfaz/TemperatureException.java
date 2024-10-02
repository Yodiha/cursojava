package com.curso.java.interfaces.ejerciciointerfaz;

public class TemperatureException extends Exception {

	public TemperatureException(String message) {
		super(message);

	}

//	@Override
//	public String toString() {
//		return "TemperatureException [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//
//	}

//	public static void TemperatureException() throws MiExcepcion1 {
//
//		if (Math.random() > 0.99) {
//			MiExcepcion1 H = new MiExcepcion1("Esto es un error propio");
//			throw H;
//
//		} else {
//			NullPointerException YO = new NullPointerException("NullPointer creado por mi");
//			throw YO;
//
//			try {
//				TemperatureException();
//			} catch (MiExcepcion1 t) {
//				t.printStackTrace();
//
//			}
//
//			System.out.println("Fin");
//			{
//
//			}
//		}
//	}
}
