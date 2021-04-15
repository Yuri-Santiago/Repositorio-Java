package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Terceira {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota parcial: ");
		double nota1= entrada.nextDouble();
		System.out.println("Digite outra nota parcial: ");
		double nota2= entrada.nextDouble();
		
		double media= (nota1+ nota2) /2;
		
		if(media>=7.0) {
			System.out.println("Aprovado!");
		} else if(media>=4) {
			System.out.println("Recuperação!");
		} else 
			System.out.println("Reprovado!");
		entrada.close();
	}
}
