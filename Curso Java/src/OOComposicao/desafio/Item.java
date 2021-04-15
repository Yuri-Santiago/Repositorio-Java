 package OOComposicao.desafio;

public class Item {
////Atributos
	Produto produto;
	int quantidade;
////Metodos
	double getValorItem() {
		double total=0;
		total= quantidade*produto.preco;
		return total;
	}
	Item(int quantidade, Produto produto){
		this.produto= produto;
		this.quantidade= quantidade;
	}
	
}

