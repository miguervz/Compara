package es.studium.Concatena;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String cadena1,cadena2,cadena3;
		System.out.println("Escribe la primera cadena");

		cadena1 = teclado.next();
		System.out.println("Escribe la segunda cadena:");

		cadena2 = teclado.next();
       cadena3=cadena1+cadena2;
		System.out.println(String.format(cadena3));
        teclado.close();
	}

}
