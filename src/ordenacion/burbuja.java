package ordenacion;

import java.util.Scanner;
import java.util.StringTokenizer;

public class burbuja {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		//Comentario de prueba de Navarro
		//Nuevo comentario de Andres.
		//lolololo
		int[] numeros = new int[10];
		
		
		System.out.println("Introduce los 10 numeros separados por espacios: ");
		String datos = sr.nextLine();
		
		StringTokenizer tk = new StringTokenizer(datos);
				
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = Integer.parseInt(tk.nextToken());
			
		}
		
		System.out.println("SIN ORDENAR: ");
		for(int l = 0; l < numeros.length; l++) {
			
			System.out.println("numero " + l + " = " + numeros[l]);
			
		}
			
		//algoritmo burbuja:
		
		int aux = 0;
		
		for(int j = 0; j < (numeros.length-1); j++)
			for(int k = 0; k < (numeros.length-1); k++) {
				
				if(numeros[k] > numeros[k+1]) { //cambiando simplemente el simbolo de mayor/menor en el if cambiara a mayor a menor en vez de menor a mayor
					
					aux = numeros[k];
					numeros[k] = numeros[k+1];
					numeros[k+1] = aux;					
				}				
			}
		
		System.out.println("ORDENADO MAYOR A MENOR: ");
		for(int p = 0; p < numeros.length; p++) {
			
			System.out.println("numero " + p + " = " + numeros[p]);
			
		}	
		
		aux = 0;
		
	
		for(int j = (numeros.length-1); j > 0; j--)
			for(int k = (numeros.length-1); k > 0; k--) {
				
				if(numeros[k] > numeros[k-1]) {
					
					aux = numeros[k];
					numeros[k] = numeros[k-1];
					numeros[k-1] = aux;					
				}				
			}
		
		System.out.println("ORDENADO MENOR A MAYOR: ");
		for(int p = 0; p < numeros.length; p++) {
			
			System.out.println("numero " + p + " = " + numeros[p]);
			
		}	
		
		sr.close();
	}

}
