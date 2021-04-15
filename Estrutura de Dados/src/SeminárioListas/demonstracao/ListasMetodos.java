package Semin�rioListas.demonstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListasMetodos {
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Arthur");
		lista.add(u1);  // adiciona um usu�rio j� criado na lista
		
		lista.add(new Usuario("Kelvin")); // adiciona um usu�rio n�o criado na lista
		lista.add(new Usuario("Pablo"));
		lista.add(new Usuario("Raquel"));
		lista.add(new Usuario("Yuri"));
		lista.add(new Usuario("Yuri")); // adiciona um usu�rio repetido na lista
		
		System.out.println("Acessando a lista pelo for:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		} // for que passa por todos os objetos da lista
		
		System.out.println();
		System.out.println("Acessando objetos pelo ind�ce: ");
		System.out.println("Ind�ce n�mero: " + lista.indexOf(new Usuario("Raquel"))); //Verificando qual o ind�ce do objeto
		System.out.println("Acessando pelo ind�ce: " + lista.get(3)); // acessar pelo �ndice
		
		System.out.println();
		System.out.println("Primeiro da lista: " + lista.get(0));
		System.out.println("Saindo da lista: " + lista.remove(0)); // removendo o objeto pelo indice
		System.out.println("Primeiro da lista: " + lista.get(0)); // novo objeto no ind�ce zero
		
		System.out.println();
		System.out.println("Removeu o usu�rio? " + (lista.remove(new Usuario("Yuri")) == true ? "sim" : "n�o")); // removendo objeto por compara��o
		System.out.println("Removeu o usu�rio? " + (lista.remove(new Usuario("Yuri")) == true ? "sim" : "n�o"));
		System.out.println("Removeu o usu�rio? " + (lista.remove(new Usuario("Yuri")) == true ? "sim" : "n�o"));
		
		System.out.println();
		System.out.println("Tem o usu�rio? " + (lista.contains(new Usuario("Pablo")) == true ? "sim" : "n�o"));
		System.out.println("Tem o usu�rio? " + (lista.contains(u1) == true ? "sim" : "n�o"));
		
		System.out.println();
		System.out.println("Acessando os nomes da lista pelo for each: ");
		
		for(Usuario u : lista) {
			System.out.println(u.getNome());
		}
		
		lista.add(new Usuario("Yuri"));// adicionando novos objetos
		lista.add(0, u1); //adicionando no ind�ce 
		
		ListIterator<Usuario> it = lista.listIterator();
		
		System.out.println();
		System.out.println("Acessando a lista na dire��o original:");
		while(it.hasNext()){
			System.out.println(it.next());
		}// Iterator que passa pela lista na ordem normal
		
		System.out.println();
		System.out.println("Acessando a lista na dire��o contr�ria");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}// Iterator que passa pela lista na ordem contr�ria
	}
}
