package Classes;

public class Jantar {
	 public static void main(String[] args) {
		Comida feijao= new Comida("Feijão", 0.5);
		Comida macarrao= new Comida("macarrao", 1);
		
		Pessoa yuri= new Pessoa("Yuri", 62.5);
		
		System.out.println(yuri.peso);
		yuri.Comer(macarrao);
		System.out.println(yuri.peso);
		yuri.Comer(feijao);
		System.out.println(yuri.peso);
	}
}
