package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Setima {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0; 
		int total=0;
		do {
			System.out.println("Digite um número positivo");
			num= entrada.nextInt();
			
			if(num>=0) {
				total+=num;
				System.out.println("Soma dos números é: "+total);
			} else {
				System.out.println("Fim do programa!");
			}
			
		} while (num>=0);
		entrada.close();
	}
}
