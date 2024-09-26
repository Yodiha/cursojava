package com.curso.java.poo.herencia;

public class GuitarraElectrica extends Guitarra {
	double potencia;

	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int numCuerdas, int potencia) {
		super(nombre, tipo, afinado, numCuerdas);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	
	

	@Override
	public void tocar() {
		System.out.println("tocando la guitarra muy alto");
	}




	{

	}

}
