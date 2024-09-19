package ejercicios;

import java.util.Scanner;

public class EjercicioArrays3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("¿cuantos numeros quieres almacenar?");
		int cantidad = scan.nextInt();
		int[] numeros = new int[cantidad];
		
		for (int i=0;i< numeros.length;i++) {
			numeros[i]=i+1;
			System.out.println(numeros[i]);
		}

	}

}
