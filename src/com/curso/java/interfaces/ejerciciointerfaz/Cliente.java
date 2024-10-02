package com.curso.java.interfaces.ejerciciointerfaz;

public class Cliente {
	private String nombre;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
