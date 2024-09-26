package com.curso.java.poo.herencia;

public class BandaMusica {

	public static void main(String[] args) {
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();
	}

	private void empezarConcierto() {
		Instrumento[] instrumentos = crearInstrumentos();
		afinarInstrumentos(instrumentos);
	}

	private Instrumento[] crearInstrumentos() {
		System.out.println(" creando instrumentos ");

		Guitarra guitarra = new Guitarra(" guitarra clasica","plancha", false, 7);
		GuitarraElectrica guitarraelectrica = new GuitarraElectrica(" lola ", " redonda ", false, 6, 7);
		Piano piano = new Piano(" paco ", " largo ", false, 7, " de cola ");
		Tambor tambor = new Tambor(" tilin ", " circulo ", false, " metal ");

		Instrumento[] instrumentos = { guitarra, guitarraelectrica, piano, tambor };
		System.out.println(" crenados" + instrumentos.length + instrumentos);
		return instrumentos;
	}

	private void afinarInstrumentos(Instrumento[] instrumentos) {
		System.out.println(" afinando instrumentos ");
		for (Instrumento instrumento : instrumentos) {
			instrumento.limpiar();
			instrumento.afinar();
		}

		System.out.println("instrumentos afinados");
		System.out.println("se ha terminado de tocar");

	}
	private void tocarInstrumentos(Instrumento[]instrumentos) {
		System.out.println("Tocando instrumento");
		
		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento.getClass().getName());
		//if(instrumento.get	
			
			instrumento.tocar();
				
		}
		 System.out.println("se ha terminado de tocar");	
		
	}

}
