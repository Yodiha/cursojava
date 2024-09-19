package com.curso.java.poo.ejercicos2;

public class Boton {
	private String forma;
	private String color;
	private String tamanio;
	

	
	public Boton() {

	}

	public Boton(String forma, String color, String tamanio) {

		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

}
