/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import modelo.Trem;
import DAO.TremDAO;

import modelo.Vagao;

/**
 *
 * @author wagner
 */
public class TremController {
    
    public List<Vagao> listaVagoes;
    public List<Trem> listaTrens;

     
    
    public void inserirTrens (Trem trem){
        listaTrens.add(trem);
    }
    
    
    
    public Trem buscarTrens(int num){
        Trem tr = null;
        for(Trem trem:listaTrens){
            
            if (trem.getNumero() == num)    // pegar o numero de vagao ou de trens ???
                tr = trem;
        }
        return tr;
    }
    
    
    public Vagao buscarVagao(int numV){
        Vagao va = null;
        for(Vagao vagao:listaVagoes){
            if(vagao.getNunVagao() == numV)
                va = vagao;
        }
        return va;
    }
}
