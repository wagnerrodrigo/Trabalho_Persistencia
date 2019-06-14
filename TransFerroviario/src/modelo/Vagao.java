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
public class Vagao {
    public int codigo;
    public int anoFabricacao;
    public int carga;
    public float peso;

    public Vagao(int codigo, int anoFabricacao, int carga, float peso) {
        this.codigo = codigo;
        this.anoFabricacao = anoFabricacao;
        this.carga = carga;
        this.peso = peso;
    }

    public Vagao() {
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
