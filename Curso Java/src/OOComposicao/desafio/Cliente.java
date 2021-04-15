package OOComposicao.desafio;

import java.util.ArrayList; 
import java.util.List;

public class Cliente {
////Atributos
	final String nome;
	final List<Compra> compras = new ArrayList<>();
////Metodos
	Cliente(String nome){
		this.nome=nome;
		
	}
	double getValorTotal() {
		double total=0;
		for(Compra compra: compras) {
			total+=compra.getValorCompra();
		}
		return total;
	}
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
}
