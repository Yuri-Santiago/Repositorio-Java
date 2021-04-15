package Prova;

public class Funcionario {
/////Atributos	
	private String matricula;
	private String nome;
	private String endereco;
/////Métodos
	Funcionario(String matricula, String nome, String endereco){
		this.matricula= matricula;
		this.nome= nome;
		this.endereco = endereco;
	}
	Funcionario() {
		super();
	}
	
	public void setMatricula (String matricula) {
		this.matricula=matricula;
	}
	public void setNome (String nome) {
		this.nome=nome;
	}
	public void setEndereco (String endereco) {
		this.endereco=endereco;
	}
	
	public String getMatricula () {
		return matricula;
	}
	public String getNome () {
		return nome;
	}
	public String getEndereco () {
		return endereco;
	}
	
	public void print(){
		System.out.println("=====================");
		System.out.println("Matricula: "+ matricula);
		System.out.println("Nome: "+ nome);
		System.out.println("Endereço: "+ endereco);
		System.out.println("=====================");
	}
}
