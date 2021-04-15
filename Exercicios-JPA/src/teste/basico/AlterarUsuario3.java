package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 8L);
		em.detach(usuario);//Tira o objeto do estado gerenciado
		usuario.setNome("Tiago");
		usuario.setEmail("tiago@gmail.com");
		
		//Se executasse aqui, o que aconteceria
		//Não atualiza, pois o objeto não está gerenciado
		
		//Mas se executasse com esse comando de baixo:
		em.merge(usuario);
		//Agora atualiza, pois ele deixa o objeto gerenciado
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
