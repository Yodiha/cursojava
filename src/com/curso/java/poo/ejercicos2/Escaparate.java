
//maniqui3.setPantalon(null); //este resultado , si, lo hacemos en la clase
			// main puede desvestir a cualquier maniqui.
			// maniqui3.setCamisa(null);

//maniqui3.desvstir();// este resultado sale si lo hacemos en la propia clase maniqui. todos los
// maniquis estan desvestidos.
//Maniqui maniqui4 = new Maniqui(6, null camisa, pantalon);


// System.out.println(maniquies[1].getVestido());
// System.out.println(maniquies[1].getVestido().getColor());

package com.curso.java.poo.ejercicos2;
public class Escaparate {

	public static void main(String[] args) {

		Boton boton1 = new Boton("redonda", "transparante", "mediano");
		Boton boton2 = new Boton("carita feliz", "blanco", "pequeño");
		Boton boton3 = new Boton("redonda", "transparante", "mediano");

		Pantalon pantalon = new Pantalon("azul", "XL", 49.95, boton1);

		Boton[] botones = { boton2, boton3 };
		Camisa camisa = new Camisa("Negra", "XL", 35.50, botones);

		Vestido vestido = new Vestido("rojo", "s", 75.30);
		Boton a = pantalon.getBoton();

		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, vestido);
		Maniqui maniqui3 = new Maniqui(3, camisa, pantalon);
		
		Maniqui[] maniquies = { maniqui1, maniqui2, maniqui3 };
		maniqui1.setVestido(vestido);
		double precio=0;
		
		for (Maniqui maniqui: maniquies) {
			if (maniqui.getVestido() != null) {
				precio += maniqui.getVestido().getPrecio();
				System.out.println(" maniqui "+ maniqui.getId() + " con color de vestido " + maniqui.getVestido().getColor() + " talla " + maniqui.getVestido().getTalla() + " precio " + maniqui.getVestido().getPrecio());
			}
				if (maniqui.getCamisa() != null) {
					precio += maniqui.getCamisa().getPrecio();
					System.out.println("maniqui"+ maniqui.getId() + " con color de camisa " + maniqui.getCamisa().getColor() + " talla " + maniqui.getCamisa().getTalla() + " precio " + maniqui.getCamisa().getPrecio());
		}
		
		 if (maniqui.getPantalon()!=null) {
			 precio += maniqui.getPantalon().getPrecio();
			 System.out.println("maniqui" + maniqui.getId() + " con color de pantalon " + maniqui.getPantalon().getColor() + " talla " + maniqui.getPantalon().getTalla() +" precio " + maniqui.getPantalon().getPrecio());
			
		 }
		
		 
	}
		maniqui2.desvstir();
	}
	
}
