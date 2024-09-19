
/* Ejercicio 1
==============================================================
"    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, 
no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, 
adarga antigua, rocín flaco y galgo corredor.
 Una olla de algo más vaca que carnero, 
salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes,
 algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           "

Tamaño del texto sin los espacios en blanco del principio y del final
Mostrar la segunda frase del quijote
Aparece la palabra Quijote??
Cuantas comas aparecen en el texto*/

package stringd;

public class EjerciciosString {
	public static void main(String[] args) {
		String espacios = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, "
				+ "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, "
				+ "adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, "
				+ "salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
		System.out.println(espacios.trim());
		System.out.println(espacios.trim().length());
		int posicionpunto=espacios.indexOf(".");
		
		System.out.println("" + espacios.substring( posicionpunto  )); 
		
         boolean contieneQuijote=espacios.contains("Quijote");
		System.out.println("Aparece la palabra Quijote " + contieneQuijote);
		 int totalcomas=0;
		 for(int i=0;i<espacios.length();i++ )
			 totalcomas++;
		{
		 {
				
		 }
		                                       
	
		 }
		System.out.println("numero de comas en el texto"+totalcomas);
	}
	
}
