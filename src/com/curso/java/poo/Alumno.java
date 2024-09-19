package com.curso.java.poo;

public class Alumno {
	// ATRIBUTOS o variables de instancia. son privadas.
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean mayorEdad;
	private double nota;

	// constructor vacio.
	public Alumno() {

	}

	// contructores que yo nombro.
	public Alumno(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Alumno(String dni, String nombre, String apellidos, double nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}

	public Alumno(String dni, String nombre, String apellidos, double nota, boolean mayoredad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mayorEdad = mayorEdad;
		this.nota = nota;
		
//ver nota solo si es mayor de edad.

	}

//metod get y set 
	public String getNombre() {
		return this.nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public String getApellidos() {
		return this.apellidos;

	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;

	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}

	public double getNota() {
		return this.nota = nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;

	}

	public boolean isMayorEdad(boolean mayorEdad) {
		return this.mayorEdad = mayorEdad;
	}// declaramos el metodo ver nota se empieza con public ,el static no hace falta
		// en las clases para crear objetos ,luego colocamos el tipo de dato que de
		// vuelve.

	public void verNota() {
		double nota = 10;

		if (mayorEdad) {
			if(this.nota==0){
				System.out.println("el alumno no ha estudiado nada");
			}
			
			else if (this.nota<5) {
				System.out.println("el alumno ha estudiado poco");	
			}

		} else if (this.nota<=9)  {
			System.out.println("sin permisos para mostrar la nota ");

		} else if (this.nota<=9 {

		} else {
			System.out.println("sin permisos para mostrar la nota");
		}
		

	}
}
