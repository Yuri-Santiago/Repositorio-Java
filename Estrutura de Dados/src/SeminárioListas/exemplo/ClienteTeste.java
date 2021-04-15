package SeminárioListas.exemplo;

public class ClienteTeste {
////Main
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 2590.70);

		Produto p2 = new Produto("Tv 40", 3466);
		Produto p3 = new Produto("Caneta", 5.5);
		Produto p4 = new Produto("Caderno", 15.80);
		
		Produto p5 = new Produto("Fogão", 1550.98);
		Produto p6 = new Produto("Geladeira", 1764.50);
		
		Item i1 = new Item(1,p1);
		
		Item i2 = new Item(1,p2);
		Item i3 = new Item(4,p3);
		Item i4 = new Item(2,p4);
				
		Item i5 = new Item(1, p5);
		Item i6 = new Item(1, p6);
		
		Compra c1 = new Compra("Amazon");
		Compra c2 = new Compra("Americanas");
		Compra c3 = new Compra("Magazine Luiza");
		
		Cliente raquel = new Cliente("Raquel Maciel");
		
		c1.addItem(i1);
		
		c2.addItem(i2);
		c2.addItem(i3);
		c2.addItem(i4);
		
		c3.addItem(i5);
		c3.addItem(i6);
		
		raquel.addCompra(c1);
		raquel.addCompra(c2);
		raquel.addCompra(c3);
		
		System.out.println(raquel.listar());
	}
}
