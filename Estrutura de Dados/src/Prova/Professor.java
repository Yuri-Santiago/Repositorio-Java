package Prova;

public class Professor extends Funcionario{
/////Atributos	
	private String formacao;
	private String nivel;
/////Métodos
	Professor(String matricula, String nome, String endereco, String formacao, String nivel){
		super(matricula,nome,endereco);
		this.formacao= formacao;
		this.nivel= nivel;
	}
	Professor() {
		super();
	}
	
	public void setFormacao (String formacao) {
		this.formacao=formacao;
	}
	public void setNivel (String nivel) {
		this.nivel=nivel;
	}

	public String setFormacao () {
		return formacao;
	}
	public String setNivel () {
		return nivel;
	}
	
	public void print2(){
		System.out.println("=====================");
		System.out.println("Matrícula: "+ getMatricula());
		System.out.println("Nome: "+ getNome());
		System.out.println("Endereço: "+ getEndereco());
		System.out.println("Formação: "+ formacao);
		System.out.println("Nível: "+ nivel);
		System.out.println("=====================");
	}
}
