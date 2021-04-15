package OOComposicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
////Atributos
	final List<Item> itens = new ArrayList<>();
////Metodos
	double getValorCompra() {
		double total=0;
		for(Item item: itens) {			
			total+= item.getValorItem();
		}
		return total;
	}
	
	void addItem(Item item) {
		this.itens.add(item);
	}
}
