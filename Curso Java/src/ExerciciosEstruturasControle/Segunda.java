package ExerciciosEstruturasControle;

import java.util.Scanner;

public class Segunda {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um ano: ");
		double ano= entrada.nextDouble(); 
		
		if(ano%400==0 || ano%4==0) {
			System.out.println("Ano bissexto!");
		} else {
			System.out.println("Ano não bissexto!");
		}
		
		entrada.close();
	}
}
