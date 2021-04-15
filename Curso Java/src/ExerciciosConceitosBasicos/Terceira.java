package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Terceira {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double massa;
		double altura;
		double imc;
		
		System.out.println("Digite sua massa: ");
		massa= entrada.nextDouble();
		System.out.println("Digite sua altura: ");
		altura= entrada.nextDouble();
		 
		imc= massa / (altura*altura);
		System.out.println("Seu IMC é: "+imc);
		entrada.close();
	}	
}
