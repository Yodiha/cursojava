package com.curso.java.poo;

public class AlumnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//para arrancar e ir creando 
		
		
		
		Alumno alumno1 = new Alumno();
		alumno1.setDni("x220");
		alumno1.setNombre("pedro");
		alumno1.setApellidos("jimenez");
		alumno1.setNota(6.5);
		alumno1.setMayorEdad(true);
		

		Alumno alumno2 = new Alumno("x1254", "juan","jimenez");
		 alumno2.setNota(8);
		 alumno2.setMayorEdad(false);
		//ESTO PARA LLAMAR UN METODO DESDE LA MIMA CLASE
				
		
}
	
}
