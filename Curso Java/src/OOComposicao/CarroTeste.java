package OOComposicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro polo= new Carro();
		System.out.println(polo.estaLigado());
		
		polo.ligar();
		System.out.println(polo.estaLigado());
		
		System.out.println(polo.motor.giros());
		
		polo.acelerar();
		polo.acelerar();
		polo.acelerar();
		polo.acelerar();
		
		System.out.println(polo.motor.giros());
		
		polo.frear();
		polo.frear();
		polo.frear();
		polo.frear();
		polo.frear();
		polo.frear();
		polo.frear();
		polo.frear();
		polo.frear();
		
		
		System.out.println(polo.motor.giros());
	}
}
