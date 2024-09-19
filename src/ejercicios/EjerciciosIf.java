package ejercicios;

public class EjerciciosIf {

	public static void main(String[] args) {
		String aisgnatuta ="ESPAÑOL";
		String nombreAlumno = "luz";
		int nota = 10;
	//INICIO DEL PROGRAMA	
	System.out.println("INICIO");
	
	if (nota < 3) {
		System.out.println("INSUFICIENTE");
	}else if (nota > 3 && nota < 6) {
		System.out.println("NOTABLE");
	}else if (nota > 6 && nota < 9) {
		System.out.println("SOBRESALIENTE");
	}else if (nota > 9 ) {
		System.out.println("EXCELENTE");

	}

}
}
