package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos númerico Reais
		byte anosDeEmpresa= 23;
		short numeroDeVoos= 542;
		int id= 56789;
		long pontosAcumulados= 12345678910L;
		
		//Tipos númericos reais
		float salario= 0.44F;
		double vendasAcumuladas= 2993884.56;
		
		//Tipo booleano
		boolean estaDeFerias= false;
		
		//Tipo caractere
		char status= 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		//Ele
		System.out.println(id+": ganha "+salario);
		System.out.println("Férias? "+estaDeFerias);
		System.out.println("Status: "+status);
	}
}
