package ordenacion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sort {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		
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
			
		Arrays.sort(numeros);
		
		System.out.println("ORDENADO: ");
		for(int p = 0; p < numeros.length; p++) {
			
			System.out.println("numero " + p + " = " + numeros[p]);
			
		}
		
		
		
		sr.close();
	}

}