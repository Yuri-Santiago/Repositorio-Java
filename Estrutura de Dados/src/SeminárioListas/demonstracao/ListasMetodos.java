package SeminárioListas.demonstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListasMetodos {
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Arthur");
		lista.add(u1);  // adiciona um usuário já criado na lista
		
		lista.add(new Usuario("Kelvin")); // adiciona um usuário não criado na lista
		lista.add(new Usuario("Pablo"));
		lista.add(new Usuario("Raquel"));
		lista.add(new Usuario("Yuri"));
		lista.add(new Usuario("Yuri")); // adiciona um usuário repetido na lista
		
		System.out.println("Acessando a lista pelo for:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		} // for que passa por todos os objetos da lista
		
		System.out.println();
		System.out.println("Acessando objetos pelo indíce: ");
		System.out.println("Indíce número: " + lista.indexOf(new Usuario("Raquel"))); //Verificando qual o indíce do objeto
		System.out.println("Acessando pelo indíce: " + lista.get(3)); // acessar pelo índice
		
		System.out.println();
		System.out.println("Primeiro da lista: " + lista.get(0));
		System.out.println("Saindo da lista: " + lista.remove(0)); // removendo o objeto pelo indice
		System.out.println("Primeiro da lista: " + lista.get(0)); // novo objeto no indíce zero
		
		System.out.println();
		System.out.println("Removeu o usuário? " + (lista.remove(new Usuario("Yuri")) == true ? "sim" : "não")); // removendo objeto por comparação
		System.out.println("Removeu o usuário? " + (lista.remove(new Usuario("Yuri")) == true ? "sim" : "não"));
		System.out.println("Removeu o usuário? " + (lista.remove(new Usuario("Yuri")) == true ? "sim" : "não"));
		
		System.out.println();
		System.out.println("Tem o usuário? " + (lista.contains(new Usuario("Pablo")) == true ? "sim" : "não"));
		System.out.println("Tem o usuário? " + (lista.contains(u1) == true ? "sim" : "não"));
		
		System.out.println();
		System.out.println("Acessando os nomes da lista pelo for each: ");
		
		for(Usuario u : lista) {
			System.out.println(u.getNome());
		}
		
		lista.add(new Usuario("Yuri"));// adicionando novos objetos
		lista.add(0, u1); //adicionando no indíce 
		
		ListIterator<Usuario> it = lista.listIterator();
		
		System.out.println();
		System.out.println("Acessando a lista na direção original:");
		while(it.hasNext()){
			System.out.println(it.next());
		}// Iterator que passa pela lista na ordem normal
		
		System.out.println();
		System.out.println("Acessando a lista na direção contrária");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}// Iterator que passa pela lista na ordem contrária
	}
}
