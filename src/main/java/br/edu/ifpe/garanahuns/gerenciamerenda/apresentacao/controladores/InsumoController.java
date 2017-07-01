/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.apresentacao.controladores;

import br.edu.ifpe.garanahuns.gerenciamerenda.persistencia.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanahuns.gerenciamerenda.modelo.Insumo;
import br.edu.ifpe.garanahuns.gerenciamerenda.persistencia.implementacoes.FactoryRepositorios;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel Alves
 */
@ManagedBean
@SessionScoped
public class InsumoController {
    RepositorioGenerico<Insumo, Integer> repositorioInsumo = null;
    
    private Insumo selectedInsumo, insumoParaAlterar;
    
    public InsumoController(){
        this.repositorioInsumo = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.INSUMO, FactoryRepositorios.BANCODADOS);
    }
    public String inserir(Insumo insumo) {
        this.repositorioInsumo.inserir(insumo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O insumo foi criado com sucesso"));
        
        return "ApresentarInsumo.xhtml";
    }
     
     public String alterar(){
        repositorioInsumo.alterar(insumoParaAlterar);
        return "ApresentarInsumo.xhtml";
    }

    public String alterar(Insumo insumo) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O insumo foi alterado com sucesso"));
        this.repositorioInsumo.alterar(insumo);
        return "ApresentarInsumo.xhtml";
        
    }

    public Insumo recuperarInsumo(int codigo) {
        
        return this.repositorioInsumo.recuperar(codigo);
    }

    public void excluir(Insumo insumo) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O insumo foi excluída com sucesso!"));
        this.repositorioInsumo.excluir(insumo);
    }

    public List<Insumo> recuperarTodos() {
        return this.repositorioInsumo.recuperarTodos();
    }

    public Insumo getSelectedInsumo() {
        return selectedInsumo;
    }

    public void setSelectedInsumo(Insumo selectedInsumo) {
        this.selectedInsumo = selectedInsumo;
    }

    public Insumo getInsumoAlterar() {
        return insumoParaAlterar;
    }

    public String setInsumoParaAlterar(Insumo insumoParaAlterar) {
        this.insumoParaAlterar = insumoParaAlterar;
        return "AlterarInsumo.xhtml";
    }
    
}
