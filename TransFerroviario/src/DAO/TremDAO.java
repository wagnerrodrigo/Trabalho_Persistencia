/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.persistence.EntityManager;
import modelo.Trem;
/**
 *
 * @author wagner
 */
public class TremDAO {
    
    public void salvaTrem(Trem trem){
        EntityManager em = Conexao.getEntityManager();
                     em.getTransaction().begin();
       if (trem.getNumero() != 0){
           trem = em.merge(trem);
       }
                     em.persist(trem);
                     em.getTransaction().commit();
                     em.close();
    }
    
    
     public void excluirTrem (Trem trem){
       EntityManager em = Conexao.getEntityManager();
                     em.getTransaction().begin();
                     trem = em.merge(trem);
                     em.remove(trem);
                     em.getTransaction().commit();
                     em.close();   
   }
    
}
