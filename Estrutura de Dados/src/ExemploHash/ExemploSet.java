package ExemploHash;

import java.util.*;

public class ExemploSet {
	public static void main(String[] args) {
		
		//criando o objeto Set
		Set cores = new HashSet(0);
		
		//adicionando elementos ao objeto
		cores.add("azul");
		cores.add("amarelo");
		cores.add("verde");
		
		//criando o objeto iterator para poder percorrer o Set
		Iterator it = cores.iterator();
		
		//imprimindo os objetos
		while (it.hasNext()) {
		String cor = (String) it.next();
		System.out.println(cor);
		}
	}
}
