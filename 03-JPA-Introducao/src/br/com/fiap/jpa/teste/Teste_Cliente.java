package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Sexo;
import br.com.fiap.jpa.entity.Status;

public class Teste_Cliente {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		
		Cliente cliente = new Cliente("Leonardo Rocha", new GregorianCalendar(1999, Calendar.NOVEMBER, 26), 1234654, Sexo.Masc, null, Status.Ativo);
		
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		
		em.close();
		fabrica.close();
		
		
		
	}

}
