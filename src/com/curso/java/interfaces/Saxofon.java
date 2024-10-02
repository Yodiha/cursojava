package com.curso.java.interfaces;

import com.curso.java.poo.herencia.Instrumento;

public class Saxofon extends Instrumento  implements Interfaz3{

	public Saxofon(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub

	}

}
