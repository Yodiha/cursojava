package com.curso.java.poo.ejercicos2;

public class Camisa {
	private String color;
	private String talla;
	private double precio;
	private Boton[] botones;

	public Camisa(String color, String talla, double precio, Boton[] botones) {
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Camisa(String color, String talla, double precio) {

		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

}
