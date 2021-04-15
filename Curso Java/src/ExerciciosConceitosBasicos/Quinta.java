package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Quinta {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double base;
		double altura;
		
		System.out.println("Digite a Base do triangulo: ");
		base= entrada.nextDouble();
		System.out.println("Digite a Altura do triangulo: ");
		altura= entrada.nextDouble();
		
		double area= (base*altura)/2;
		System.out.println("A Área do triângulo é: "+area);
		
		entrada.close();
	}
}
