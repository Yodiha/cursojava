package com.curso.java.excepciones;

public class MiExcepcion extends Exception {

	public MiExcepcion(String message) {
		super(message);

	}

	public MiExcepcion(Throwable cause) {
		super(cause);

	}

	public MiExcepcion(String message, Throwable cause) {
		super(message, cause);

	}

	public MiExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public static void metodo1() {// throws se usa para controlar la excepcion
		if (Math.random() > 0.5) {
			MiExcepcion me = new MiExcepcion("esto es un error propio");
		} else {

		}
		//throw me; // para lanzar una excepcion
		// las aexcepcopnes son clases y por eso se pueden crear objetos d ellas
	}
//thread.sleep(500) para deterner y que el sistema se pare unos segundos
	
}
