
/*Itroduce tu email (a partir de un email proporcionado). Vamos a validar si el email es correcto o no. Para ello vamos a pasar las siguientes validaciones
   asdasd@as.dasd.easdasdasdsad   

1. El email solo contiene una @
2. El email no puede contener espacios en blanco 
3. Despues de la @ debe de haber al menos un punto
4. Entre la @ y el primer punto que esté depués tiene que haber una separación de 2 caracteres
5. Después del último punto tiene que haber entre 2 y 5 caracteres

Si no cumple validación se indica por qué


Más complicado
===========================
Si el email es incorrecto preguntarle al usuario por un nuevo email hasta que sea correcto*/





package stringd;

import java.util.Scanner;

public class Email { 
	public static void main (String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("introduce  email");
		String email=scan.nextLine();
		String arroba="@";
		if (email.contains(arroba)) {
			arroba = "email correcto";
		}else {
			arroba = "email incorrecto";
		}
		System.out.println(""+ arroba);
		
		
		
		
	}
}
