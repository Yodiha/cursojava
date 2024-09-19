/*Ejercicio pintar menu
================================================================

(Facil)
1. Pintar cuadrado
2. Validar email
3. Crear alumno
4. Salir

Selecciona una opción

Si se pulsa la opcion 1,2 o 3 que nos indique la opción seleccionada, y que vuelva a pintar el menú
Si se selecciona la opcion 4, me dice Adios! y no se vuelve a mostrar el menú (Medio)
*/

package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 4) {
			System.out.println(" Mostrar menu de opciones");
			System.out.println("1. Pintar cuadadro");
			System.out.println("2. ValidarEmail");
			System.out.println("3. Crear alumno");
			System.out.println("4.salir");
			System.out.println("seleccione una opcion ");
			opcion = Scanner.nextInt();
			if (opcion == 1) {
				System.out.println("Has seleccionado la Opción 1.");
			} else if (opcion == 2) {
				System.out.println("Has seleccionado la Opción 2.");
			} else if (opcion == 3) {
				System.out.println("Has seleccionado la Opción 3.");
			} else if (opcion == 4) {
				System.out.println("Adios!!!!...");
				System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
			}
			System.out.println();

		}
		Scanner.close();

	}

}
