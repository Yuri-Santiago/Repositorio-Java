package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		Cliente cliente = daoCliente.obterPorId(2L);
		Assento assento = daoAssento.obterPorId(2L);
		
		System.out.println(cliente.getAssento().getNome());
		System.out.println(assento.getCliente().getNome());
		
		daoCliente.fechar();
		daoAssento.fechar();
	}
}
