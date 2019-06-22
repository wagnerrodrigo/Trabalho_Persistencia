/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
/**
 *
 * @author wagner
 */
public class Vagao {
    public int codigo;
    public int anoFabricacao;
    public int carga;
    public int nunVagao; // numero do vagao deve ser do vagao e nao do trem
    public float peso;
    public String destinoVagao;

    
    public Vagao() {
    }
    
    public int getNunVagao() {
        return nunVagao;
    }

    public void setNunVagao(int nunVagao) {
        this.nunVagao = nunVagao;
    } 
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
