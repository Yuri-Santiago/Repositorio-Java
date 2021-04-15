package SeminárioListas.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
////Atributos
	private final String nome;
	private final List<Item> itens = new ArrayList<>();
////Metodos
	public Compra(String nome) {
		this.nome= nome;
	}
	double getValorCompra() {
		double total=0;
		for(Item item: itens) {			
			total+= item.getValorItem();
		}
		return total;
	}
	String listarItems() {
		String resultado = "";
		int contador= 1;
		for(Item item: itens) {
			if(item.getQuantidade()>1) {
				resultado+= contador+": O produto "+item.getProdutoNome()+" tem o valor de "+item.getProdutoPreco()+" R$ e a quantidade é de "+item.getQuantidade()+" produtos.\n";
			}else if(item.getQuantidade()==1) {				
				resultado+= contador+": O produto "+item.getProdutoNome()+" tem o valor de "+item.getProdutoPreco()+" R$.\n";
			}else {
				resultado+= "Sem items na Compra";
			}
			contador++;
		}
		return resultado;
	}
	void addItem(Item item) {
		this.itens.add(item);
	}
	public String getNome() {
		return nome;
	}
}
