package com.curso.java.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
	
		Vaca vaca1 = new Vaca("1","lola",300,"bradford");
		
		vaca1 .comer();
		vaca1.beber();
		vaca1.mugir(); 
		
		Animal vaca2= new Vaca ("2","lola",350,"bradford");
		vaca2.comer();
		
		//hacer cast o casting
		Vaca v=(Vaca) vaca2;
		v.mugir();
		//((vaca)vaca2).mugir();
		
	//	Animal vaca2= new Vaca ("3","lola",350,"bradford");
		System.out.println(v);
		System.out.println(vaca2);
	}

}
