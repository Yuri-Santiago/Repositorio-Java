package Pessoas;

public class ContaCorrente {
////Atributos
	private String banco;
	private String agencia;
	private String conta;
	private String cliente;
	private double saldo;
////Metodos
	ContaCorrente(String banco, String agencia, String conta, String cliente, double saldo){
		this.banco= banco;
		this.agencia= agencia;
		this.conta= conta;
		this.cliente= cliente;
		this.saldo= saldo;
	}
	public String print(){
		String resultado= "Banco: "+(String) banco+" Agência: "+(String) agencia+" Conta: "+(String) conta+" Cliente: "+(String) cliente+" Saldo: "+(Double) saldo;
		return resultado;
	}
	public void saque(double retirado) {
		double resultado= saldo-retirado;
		this.saldo= resultado;
	}
}
