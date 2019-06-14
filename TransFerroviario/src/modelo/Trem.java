/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author wagner
 */
public class Trem {
    public String apelido;
    public int maxVagao;
    public int nunVagao;
    public float pesoTotalVagao;

    public Trem(String apelido, int maxVagao, int nunVagao, float pesoTotalVagao) {
        this.apelido = apelido;
        this.maxVagao = maxVagao;
        this.nunVagao = nunVagao;
        this.pesoTotalVagao = pesoTotalVagao;
    }

    public Trem() {
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getMaxVagao() {
        return maxVagao;
    }

    public void setMaxVagao(int maxVagao) {
        this.maxVagao = maxVagao;
    }

    public int getNunVagao() {
        return nunVagao;
    }

    public void setNunVagao(int nunVagao) {
        this.nunVagao = nunVagao;
    }

    public float getPesoTotalVagao() {
        return pesoTotalVagao;
    }

    public void setPesoTotalVagao(float pesoTotalVagao) {
        this.pesoTotalVagao = pesoTotalVagao;
    }
    
    
    
}
