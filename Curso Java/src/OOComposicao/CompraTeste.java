package OOComposicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra amazon = new Compra();
		Item abajur = new Item("Abajur", 1, 45);
		amazon.cliente = "Yuri";
		amazon.addItem(abajur);
		amazon.addItem("Caneta", 20, 7.5);
		amazon.addItem(new Item("Borracha", 10, 3));
		amazon.addItem(new Item("Caderno", 2, 19.50));
		
		System.out.println(amazon.itens.size());
		System.out.println(amazon.getValorTotal());
		
		for(Item item: amazon.itens) {	
			System.out.println(item.toString());
		}
	}
}
