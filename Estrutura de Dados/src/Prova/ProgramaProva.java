package Prova;

import java.util.Scanner;

public class ProgramaProva {
////Main	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Professor prof1 = new Professor();
		
		System.out.println("Digite sua Matr�cula: ");
		prof1.setMatricula(sc.nextLine());
		System.out.println("Digite seu Nome: ");
		prof1.setNome(sc.nextLine());
		System.out.println("Digite seu Endere�o: ");
		prof1.setEndereco(sc.nextLine());
		System.out.println("Digite sua Forma��o: ");
		prof1.setFormacao(sc.nextLine());
		System.out.println("Digite seu N�vel: ");
		prof1.setNivel(sc.nextLine());
		
		System.out.println("");
		prof1.print2();
		
		prof1.setNome("Jo�o");
		prof1.setNivel("Mestre");
		
		System.out.println("");
		prof1.print2();
	}
}
