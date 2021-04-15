package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
	public static void main(String[] args) {
		Tio tio = new Tio("Celhim");
		Tio tia = new Tio("Jesuina");
		
		Sobrinho sobrinho= new Sobrinho("Yuri");
		Sobrinho sobrinha = new Sobrinho("Raquel");
		
		tia.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tia);
	
		tia.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tia);
		
		tio.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tio);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(tia)
			.incluir(tio)
			.incluir(sobrinha)
			.incluir(sobrinho)
			.fecharT()
			.fechar();
	}	
}
