package es.studium.Compara;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		int numero1, numero2;
		
		Scanner teclado = new Scanner(System.in);
		 System.out.println("Dame el primer n�mero:");
		 numero1= teclado.nextInt();


		 System.out.println("Dame el segundo n�mero:");
		 numero2= teclado.nextInt();
		 if(numero1==numero2)
		 {
			 System.out.println("Son iguales");
		 }
		 else
		  { 
			 if(numero1<numero2)
			 {
				 System.out.println( "El n�mero "+ numero1 + " es menor");
			 }
			 else
				 if(numero1>numero2)
				 {
					 System.out.println("El n�mero " + numero1 + " es mayor");
				 }
				 
		  }
		 teclado.close();
	}

}
