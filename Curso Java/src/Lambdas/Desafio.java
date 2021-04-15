package Lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = (produto) -> produto.preco * (1-produto.desconto);
		
		UnaryOperator<Double> imposto = (valor) -> valor >= 2500 ? valor * 1.085 : valor;    
		
		UnaryOperator<Double> frete = (valor) -> valor >= 3000 ? valor + 100  : valor + 50;
		
		Function<Double, String> formatar = (valor) -> {
			String preco= new DecimalFormat("#,##0.00").format(valor);
			return "R$"+preco;
		};
		
		System.out.println(precoReal.andThen(imposto).andThen(frete).andThen(formatar).apply(p));
	}
}
