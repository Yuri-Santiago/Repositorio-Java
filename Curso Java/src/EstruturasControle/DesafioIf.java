package EstruturasControle;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite um dia da semana! ");
		String dia= entrada.next();
		
		if("domingo".equals(dia.toLowerCase())) {
			System.out.println(1);
		} else if("segunda".equals(dia.toLowerCase())) {
			System.out.println(2);
		} else if("ter�a".equals(dia.toLowerCase())) {
			System.out.println(3);
		} else if("quarta".equals(dia.toLowerCase())) {
			System.out.println(4);
		} else if("quinta".equals(dia.toLowerCase())) {
			System.out.println(5);
		} else if("sexta".equals(dia.toLowerCase())) {
			System.out.println(6);
		} else if("s�bado".equals(dia.toLowerCase())) {
			System.out.println(7);
		} else {
			System.out.println("Dia inv�lido, digite corretamente");
		}
		
		entrada.close();
	}
}
 