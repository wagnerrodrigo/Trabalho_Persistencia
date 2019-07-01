/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
      StringBuilder sql = new StringBuilder("from Vagao va where 1=1");
      
      
          if (vagao.getCodigo() !=0) {
              sql.append("and va.codigo= :codigo");
          }
          if (vagao.getCarga() !=0 ) {
              sql.append("and va.carga like :carga");
          }
          if (vagao.getNunVagao() !=0) {
              sql.append("and va.nunVagao like :nunVagao");
          }
          if (vagao.getAnoFabricacao() !=0) {
              sql.append("and va.anoFabricacao like :ano");
          }
          if (vagao.getPeso() !=0) {
              sql.append("and va.peso like :ano");
              
          }
           Query query = em.createQuery(sql.toString());
           
           if (vagao.getCodigo() !=0) {
              query.setParameter("codigo", vagao.getCodigo());
          }
           if (vagao.getCarga() != 0){
               query.setParameter("carga", vagao.getCarga());
           }
           if (vagao.getNunVagao() !=0) {
              query.setParameter("nunVagao", vagao.nunVagao);
          }
           if(vagao.getAnoFabricacao() !=0){
               query.setParameter("anoFabricacao", vagao.getAnoFabricacao());
           }
           if(vagao.getPeso() !=0){
               query.setParameter("peso", vagao.getPeso());
           }
            return query.getResultList();             
          }
          
}
