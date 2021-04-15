package Caneta;

public class Canetas {
////Atributos
	private String cor;
	private boolean tampa;
////Métodos	
	Canetas(String cor, boolean tampa){
		this.cor= cor;
		this.tampa= tampa;
	}
	
	public void setCor(String cor) {
		this.cor= cor;
	}
	public String getCor(){
		return cor;
	}
	public void setTampa(boolean tampa) {
		this.tampa= tampa;
	}
	public boolean getTampa(){
		return tampa;
	}
	
	public void TrocarTampa(){
		if(tampa) {
			this.tampa= false;
			System.out.println("Fechando a Tampa");
		}
		else {
			this.tampa= true;
			System.out.println("Abrindo a Tampa");
		}
	}
	public void Escrever(){
		if(tampa) {
			System.out.println("Escrevendo...");
		}
		else {
			System.out.println("Não pode escrever...");
		}
	}
	public void print() {
		System.out.println("Cor da Caneta: "+ cor);
		if(tampa) {
			System.out.println("Tampa está Aberta");
		}
		else {
			System.out.println("Tampa está Fechada");
		}
	}
}
