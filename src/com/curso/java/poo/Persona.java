package com.curso.java.poo;

public class Persona {
	//variables de instancia o atributos
	String nombre;
	String apellidos;
	String dni;//20 bits
	int edad;//32 bits
	
	//metodos/
	public void correr() {
		System.out.println("la persona"+nombre+"esta corriendo");
		if(edad<20) {
			System.out.println("muy rapido");
		}
		
	}
	public void comer() {
		System.out.println("la persona"+nombre+"esta comiendo");
	}
	String luz;
}
