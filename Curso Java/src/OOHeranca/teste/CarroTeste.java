package OOHeranca.teste;

import OOHeranca.desafio.Carro;
import OOHeranca.desafio.Onix;
import OOHeranca.desafio.Prisma;

public class CarroTeste {
////Main
	public static void main(String[] args) {
		Carro c1 = new Prisma(180);
		Carro c2 = new Onix(250);
		
		System.out.println(c1.velocidade);
		System.out.println(c2.velocidade);
		
		c1.velocidade= 170;
		c2.velocidade= 240;
		
		System.out.println(c1.velocidade);
		System.out.println(c2.velocidade);
		
		c1.acelerar();
		c2.acelerar();
		
		System.out.println(c1.velocidade);
		System.out.println(c2.velocidade);
		
		c1.acelerar();
		c2.acelerar();
		
		System.out.println(c1.velocidade);
		System.out.println(c2.velocidade);
		
	}
}
