package ejercicios;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// System.out.println("cuantos numero va a gauardar");
		//int numAlumnos=scan.nextInt();
		int[][]matriz = new int[4][4];
		matriz[0][0]=1;
		matriz[0][1]=2;
	    matriz[0][2]=3;
		matriz[0][3]=4;
		matriz[1][0]=5;
		matriz[1][1]=6;
		matriz[1][2]=7;
		matriz[1][3]=8;		
		matriz[2][0]=9;
		matriz[2][1]=10;
	    matriz[2][2]=11;
		matriz[2][3]=12;
		matriz[3][0]=13;
		matriz[3][1]=14;
		matriz[3][2]=15;
		matriz[3][3]=16;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				//matriz[i][j]=1;
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0; i<4.;i++){
			
		
		/*filas*/
			for  ( int j=0;j<4.;j++) {/*columnas*/
				
				System.out.print(matriz[i][j] );
	
			}
			}System.out.println();
	}
	}

	