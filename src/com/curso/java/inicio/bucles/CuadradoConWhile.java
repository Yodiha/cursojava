package com.curso.java.inicio.bucles;                 

import java.util.Scanner;

public class CuadradoConWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("pedir tamaño de un lado de un cuadrado");
		Scanner scan = new Scanner(System.in);
		int tamanio = scan.nextInt();
		int fila=0;
		while(tamanio>fila) {
		int columna=0;
		while (tamanio>columna) {
			System.out.print("*");
			columna++;
		}
		fila++;
		System.out.println();
	}
		System.out.println();
}
}