package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Primeira {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		double num= entrada.nextDouble();
		
		if(num>=0 && num<=10 && num%2==0) {
			System.out.println("Verdadeiro!");
		} else {
			System.out.println("Falso!");
		}
			
		entrada.close();
	}
}
