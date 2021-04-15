package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Polo",4,false);
		Carro c2 = new Carro("Prisma",4,true);
		Carro c3 = new Carro("Onix",4,true);
		Carro c4 = new Carro("Ferrari",2,true);
		Carro c5 = new Carro("Hilux",2,false);
		Carro c6 = new Carro("Doblo",3,true);
		Carro c7 = new Carro("Siena",4,true);
		Carro c8 = new Carro("206",2,true);
		Carro c9 = new Carro("Pampa",2,false);
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c8, c9);
		
		Predicate<Carro> quatroPortas = c -> c.portas == 4;
		Predicate<Carro> temAr = c -> c.ar == true;
		Function<Carro, String> anunciarCarro = c -> "O carro "+c.nome+" tem 4 Portas e Ar condicionado";
		Consumer<String> printNome = c -> System.out.println(c);
		
		carros.stream()
		.filter(quatroPortas)
		.filter(temAr)
		.map(anunciarCarro)
		.forEach(printNome);
	}
}
