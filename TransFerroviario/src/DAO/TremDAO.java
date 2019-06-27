/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
    
     public List<Trem> pesquisar(Trem trem){
         EntityManager em = Conexao.getEntityManager();
        StringBuilder sql = new StringBuilder("from Trem tr where 1=1");
         
        if(trem.getNumero() != 0){
            sql.append("and tr.numero= :numero");
        }
        if(trem.getApelido() !=null && !trem.getApelido().equals("")){
            sql.append("and tr.apelido like :apelido");
        }
        
        if(trem.getMaxVagao() != 0){
            sql.append("and tr.maxVagao like :maxVagao");
        }
        
        if(trem.getNunVagao()!=0){
         sql.append("and tr.nunVagao like :numVagao");
     }
        if(trem.getPesoTotalVagao() != 0){
            sql.append("and tr.pesoTotalVagao like :pesoTotalVagao");
        }
         Query query = em.createQuery(sql.toString());
         
         if (trem.getNumero() !=0) {
             query.setParameter("numero", trem.getNumero());
         }
         
         if (trem.getApelido() !=null && !trem.getApelido().equals("")) {
             query.setParameter("apelido","%" + trem.getApelido());
         }
         if (trem.getMaxVagao() !=0) {
             query.setParameter("maxVagao", trem.getMaxVagao());
         }
         if (trem.getNunVagao() !=0) {
             query.setParameter("numVagao", trem.getNunVagao());
         }
         if(trem.getPesoTotalVagao() !=0){
             query.setParameter("pesoTotalVaga", trem.getPesoTotalVagao());
         }
         return query.getResultList();
     }
}
