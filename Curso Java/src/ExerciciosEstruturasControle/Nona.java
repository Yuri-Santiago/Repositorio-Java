package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Nona {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num=0;
		double maior=0;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite um n�mero: ");
			 num= entrada.nextDouble();
			 
			 if(num>maior) {
				 maior=num;
			 }
		}
		System.out.println("O maior n�mero foi: "+maior);
		entrada.close();
	}
}
