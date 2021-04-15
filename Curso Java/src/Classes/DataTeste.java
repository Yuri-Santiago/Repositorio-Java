package Classes;

public class DataTeste {
	public static void main(String[] args) {
		Data um= new Data(27,12,2002);
		Data dois= new Data(15,12,2020);
		
		String print1= um.dataFormatada();
		String print2= dois.dataFormatada();
		System.out.println(print1);
		System.out.println(print2);
	}
}
