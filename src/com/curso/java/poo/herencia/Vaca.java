package com.curso.java.poo.herencia;

public class Vaca extends Animal {
	private String tipo;

	public Vaca(String id, String nombre, double peso, String tipo) {
		super(id, nombre, peso);
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void mugir() {
		System.out.println("la vaca"+this.getNombre()+"esta mugiendo");
	}
	public void comer() {
		System.out.println("la vaca"+this.getNombre()+ " esta pastando");
}


	@Override
	public String toString() {
		return "Vaca [tipo=" + tipo + ", id" + getId() + ", getNombre()=" + getNombre() + "]";
	}

	
		
		
	}
	
