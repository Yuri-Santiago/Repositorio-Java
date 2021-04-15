package OOHeranca.desafio;

public class Carro {
////Atributos
	public double velocidade;
	private final int VELOCIDADE_MAXIMA;
	private int delta= 5;
////Metodos
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public void acelerar() {
		if(velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade= VELOCIDADE_MAXIMA;
		} else {			
			velocidade+= delta;
		}
	}
	
	public void frear(){
		if(velocidade >= 5 ) {			
			velocidade-= 5;
		} else if (velocidade>=0) {
			velocidade=0;
		}
	}
	
	
}