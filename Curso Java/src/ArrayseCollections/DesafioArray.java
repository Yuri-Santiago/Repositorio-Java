package ArrayseCollections;

import java.util.Scanner;


public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você quer informar pra média?");
		int num= entrada.nextInt();
		
		double[] notas= new double[num];

		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Digite a nota "+(i+1)+" da média: ");
			notas[i]= entrada.nextDouble();
		}
		
		double soma=0;
		for(double nota : notas) {
			soma+=nota;
		}
		
		double media= soma/notas.length;
		System.out.println("A sua média Final foi: "+media);
		entrada.close();
	}
}
