/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import modelo.Trem;
import DAO.TremDAO;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import org.jdesktop.observablecollections.ObservableCollections;


/**
 *
 * @author wagner
 */
public class TremController {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);  
    private Trem tremDigitado;
    private Trem tremSelecionados;
    public List<Trem> listaTrens;
    private final TremDAO tremdao ;

    public TremController() {
        tremdao = new TremDAO();
        listaTrens = ObservableCollections.observableList(new ArrayList<Trem>());
        novo();
        pesquisar();
        
    }
    
    
    public void salvar(){
        tremdao.salvaTrem(tremDigitado);
        novo();
        pesquisar();
    }
    
    public void excluir(){
        tremdao.excluirTrem(tremDigitado);
        novo();
        pesquisar();
    }
     
    
    public void novo(){
        setTremDigitado(new Trem());
    }
    
    public void pesquisar(){
        listaTrens.clear();
        listaTrens.addAll(tremdao.pesquisar(tremDigitado));
    }
    
    
    // set e get 

    public Trem getTremDigitado() {
        return tremDigitado;
    }

    public void setTremDigitado(Trem tremDigitado) {
        Trem tremAntigo = this.tremDigitado;
        this.tremDigitado = tremDigitado;
        propertyChangeSupport.firePropertyChange("TremTXT",tremAntigo,tremDigitado);
        
    }

    public Trem getTremSelecionados() {
        return tremSelecionados;
    }

    public void setTremSelecionados(Trem tremSelecionados) {
        if(this.tremSelecionados !=null){
            setTremDigitado(tremSelecionados);
        }
        this.tremSelecionados = tremSelecionados;
    }

    public List<Trem> getListaTrens() {
        return listaTrens;
    }

    public void setListaTrens(List<Trem> listaTrens) {
        this.listaTrens = listaTrens;
    }
    
    
    
    
    
    
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
    
    
    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
    
   
}
