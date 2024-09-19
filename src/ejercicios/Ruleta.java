
package ejercicios;

import java.util.Scanner;

public class Ruleta {
	public static void main(String[] args) {
		double saldo = 500.0;
		Scanner scan = new Scanner(System.in);
		int Saldo = scan.nextInt();
		saldo = 500;
		System.out.println("tu saldo son 500");

		System.out.println("");
		int numRepeticiones = (int) (Math.random() * 10) + 1;

		System.out.println("por que numero quieres apostar del 0 al 36?");

		System.out.println("cuanto dinero quieres apostar?");

	}

}
