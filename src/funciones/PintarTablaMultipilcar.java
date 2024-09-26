package funciones;



public class PintarTablaMultipilcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Funcion a la que le paso un numero y me pinta la tabla de multiplicar de ese numero//
		tablas(8);
			
	}

	public static void tablas(int numero) {

		System.out.println(numero);
		for (int i = 0; i <= 10; i++) {
          
	

			System.out.println(i*numero);
		}
	}

}