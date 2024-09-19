/*Pedir el tamaño de un lado de un cuadrado: 
(Medio)
*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  *

(Dificil)
*  *  *  *
*        *
*        *
*  *  *  *
 * 
 * 
 * 
 * 
 * 
 */
package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioCuadradoPrimeroConFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("pedir tamaño de un lado de un cuadrado");
		int ladodecuadrado = scan.nextInt();
		for (int i = 0; i < ladodecuadrado; i++) {
			for (int c = 0; c < ladodecuadrado; c++) {
				System.out.print("*");

			}

			System.out.println();
		}

		System.out.println();
		System.out.println();
	}
}
