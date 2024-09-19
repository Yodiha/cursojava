package com.curso.java.utils;

import java.util.Scanner;

/**
 * metodo que pide un dato numerico de tipo string al usuario y devuelve el
 * valor
 * 
 * @param pregunta:pregunta que se le hace al usuario
 * @return
 * @author
 * @version 1.0
 */
public class Utilidades {

	public static int pideDatoNumerico(String pregunta) {
		int dato = 0;
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextInt();
		return dato;
	}

	public static String datostring(String pregunta) {
		String texto = "";
		System.out.println(pregunta);
		Scanner scan = new Scanner(System.in);
		texto = scan.nextLine();

		return texto;
	}

	public static void pintarMenu (String[] opcionesMenu ) {
		for(int=0; i<opcionesMenu.length; i++) {
			System.out.println();
		}
		
	for ( String opcion:opcionesMenu);	
	}
}
