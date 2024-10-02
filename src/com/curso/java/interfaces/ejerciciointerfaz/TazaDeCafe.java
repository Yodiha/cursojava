package com.curso.java.interfaces.ejerciciointerfaz;

public class TazaDeCafe {
	private String tipodecafe;
	private int temperatura;

	public TazaDeCafe() {

	}

	public TazaDeCafe(String tipodecafe, int temperatura) {
		super();
		this.tipodecafe = tipodecafe;
		this.temperatura = temperatura;
	}

	public String getTipodecafe() {
		return tipodecafe;

	}

	public void setTipodecafe(String tipodecafe) {
		this.tipodecafe = tipodecafe;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
