package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Quarta {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double valor;
		
		System.out.println("Digite um valor: ");
		valor= entrada.nextDouble();
		
		System.out.println("O valor ao quadrado �: "+valor*valor);
		System.out.println("O valor ao cubo �: "+valor*valor*valor);
		entrada.close();
	}
}
