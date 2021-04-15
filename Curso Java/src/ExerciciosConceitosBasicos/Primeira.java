package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Primeira {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double celsius;
		double faren;
		
		System.out.println("Digite um valor em Celsius");
		celsius= entrada.nextDouble();
		
		faren= (celsius*1.8)+32;
		System.out.println("O valor em Fahrenheit é: "+faren);
		entrada.close();
	}
}
