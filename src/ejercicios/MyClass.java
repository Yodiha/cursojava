package ejercicios;
public class MyClass {
	public static void main(String args[]) {
		int duration = 7; // Duración en minutos
		double costo = 0; // Costo llamada
		int dia = 7; // 7 = domingo
		int turno = 1; // 1=mañana, 2=tarde, 3=noche
		int impuesto = 0;

		if (duration <= 5) {
			costo = 1;
		} else if (duration > 5 && duration <= 8) {
			costo = 0.80;
		} else if (duration > 8 && duration <= 10) {
			costo = 0.70;
		} else {
			costo = 0.50;
		}

		if (dia == 7) {
			impuesto = 3;
		} else {
			if (turno == 1) {
				impuesto = 15;
			} else if (turno == 2) {
				impuesto = 10;
			} else {
				impuesto = -10;
			}
		}

		System.out.println("DUración: " + duration);
		System.out.println("Costo: " + costo);
		System.out.println("Día: " + dia);
		System.out.println("Turno: " + turno);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Valor llamada: " + (costo * duration));

	}

}
