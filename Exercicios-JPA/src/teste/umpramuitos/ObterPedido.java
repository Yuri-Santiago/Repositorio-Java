package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(1L);
		
		for(ItemPedido i : pedido.getItens()) {
			System.out.println(i.getQuantidade());
			System.out.println(i.getProduto().getNome());
		}
		
		dao.fechar();
	}
}
