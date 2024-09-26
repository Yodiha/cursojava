package com.curso.java.poo.herencia;

public abstract class Instrumento {
	private String nombre;
	private String tipo;
	private boolean afinado;

	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", afinado=" + afinado + "]";
	}

	public void afinar() {
		System.out.println("afinando instrumento " + nombre);
		double numeroAleatorio = Math.random();
		if (numeroAleatorio > 0.4) {
			afinado = true;
		} else
			afinado = false;
	}

	public void tocar() {
		System.out.println("EL instrumento " + nombre + "esta tocando");
	}

	public abstract void limpiar();

}
