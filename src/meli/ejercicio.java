package meli;

import java.util.Scanner;

public class ejercicio {
	private static Scanner sc;

	public static void main( String args[] ) {
		 /*	int numero=1;
		  * int n;
		System.out.println ("Ingrese un numero");	
		 Scanner entradaEscaner = new Scanner (System.in);
	       n = entradaEscaner.nextInt();
	        while(numero <= n){
		  if(numero%2==0){
			  System.out.println(numero);
		  }
		  numero++;
		 }
		 */
		
		int numero;
		sc = new Scanner (System.in);
		System.out.println ("Ingrese un numero");
		numero = sc.nextInt();
	       for (int i = 0; i<=numero; i++){
	       		if (i%2==0); { 
	       			System.out.println(i);
	       		}
	       }
	       		
	}
}

