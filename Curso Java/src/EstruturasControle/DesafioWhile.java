package EstruturasControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double nota= 0;
		double total= 0;
		double validas=0;
		
		while(nota!=-1) {
			System.out.println("Digite uma nota");
			nota=entrada.nextDouble();
			
			if(nota>=0 && nota<=10) {
				System.out.println("Nota V�lida");
				total+=nota;
				validas++;
			} else {
				System.out.println("Nota Inv�lida");
			}
		}
		
		double media= total/validas;
		System.out.println("A m�dia � igual a: "+media);
		
		entrada.close();
	}
}
