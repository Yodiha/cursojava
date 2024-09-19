package ejercicios;

import java.util.Scanner;

public class GueraNaval1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] tablerojugador = new int[5][5];
		int[][] tableroenemigo = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				tablerojugador[i][j] = 0;
			}
		}
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				tableroenemigo[i][j]=0;
			}
		}
		System.out.println("imprimir tablero jugapdr");
	}

}
