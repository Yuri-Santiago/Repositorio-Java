package ArrayseCollections;

import java.util.Scanner;


public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas voc� quer informar pra m�dia?");
		int num= entrada.nextInt();
		
		double[] notas= new double[num];

		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Digite a nota "+(i+1)+" da m�dia: ");
			notas[i]= entrada.nextDouble();
		}
		
		double soma=0;
		for(double nota : notas) {
			soma+=nota;
		}
		
		double media= soma/notas.length;
		System.out.println("A sua m�dia Final foi: "+media);
		entrada.close();
	}
}
