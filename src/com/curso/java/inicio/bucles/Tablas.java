
/*EjercicioForTablas (Medio-Alto)
============================================================
Mostra los numero pares del 2 al 100 y los impares del 99 al 1
2,99
4,97
6,95
....*/

package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class Tablas {
	public static void main(String[]args) {
		Scanner Scan= new Scanner(System.in);
		int Par = 2;
		int Impar= 99;
		while(Par<=100 && Impar >=1) {
		System.out.println(Par+","+Impar);
		Par +=2;
		Impar -=2;
		}
	}
	}
			
			
			
			


