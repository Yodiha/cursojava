package com.curso.java.poo.herencia;

public class Tambor extends Instrumento {
	private String material;

	public Tambor(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
	}

	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo, afinado);
		this.material = material;
	}

	@Override
	public void limpiar() {
		System.out.println("el tambor se esta limpiando con grasa de caballo");

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void aporrear() {
		System.out.println("apaorrear el tambor");
	}

	@Override
	public void afinar() {
		super.setAfinado(true);
		System.out.println("siempre afinado");
	}

}
