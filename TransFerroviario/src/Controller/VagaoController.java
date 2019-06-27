/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import DAO.VagaoDAO;
import modelo.Vagao;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author wagner
 */
public class VagaoController {
    
     private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
     private Vagao vagaoDigitado;
     private Vagao vagaoSelecionado;
    public List<Vagao> listaVagoes;
    private final VagaoDAO vagaodao;
    
    public VagaoController(){
        vagaodao = new VagaoDAO();
        listaVagoes = ObservableCollections.observableList(new ArrayList<Vagao>());
        novo();
        pesquisar();
    }
    
    public void salvar(){
        vagaodao.salvaVagao(vagaoDigitado);
        novo();
        pesquisar();
    }
    
    public void pesquisar(){
        listaVagoes.clear();
        listaVagoes.addAll(vagaodao.pesquisar(vagaoDigitado));
    }
    
    public void excluirVagao(){
        vagaodao.excluirVagao(vagaoDigitado);
        novo();
        pesquisar();
    }
    
    public void novo(){
        setVagaoDigitado(new Vagao());
    }
  
    
    
    // get e set
    
     public Vagao getVagaoDigitado() {
        return vagaoDigitado;
    }

    public void setVagaoDigitado(Vagao vagaoDigitado) {
        Vagao velhoVagao = this.vagaoDigitado;
        this.vagaoDigitado = vagaoDigitado;
        propertyChangeSupport.firePropertyChange
        ("VagaoDigitado", velhoVagao, vagaoDigitado);
    }

    public Vagao getVagaoSelecionado() {
        return vagaoSelecionado;
    }

    public void setVagaoSelecionado(Vagao vagaoSelecionado) {
        if(this.vagaoSelecionado != null){
            setVagaoDigitado(vagaoSelecionado);
        }
        this.vagaoSelecionado = vagaoSelecionado;
    }

    public List<Vagao> getListaVagoes() {
        return listaVagoes;
    }

    // get e set
    public void setListaVagoes(List<Vagao> listaVagoes) {
        this.listaVagoes = listaVagoes;
    }

    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
    
    
    
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
