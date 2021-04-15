package Arrays;

import java.util.Scanner;

public class Inverso {
	public static void main(String[] args) {
		final int NUMEROS_A_LER = 10;
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[NUMEROS_A_LER]; // criação do array de 10
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Entre com o proximo inteiro: ");
			numeros[i] = sc.nextInt();
		}
		
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}	
}
