package RevisaoJava;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i=1, f=1;
		
		System.out.print("Que n�mero fatorial voc� deseja: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			f*= i;
		}
		System.out.print("O fatorial de "+n+" � igual a: "+f);
	}
}
