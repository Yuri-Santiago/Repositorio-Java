package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 8L);
		usuario.setNome("Tiago");
		usuario.setEmail("tiago@gmail.com");
		
		//em.merge(usuario);
		//Atualiza do mesmo jeito :O
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
