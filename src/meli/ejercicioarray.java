package meli;

// clase 2 - arrays ultima diapositiva 
//falta lo de ordenar e imprimir
import java.util.Random;

public class ejercicioarray {
	private int [] elementos;
	public ejercicioarray (int tamano) { //constructor, mismo nombre de la clase
		this.elementos = new int [tamano]; 
		
		Random rnd = new Random();
		for (int i = 0; i<tamano; i++){
			this.elementos[i] = rnd.nextInt(10);
			System.out.println(this.elementos[i]); //imprime el vector
		}
	}	
	
	public static void main( String args[] ) {
		ejercicioarray m = new ejercicioarray(8);
	}

}
