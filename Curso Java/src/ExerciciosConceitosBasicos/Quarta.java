package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Quarta {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double valor;
		
		System.out.println("Digite um valor: ");
		valor= entrada.nextDouble();
		
		System.out.println("O valor ao quadrado é: "+valor*valor);
		System.out.println("O valor ao cubo é: "+valor*valor*valor);
		entrada.close();
	}
}
