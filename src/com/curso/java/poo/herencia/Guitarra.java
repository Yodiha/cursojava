package com.curso.java.poo.herencia;

public class Guitarra extends Instrumento {
	int  numCuerdas;

	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo, afinado);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	@Override
	public void afinar() {
		super.afinar();
		System.out.println("Guitarra afinada");
	}

	@Override
	public void limpiar() {
		System.out.println("Guitarra "+getNombre()+ "se esta limpiando con un pañito");
		
	}
		
	}

