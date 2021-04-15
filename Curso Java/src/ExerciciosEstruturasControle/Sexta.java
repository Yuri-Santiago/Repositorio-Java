package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Sexta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ouro= 22;
		int num=0;
		System.out.println("Você terá que adivinhar um número em 10 tentativas!");
		
		for(int t=1; t<=10; t++) {
			System.out.println("Digite um número: ");
			num=entrada.nextInt();
			
			if(num==ouro) {
				System.out.println("Acertou!");
				break;
			} else if (num>ouro) {
				System.out.println("O numero é menor, tente novamente.");	
			} else {
				System.out.println("O número é maior, tente novamente.");
			}
			
		}
		entrada.close();
	}
}
