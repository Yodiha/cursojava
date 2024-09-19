package com.curso.java.poo.ejercicos2;

public class Maniqui {
	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;

	public Maniqui(int id) {
		this.id = id;
	}

	public Maniqui(int id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;

	}

	public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
		this.id = id;
		this.camisa = camisa;
		this.vestido = vestido;
	}

	// public Maniqui(int id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
	// this.id = id;
	// this.vestido = vestido;
	// this.pantalon = pantalon;
	// this.camisa = camisa;
	// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;

	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public void desvstir() {
		this.vestido = null;
		this.camisa = null;
		this.pantalon = null;

	}
	public Camisa getCamisa() {
        return camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}
}


	
	

