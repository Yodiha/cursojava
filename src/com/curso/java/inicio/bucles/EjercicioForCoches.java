//Pedir numero de coches
//Por cada coche pedir su velocidad
//Indicar a qué velocidad va el coche más rápido

package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioForCoches {

	public static void main(String[] args) {
		System.out.println("Introduce número de coches");
		Scanner scan = new Scanner(System.in);
		int numeroCoches = scan.nextInt();
	 double velocidamaxima =0;	
		for (int i=0; i<numeroCoches ; i++) {
			System.out.println("Introduce velocidad del coche " + (i+1));
			scan = new Scanner(System.in);
			double velocidad = scan.nextDouble();
			System.out.println("La velocidad es "+velocidad);
	
			if  (velocidad>velocidamaxima) {
				velocidamaxima=velocidad;
				
				
			}
			System.out.println("el coche mas rapido va a " +velocidamaxima +"km/h");
			}
		}
	

	}


