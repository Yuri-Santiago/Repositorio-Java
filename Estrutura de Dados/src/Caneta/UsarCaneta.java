package Caneta;

public class UsarCaneta {
	public static void main(String[] args) {
		Canetas azul = new Canetas("Azul",false);
		azul.print();
		azul.Escrever();
		azul.TrocarTampa();
		System.out.println("");
		azul.print();
		azul.Escrever();
		azul.TrocarTampa();
		System.out.println("");
		azul.print();
	}
}
