package funciones;

public class EJjemplosFuncioones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DEFINIR FUNCION QUE RECIBE UN STRING Y DEVUELVE LA LONGITUD DEL STRING//
		 metodo1("casa");
		 System.out.println(metodo1("casa"));
	}
	public static int metodo1 (String texto) {
			
		int longitud=texto.length();
		
		//System.out.println(longitud);
		return longitud;
	}

}
