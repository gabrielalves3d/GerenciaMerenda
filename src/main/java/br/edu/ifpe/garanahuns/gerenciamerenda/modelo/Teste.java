/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.modelo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gabriel Alves
 */
public class Teste {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate.cfg.xml");
        EntityManager em = emf.createEntityManager();

        List<Insumo> lista = em.createQuery("FROM Insumo", Insumo.class).getResultList();

        for (Insumo objeto : lista) {
            System.out.println("Objeto no banco: " + objeto.getCodInsumo() + "," + objeto.getNome());
        }
        Insumo objeto = new Insumo();
        objeto.setNome("Feijão");
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        
        em.close();
        emf.close();

    }
}
