package Classes;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome= nome;
		this.peso= peso;
	}
	
	void Comer(Comida exemplo) {
		this.peso+= exemplo.peso;
	}
}
