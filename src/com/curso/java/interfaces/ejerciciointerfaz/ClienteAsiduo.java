package com.curso.java.interfaces.ejerciciointerfaz;

public class ClienteAsiduo extends Cliente {

	public ClienteAsiduo(String nombre) {
		super(nombre);

	}

	@Override
	public String toString() {

		return super.toString();
	}

	public void tomarCafe(TazaDeCafe tazadecafe) {
		System.out.println(" El cliente fiel de " + getNombre());
	}

}