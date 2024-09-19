package funciones;

//funcion que recibe un numero y un texto y me va a pintar el texto que le pasemos el numero de veces  indicado por el parametro. numerico//
public class Funciones2 {
	public static void main(String[] args) {
		pintarTexto("hola",5);
	

	}

	public static void pintarTexto(String texto,int numero) {
    for (int i=0;i<numero;i++) {
    	System.out.println(texto);
    }
	
  }

}
