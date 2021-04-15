package ExerciciosConceitosBasicos;

import java.util.Scanner;

public class Sexta {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite o valor do a: ");
		double a= entrada.nextDouble();
		System.out.println("Digite o valor do b: ");
		double b= entrada.nextDouble();
		System.out.println("Digite o valor do c: ");
		double c= entrada.nextDouble();
		
		double delta= (b*b)-(4*a*c);
		System.out.println("O delta é: "+delta);	
		
		double x1= (-b + Math.sqrt(delta))/2*a;
		double x2= (-b - Math.sqrt(delta))/2*a;
		
		System.out.println("As raízes são: "+x1+" e "+x2);
		entrada.close();
	}
}
