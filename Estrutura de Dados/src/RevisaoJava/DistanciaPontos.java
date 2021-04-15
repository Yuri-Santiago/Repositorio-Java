package RevisaoJava;

import java.lang.*; import java.util.Scanner;

public class DistanciaPontos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2,resultado;
		
		//Leitura ponto 1
		System.out.print("Digite a cordenada x do ponto 1: ");
		x1 = sc.nextDouble();
		System.out.print("Digite a cordenada y do ponto 1: ");
		y1 = sc.nextDouble();
		//Leitura ponto 2
		System.out.print("Digite a cordenada x do ponto 2: ");
		x2 = sc.nextDouble();
		System.out.print("Digite a cordenada y do ponto 2: ");
		y2 = sc.nextDouble();
		
		//Calculos
		resultado= Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
		
		//Resultado Na Tela
		System.out.print("A distância entre esses pontos é: "+resultado);
	}
}