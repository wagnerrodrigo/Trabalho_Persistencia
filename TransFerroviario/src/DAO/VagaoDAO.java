/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Vagao;

/**
 *
 * @author wagner
 */
public class VagaoDAO {
     public void salvaVagao(Vagao vagao){
        EntityManager em = Conexao.getEntityManager();
                     em.getTransaction().begin();
       if (vagao.getCodigo() != 0){
           vagao = em.merge(vagao);
       }
                     em.persist(vagao);
                     em.getTransaction().commit();
                     em.close();
    }
    
    
     public void excluirVagao (Vagao vagao){
       EntityManager em = Conexao.getEntityManager();
                     em.getTransaction().begin();
                     vagao = em.merge(vagao);
                     em.remove(vagao);
                     em.getTransaction().commit();
                     em.close();   
   }
     
      public List<Vagao> pesquisar(Vagao vagao){
      EntityManager em = Conexao.getEntityManager();
}
