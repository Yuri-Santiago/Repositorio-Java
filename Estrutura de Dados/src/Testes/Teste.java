package Testes;

public class Teste {
	public static void main(String[] args) {
		System.out.println(Teste.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
		
	}
	public static int[] sortArray(int[] array) {
			  int[] novo = new int[20];
					for(int i=0; i<array.length; i++) {
						int j=0;
						if(array[i]%2==0 || array[i]==0) {
							
						} else {
							novo[j] = array[i];
							j++;
						}	
					}
					
					int PASS = 0;
					int temp = 0;
					while (PASS <= novo.length-2) { 
						int cont = 0;
						while (cont <= novo.length-2) {
							if (novo[cont] > novo[cont+1]){ 
								temp = novo[cont];
								novo[cont] = novo[cont+1];
								novo[cont+1] = temp; 
							}
							cont++; 
						}
						PASS++; 
					}
					
					for(int i=0; i<array.length; i++) {
						int n=0;
						if(array[i]%2==0) {
						} else {
							array[i] = novo[n];
							n++;
						}
					}
					return array;
				}
}
