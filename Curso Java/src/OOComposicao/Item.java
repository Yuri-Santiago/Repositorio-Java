package OOComposicao;

public class Item {
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item (String nome, int quantidade, double preco) {
		this.nome= nome;
		this.quantidade= quantidade;
		this.preco= preco;
	}
	public String toString() {
		return "Eu sou um "+nome+" meu preço é "+preco;
	}
}
