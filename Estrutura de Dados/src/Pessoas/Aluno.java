package Pessoas;

import java.util.Scanner;

public class Aluno extends Pessoa{
/////Atributos
	private String nota;
	private String turma;
/////Metodos
	Aluno (String nome, String nascimento, String endereco , String nota, String turma){
		super(nome,nascimento,endereco);
		this.nota= nota;
		this.turma= turma;
	}
	Aluno (){
		super();
	}
	public void setNota (String nota) {
		this.nota=nota;
	}
	public void setTurma (String turma) {
		this.turma=turma;
	}
	public String getNota() {
		return nota;
	}
	public String getTurma() {
		return turma;
	}
	
	public String print() {
		String resultado= "Nome: "+getNome()+" Data de Nascimento: "+getNascimento()+" Endereço: "+getEndereco()+" Nota: "+nota+" Turma: "+turma;
		return resultado;
	}
/////Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno novo = new Aluno();
		System.out.println("Digite seu nome");
		novo.setNome(sc.nextLine());
		System.out.println(novo.print());
		Aluno yuri= new Aluno("Yuri", "27/12/02", "Rua 6, 174", "100", "Java");
		System.out.println(yuri.print());
		
	}
}
