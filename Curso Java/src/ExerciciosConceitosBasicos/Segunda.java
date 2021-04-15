package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Segunda {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double celsius;
		double faren;
		
		System.out.println("Digite um valor em Fahrenheit");
		faren= entrada.nextDouble();
		
		celsius= (faren-32) / 1.8;
		System.out.println("O valor em Celsius é: "+celsius);
		entrada.close();
	}
}
