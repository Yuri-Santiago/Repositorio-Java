package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String operador;
		double num1;
		double num2;
		double resultado;
		
		System.out.println("Digite um Valor: ");
		num1= entrada.nextDouble();
		System.out.println("Digite um segundo Valor: ");
		num2= entrada.nextDouble();
		
		System.out.println("Qual a operação que vocÊ deseja, digite + , -, *, /, %");
		operador= entrada.next();
		
		resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		entrada.close();
	}
}
