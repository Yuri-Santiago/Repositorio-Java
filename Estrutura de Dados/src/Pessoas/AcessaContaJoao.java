package Pessoas;

public class AcessaContaJoao {
////Main
	public static void main(String[] args) {
		ContaCorrente joao= new ContaCorrente("Banco do Brasil","012","012345","Jo�o da Silva", 1000);
		System.out.println(joao.print());
		
		joao.saque(135);
		System.out.println(joao.print());
	}
}
