package Fundamentos;

public class DesafioOperadoresLogi {
	public static void main(String[] args) {
		boolean terca= true;
		boolean quinta= true;
		boolean tv32= (terca ^ quinta);
		boolean tv50= (terca && quinta);
		boolean sorvete= (tv32 || tv50);
		boolean saude= !sorvete;
		
		System.out.println("Comprei a tv de 50: "+tv50);
		System.out.println("Comprei a tv de 32: "+tv32);
		System.out.println("Tomamos sorvete: "+sorvete);
		System.out.println("Ficamos saudavel: "+saude);
	}
}
