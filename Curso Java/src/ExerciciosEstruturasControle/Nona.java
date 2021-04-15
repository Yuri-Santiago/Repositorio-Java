package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Nona {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num=0;
		double maior=0;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite um número: ");
			 num= entrada.nextDouble();
			 
			 if(num>maior) {
				 maior=num;
			 }
		}
		System.out.println("O maior número foi: "+maior);
		entrada.close();
	}
}
