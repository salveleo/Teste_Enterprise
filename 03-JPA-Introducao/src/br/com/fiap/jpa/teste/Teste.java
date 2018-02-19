package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Carro;
import br.com.fiap.jpa.entity.Transmissao;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		
		Carro carro = new Carro("Golf", 2017, "1.2", "LEO-1999", "wolksvagem", new GregorianCalendar(2010, Calendar.JANUARY,2), false, false, null, Transmissao.AUTOMATICA);
		
		
		em.getTransaction().begin(); //Inicializa uma transação
		em.persist(carro);
		em.getTransaction().commit();// Realiza o commit
		
		
		em.close();
		fabrica.close();

	}

}
