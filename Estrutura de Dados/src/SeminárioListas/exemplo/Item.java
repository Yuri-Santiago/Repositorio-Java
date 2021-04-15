 package SeminárioListas.exemplo;

public class Item {
////Atributos
	private Produto produto;
	private int quantidade;
////Metodos
	Item(int quantidade, Produto produto){
		this.produto= produto;
		this.quantidade= quantidade;
	}
	double getValorItem() {
		double total=0;
		total= quantidade*produto.getPreco();
		return total;
	}
	public Produto getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	String getProdutoNome() {
		return produto.getNome();
	}
	double getProdutoPreco(){
		return produto.getPreco();
	}
}

