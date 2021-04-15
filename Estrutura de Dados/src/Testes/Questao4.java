package Testes;

import java.util.Scanner;

public class Questao4 {
////Atributos
	double nota1;
	double nota2;
	double nota3;
////Métodos
	Questao4(){
		super();
	}
	Questao4(double nota1, double nota2, double nota3){
		this.nota1= nota1;
		this.nota2= nota2;
		this.nota3= nota3;
	}
	
	public int PiorNota() {
		int menor=0;
		
		if (nota1 > nota2) {
			if (nota1 > nota3) {
				if (nota2 < nota3) {
					System.out.println("A pior nota foi na prova 2!");
					menor = 2;
				} 
				else {
					System.out.println("A pior nota foi na prova 3!");
					menor= 3;
				}
			} 
			else {
				System.out.println("A pior nota foi na prova 2!");
				menor= 2;
			}
		} 
		else {
			if (nota2 > nota3) {
				if (nota1 < nota3) {
					System.out.println("A pior nota foi na prova 1!");
					menor= 1;
				} 
				else {
					System.out.println("A pior nota foi na prova 3!");
					menor= 3;
				}
			} 
			else {
				System.out.println("A pior nota foi na prova 1!");
				menor= 1;
			}
		}
		return menor;
	}	
////Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Questao4 [] aluno = new Questao4[11];
		
		for (int i=0; i<10; i++) {
			aluno[i] = new Questao4();
			System.out.println("=============================");
			System.out.println("Aluno "+(i+1)+":");
			System.out.println("Digite a primeira nota: ");
			aluno[i].nota1= sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			aluno[i].nota2= sc.nextDouble();
			System.out.println("Digite a terceira nota: ");
			aluno[i].nota3= sc.nextDouble(); 
			System.out.println("=============================");
		}
		System.out.println("");
		int menor, prova1=0, prova2=0, prova3=0;
		for (int i=0; i<10; i++) {
			System.out.println("=============================");
			System.out.println("Pro aluno "+(i+1)+":");
			menor= aluno[i].PiorNota();
			if (menor==1) {
				prova1++;
			}
			if (menor==2) {
				prova2++;
			}
			if (menor==3){
				prova3++;
			}
		}
		System.out.println("A quantidade de alunos que teve a menor nota como prova 1 foi: "+prova1);
		System.out.println("A quantidade de alunos que teve a menor nota como prova 2 foi: "+prova2);
		System.out.println("A quantidade de alunos que teve a menor nota como prova 3 foi: "+prova3);
	}
}
