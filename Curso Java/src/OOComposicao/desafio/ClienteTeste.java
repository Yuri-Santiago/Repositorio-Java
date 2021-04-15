package OOComposicao.desafio;

public class ClienteTeste {
////Main
	public static void main(String[] args) {
		Cliente raquel = new Cliente("Raquel");
		
		Compra amazon = new Compra();
		Compra americanas = new Compra();
		
		Produto p1 = new Produto("Notebook", 2500);
		Produto p2 = new Produto("Tv 40", 3400);
		
		Produto p3 = new Produto("Caneta", 5);
		Produto p4 = new Produto("Caderno", 15);
		
		Item i1 = new Item(1,p1);
		Item i2 = new Item(1,p2);
		
		Item i3 = new Item(4,p3);
		Item i4 = new Item(2,p4);
		
		amazon.addItem(i1);
		amazon.addItem(i2);
		
		americanas.addItem(i3);
		americanas.addItem(i4);
		
		raquel.addCompra(amazon);
		raquel.addCompra(americanas);
		
		System.out.println(raquel.getValorTotal());
	}
}
