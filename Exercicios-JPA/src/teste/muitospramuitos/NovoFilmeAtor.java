package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars ep 4", 8.1);
		Filme filmeB = new Filme("Blade Runner", 9.8);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.addrAtor(atorA);
		filmeA.addrAtor(atrizB);
		
		filmeB.addrAtor(atorA);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);
		
	}
}
