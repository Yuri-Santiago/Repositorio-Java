package SeminárioListas.exemplo;

public class Produto {
////Atributos
	private double preco;
	private String nome;
////Metodos
	Produto(String nome, double preco){
		this.setNome(nome);
		this.setPreco(preco);
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco>0) {
			this.preco = preco;
		} else {
			this.preco= 0;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
