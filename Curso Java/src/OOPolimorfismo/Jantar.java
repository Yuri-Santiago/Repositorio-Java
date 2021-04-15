package OOPolimorfismo;

public class Jantar {
////Main
	public static void main(String[] args) {
		Pessoa yuri = new Pessoa(62.7);
		
		Arroz ingrediente1 = new Arroz(0.750);
		Feijao ingrediente2 = new Feijao(0.500);
		Sorvete ingrediente3 = new Sorvete(0.05);
		
		System.out.println(yuri.getPeso());
		
		yuri.comer(ingrediente1);
		yuri.comer(ingrediente2);
		System.out.println(yuri.getPeso());
		
		yuri.comer(ingrediente3);
		System.out.println(yuri.getPeso());
	}
}
