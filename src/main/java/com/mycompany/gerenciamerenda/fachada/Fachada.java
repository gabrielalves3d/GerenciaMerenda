/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciamerenda.fachada;

import com.mycompany.gerenciamerenda.persistencia.comportamentos.RepositorioGenerico;
import com.mycompany.gerenciamerenda.persistencia.implemntacoes.bancodedados.FactoryRepositorios;
import com.mycompany.gerenciarmerenda.modelo.Insumo;
import java.util.List;

/**
 *
 * @author Gabriel Alves
 */
public class Fachada {
    private static Fachada myself = null;
    
    private RepositorioGenerico<Insumo,String> repositorioInsumo = null;
    
    Fachada(){
        this.repositorioInsumo = FactoryRepositorios.fabricarRepositorio(FactoryRepositorios.INSUMO, 
                FactoryRepositorios.BANCODADOS);
    }
    public static Fachada getInstance(){
        if(myself==null)
            myself = new Fachada();
        
        return myself;
    }
    public void inserir(Insumo insumo){
        this.repositorioInsumo.inserir(insumo);
    }
    public void alterar(Insumo insumo){
        this.repositorioInsumo.alterar(insumo);
    }
    public void excluir(Insumo insumo){
        this.repositorioInsumo.excluir(insumo);
    }
    public Insumo recuperarInsumo(String nome){
        return this.repositorioInsumo.recuperar(nome);
    }
    public List<Insumo> recuperarTodosInsumo(){
        return this.repositorioInsumo.recuperarTodos();
    }
    
}
