package com.curso.java.poo;

public class Cine {

	public static void main(String[] args) {
		
		Persona persona1=new Persona();
		 persona1.edad =28;
		 persona1.nombre="eva";
		 persona1.apellidos="garcia";
		 System.out.println(persona1.edad);
		 System.out.println(persona1.nombre);
		 persona1.apellidos =persona1.apellidos.toUpperCase();    //ESTA ES LA FORMA QUE SE  HACE PARA PODER CAMBIAR EL VALOR DENTRO DEL OBJETO SIN QUE SE DUPLIQUE 
		 System.out.println(persona1.apellidos); 
		 persona1.correr();
		 
		 
		 Persona persona2=new Persona();
		 persona2.edad =41;
		 persona2.nombre="luz";
		 persona1.correr();
		  
		 Persona persona3=new Persona();
		 persona3.edad =18;
		 persona3.nombre="elvis";
		 persona3.correr();
		 System.out.println(persona3.apellidos.toUpperCase());
	
		 Persona persona4=persona3;
		 persona4.edad =28;
		 persona4.setNombre("carlos");
		 persona1.nombre="carlos";
		 persona1.apellido="garcia";
		 System.out.println(persona1.edad);
		 System.out.println(persona1.nombre);
		 persona1
	}

}
