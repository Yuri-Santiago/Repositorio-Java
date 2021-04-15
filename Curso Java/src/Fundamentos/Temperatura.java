package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double temperaturaC= 0;
		double temperaturaF= 212;
		final double diminuicao= 32;
		final double razao= 5/9.0;
		
		temperaturaC= (temperaturaF-diminuicao)*razao;
		System.out.println(temperaturaC);
	}
}
