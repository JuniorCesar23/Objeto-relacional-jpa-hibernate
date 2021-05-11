package entidades;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pessoa.Pessoa;

public class InserirDados {

	public static void inserirDados() {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("E-mail: ");
			String email = entrada.next();
			
		System.out.println("Senha: ");
			String senha = entrada.next();
		
		Pessoa pessoa = new Pessoa(email, senha);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(pessoa);

		em.getTransaction().commit();

		System.out.println("Pronto!");
		
		em.close();
		emf.close();
		entrada.close();
	}

}
