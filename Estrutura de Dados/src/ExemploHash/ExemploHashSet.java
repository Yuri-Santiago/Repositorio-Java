package ExemploHash;

import java.util.*;

public class ExemploHashSet {
	public static void main(String[] args) {
		
		//Popula o HashSet com três inteiros.
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		
		// Determina o tamanho do HashSet.
		System.out.println("O HashSet contém "+hs.size()+" elementos.");
		
		// Iterate por todos os elementos do HashSet.
		Iterator iter = hs.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		
		//Determina se um elemento existe, se sim, remove ele.
		if (!hs.isEmpty()) {
			Integer toRemove = 2;
			if (hs.contains(toRemove)) {
				if (hs.remove(toRemove)) {
					System.out.println("Elemento " +toRemove.toString()+" removido com sucesso.");
				}
			}
		}
	}
}
