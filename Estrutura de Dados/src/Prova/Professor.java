package Prova;

public class Professor extends Funcionario{
/////Atributos	
	private String formacao;
	private String nivel;
/////M�todos
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
		System.out.println("Matr�cula: "+ getMatricula());
		System.out.println("Nome: "+ getNome());
		System.out.println("Endere�o: "+ getEndereco());
		System.out.println("Forma��o: "+ formacao);
		System.out.println("N�vel: "+ nivel);
		System.out.println("=====================");
	}
}
