package Pessoas;

public class Pessoa {
/////Atributos	
	private String nome;
	private String nascimento;
	private String endereco;
/////Métodos
	Pessoa(String nome, String nascimento, String endereco){
		this.nome= nome;
		this.nascimento= nascimento;
		this.endereco = endereco;
	}
	Pessoa() {
		super();
	}
	
	public void setNome (String nome) {
		this.nome=nome;
	}
	public void setNascimento (String nascimento) {
		this.nascimento=nascimento;
	}
	public void setEndereco (String endereco) {
		this.endereco=endereco;
	}
	
	public String getNome () {
		return nome;
	}
	public String getNascimento () {
		return nascimento;
	}
	public String getEndereco () {
		return endereco;
	}
	
	public String print(){
		String resultado;
		resultado = "Nome: "+(String) nome+" Data de Nascimento: "+(String) nascimento+" Endereço: "+(String) endereco;
		return resultado;
	}
/////Main	
	public static void main(String[] args) {
		Pessoa yuri= new Pessoa("Yuri", "27/12/02", "Rua 6,174");
		Pessoa raquel= new Pessoa("Raquel", "15/12/02", "Rua Candido Castelo Branco,466");
		
		System.out.println("Nome: "+yuri.nome+" Data de Nascimento: "+yuri.nascimento+" Endereço: "+yuri.endereco);
		System.out.println(raquel.print());
	}
}

