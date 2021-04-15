package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite seu antepenultimo salário: ");
		String um= sc.nextLine().replace(",", ".");
		System.out.println("Digite seu penultimo salário: ");
		String dois= sc.nextLine().replace(",", ".");
		System.out.println("Digite seu ultimo salário: ");
		String tres= sc.nextLine().replace(",", ".");
		
		double salario1= Double.parseDouble(um);
		double salario2= Double.parseDouble(dois);
		double salario3= Double.parseDouble(tres);
		
		double media= (salario1+salario2+salario3)/3.0;
		
		System.out.println("A sua média de salário foi: "+media);
		sc.close();
	}
}
