package com.curso.java.poo.herencia;

public class Piano extends Instrumento {
	private int numeroOctavas;
	private String tipopiano;

	public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipopiano) {
		super(nombre, tipo, afinado);
		this.numeroOctavas = numeroOctavas;
		this.tipopiano = tipopiano;
	}

	public int getNumeroOctavas() {
		return numeroOctavas;
	}

	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}

	public String getTipopiano() {
		return tipopiano;
	}

	public void setTipopiano(String tipopiano) {
		this.tipopiano = tipopiano;
	}

	{

	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}
}
