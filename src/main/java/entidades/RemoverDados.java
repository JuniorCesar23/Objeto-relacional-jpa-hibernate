package entidades;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pessoa.Pessoa;

public class RemoverDados {
	
	public static void removerDados() {
		
		Scanner entrada = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Id: ");
			Integer id = entrada.nextInt();
			
		Pessoa pessoa = em.find(Pessoa.class, id);
		
		em.getTransaction().begin();
	
		em.remove(pessoa);
		
		em.getTransaction().commit();
		
		System.out.println("Removido com sucesso!");
		
		em.close();
		emf.close();
		entrada.close();
		
	}

}
