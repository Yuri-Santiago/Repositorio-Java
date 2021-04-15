package Lambdas;

public class CalculoTeste3 {
	public static void main(String[] args) {
		Calculo calculo = (x,y) -> { return x + y; };
		
		System.out.println(calculo.executar(4, 3));
		
		calculo = (x,y) -> x*y;
		System.out.println(calculo.executar(4, 3));
	}
}