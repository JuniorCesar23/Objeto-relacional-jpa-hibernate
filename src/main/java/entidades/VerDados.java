package entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pessoa.Pessoa;

public class VerDados {
	
	public static void verDados(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = em.find(Pessoa.class, id);
		
		System.out.println("Pessoa - " + pessoa);
	}

}
