/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import modelo.Trem;
import modelo.Vagao;

/**
 *
 * @author wagner
 */
public class VagaoController {
    
    public List<Trem> listaTrens;
    public List<Vagao> listaVagoes;
    
    public void inserVagoes(Vagao vagao) // o vagao sera o numero de vagaos que eu quero inserir
    {
        listaVagoes.add(vagao);  // posso usar essa estrutura para colocar o numero maximo de vagão
    }
    
    public Vagao buscarVagoes(int numero){ // posso usar o nunVagao e essa estrutura para pegar um(expecifico) vagao na lista de vagao
        Vagao va = null;
        for(Vagao vagao: listaVagoes)
        {
            if(vagao.getCodigo() == numero)
                va = vagao;
        }
        return va;
    }

    
}
