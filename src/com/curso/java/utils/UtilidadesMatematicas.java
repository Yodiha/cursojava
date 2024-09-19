package com.curso.java.utils;

import java.util.Scanner;

/*Crear Clase UtilidadesMatematicas dentro de utils
funcion sumar le pasais dos parámetros y os devuelve la suma.*/
public class UtilidadesMatematicas {
	public static int funcionSumar(int a, int b) {
		int suma = a + b;
		System.out.println(a + b);
		return suma;
	}

//funcion operacion, le vamos a pasar tres parametros, los dos primeros son numeros y el tercero es la operacion que queremos hacer con los números. Me devolverá el resultado de la operación
	public static int funcionOperacion(int a, int b, String operador) {
		int resultado = 0;
		if (operador.equalsIgnoreCase("+")) {
			resultado = a + b;

		}
		if (operador.equalsIgnoreCase("-")) {
			resultado = a - b;

		}
		if (operador.equalsIgnoreCase("*")) {
			resultado = a * b;

		}
		if (operador.equalsIgnoreCase("/")) {
			resultado = a / b;

		}
		return resultado;
	}

	// funcion calculaSumatorio que le pasamos un [] de enteros y me devuelve la
	// suma de todos los numeros
	public static int calculoSumatorio(int[] numeros) {
		int resultado = 0;
		// for(int i=0; i <numeros.length;i++) {
		// resultado+=numeros[i];
		for (int numero : numeros) {
			resultado += numero;
		}
		return resultado;
	}

//funcion calcularMedia que le pasamos un [] de enteros, que llama a la función calculaSumatorio para realizar el cálculo y devuelve la media de todos los numeros del array.

	public static int calculaMedia(int[] numeros) {
		int media=0;
		int suma=	 calculoSumatorio(numeros);
		media=suma/numeros.length;
		return media;
	}

}