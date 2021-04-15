package SeminárioListas.exemplo;

import java.util.ArrayList; 
import java.util.List;

public class Cliente {
////Atributos
	private final String nome;
	private final List<Compra> compras = new ArrayList<>();
////Metodos
	Cliente(String nome){
		this.nome= nome;
	}
	double getValorTotal() {
		double total=0;
		for(Compra compra: compras) {
			total+=compra.getValorCompra();
		}
		return total;
	}
	String listar() {
		String resultado ="Compras do(a) Cliente: "+nome+".\n\n";
		for(Compra compra: compras) {
			resultado+= "A compra em "+compra.getNome()+" tem os itens:\n"+compra.listarItems()+"==>Totalizando o valor de: "+compra.getValorCompra()+" R$.\n\n";
		}
		return resultado+= "O valor total das compras de "+nome+" foi de "+getValorTotal()+" R$.\n\n### Obrigado por comprar com a gente!! ###"; 
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	public String getNome() {
		return nome;
	}
}
