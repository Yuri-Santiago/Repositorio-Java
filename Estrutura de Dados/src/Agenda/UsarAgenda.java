package Agenda;

import java.util.Scanner;

public class UsarAgenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda[] contatos = new Agenda[10];
		contatos[0]= new Agenda("Yuri", "987802600", "yuri@gmail");
		contatos[1]= new Agenda("Raquel", "999654724", "raquel@gmail");
		contatos[2]= new Agenda("Israel", "987772712", "isra@gmail");
		int nContatos = 3;
		
		System.out.println("SISTEMA DE AGENDA");
		System.out.println("1 – Inserir na Agenda");
		System.out.println("2 – Consultar Agenda");
		System.out.println("3 – Excluir da agenda");
		System.out.println("4 – Listar a Agenda");
		System.out.println("9 - Sair");
		System.out.println("=====================");
		System.out.println("Escolha a opção: ");
		int opc = sc.nextInt();
		
		Agenda a = new Agenda();
		int i;
		while (opc!=9) {
			switch (opc) {
			case 1: System.out.println("Opção 1:");
					contatos[nContatos]= new Agenda();
					
					System.out.println("Digite o Nome do Contato: ");
					contatos[nContatos].setNome(sc.next());
					System.out.println("Digite o Telefone do Contato: ");
					contatos[nContatos].setTelefone(sc.next());
					System.out.println("Digite o Email do Contato: ");
					contatos[nContatos].setEmail(sc.next());
					System.out.println();
					System.out.println("Contato Cadastrado");
					System.out.println();
					nContatos++;
					break;
					
			case 2: System.out.println("Opção 2:");
					System.out.println("Digite o nome de um Contato: ");
					a.setNome(sc.next());
					
					for (i=0; i<nContatos; i++) {
						if (a.getNome().equals(contatos[i].getNome())) {
							System.out.println();
							System.out.println(contatos[i].getNome());
							System.out.println(contatos[i].getTelefone());
							System.out.println(contatos[i].getEmail());
							System.out.println();
							break;
						}
					}
					
					if (i>=nContatos) {
						System.out.println();
						System.out.println("Contato não Cadastrado.");
						System.out.println();
					}
					break;
					
			case 3: System.out.println("Opção 3:");
					System.out.println("Digite o nome do Contato: ");
					a.setNome(sc.next());
					
					for (i=0; i<nContatos; i++) {
						if (a.getNome().equals(contatos[i].getNome())) {
							System.out.println();
							System.out.println(contatos[i].getNome());
							System.out.println(contatos[i].getTelefone());
							System.out.println(contatos[i].getEmail());
							System.out.println();
							break;
						}
					}
					
					if (i>=nContatos) {
						System.out.println();
						System.out.println("Contato não Cadastrado.");
						System.out.println();
					}
					
					else {
						for(int j=i; j<=nContatos; j++) {
							contatos[j]= contatos[j+1];
						}
						System.out.println();
						System.out.println("Contato Excluído.");
						System.out.println();
						nContatos--;
					}
					break;
					
			case 4: System.out.println("Opção 4:");
					for (i=0; i<nContatos; i++) {
							System.out.println(contatos[i].getNome());
							System.out.println(contatos[i].getTelefone());
							System.out.println(contatos[i].getEmail());
							System.out.println();
					}
					break;
					
			case 9: System.out.println("Saindo do Sistema..."); break;
			
			default: System.out.println("Escolha uma da opções corretas"); break; 	
			}
		System.out.println("SISTEMA DE AGENDA");
		System.out.println("1 – Inserir na Agenda");
		System.out.println("2 – Consultar Agenda");
		System.out.println("3 – Excluir da agenda");
		System.out.println("4 – Listar a Agenda");
		System.out.println("9 - Sair");
		System.out.println("=====================");
		System.out.println("Escolha a opção: ");
		opc = sc.nextInt();	
		}
	}
}
