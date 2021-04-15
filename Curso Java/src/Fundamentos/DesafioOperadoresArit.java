package Fundamentos;

public class DesafioOperadoresArit {
	public static void main(String[] args) {
		int a= 6*(3+2);
		int b= 3*2;

		int c= (int) Math.pow(a,2);
		int d= c/b;
		
		int e= (1-5)*(2-7);
		int f= 2;
		
		int g= e/f;
		int h= (int) Math.pow(g,2);
		
		int i= d-h;
		int j= (int) Math.pow(i,3);
		
		int k= (int) Math.pow(10,3);
		
		int l= j/k;
		System.out.println(l);
	}
}
