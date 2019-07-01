/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferroviario;


import modelo.Trem;
import modelo.Vagao;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author wagner
 */
public class TransFerroviario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trem trem = new Trem();
        trem.setApelido("wagner");
        
        Vagao vagao = new Vagao();
        vagao.setCarga(1);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TransFerroviarioPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(trem);
        em.getTransaction().commit();
        
        em.clear();
        em.close();

    }
    
}
