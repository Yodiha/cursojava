package com.curso.java.interfaces.ejerciciointerfaz;

public class Huesped extends Cliente {
	private String dni;

	public Huesped(String nombre) {
		super(nombre);

	}

	public Huesped(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
