package com.curso.java;

public class Aarrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int longitud1 = 0;
		int longitud2 = 1;
		int longitud3 = 2;

		int[] longitud = new int[3];

		longitud[0] = 6;
		longitud[1] = 7;
		longitud[2] = 8;

		System.out.println(longitud[0] + "-" + longitud[1] + "-" + longitud[2]);
		
		for (int i = 0; i < longitud.length; i++) {
				System.out.println(longitud[i]+ "-");
 
		}
	}

}
