package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Oitava {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite uma palavra");
		palavra= entrada.next();
		
		for(int i=0; i<palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		entrada.close();
	}
}
