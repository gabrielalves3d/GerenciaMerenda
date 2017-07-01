/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.apresentacao.controladores;

import br.edu.ifpe.garanahuns.gerenciamerenda.modelo.Insumo;
import br.edu.ifpe.garanahuns.gerenciamerenda.persistencia.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanahuns.gerenciamerenda.persistencia.dao.DaoManagerHiber;
import br.edu.ifpe.garanahuns.gerenciamerenda.persistencia.implementacoes.FactoryRepositorios;
import java.util.List;

/**
 *
 * @author Gabriel Alves
 */
public class Fachada {

    private static Fachada myself = null;

    private RepositorioGenerico<Insumo, Integer> repositorioInsumo = null;

    private Fachada() {
        this.repositorioInsumo = FactoryRepositorios.fabricarRepositorio(FactoryRepositorios.INSUMO, FactoryRepositorios.BANCODADOS);

    }

    public static Fachada getInstance() {
        if (myself == null) {
            myself = new Fachada();
        }
        return myself;
    }
    public void inserirInsumoBD(Insumo t){
        DaoManagerHiber.getInstance().persist(t);
    }
    public void alterarInsumoBD(Insumo t){
        DaoManagerHiber.getInstance().update(t);
    }
    public Insumo recuperarInsumoBD(Integer g) {
        try {
            return (Insumo) DaoManagerHiber.getInstance().recover("from Insumo where codigo=" + g).get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    public void excluirInsumoBD(Insumo t){
        DaoManagerHiber.getInstance().delete(t);
    }
    public List<Insumo> recuperarTodosBD(){
        return DaoManagerHiber.getInstance().recover("from Insumo");
    }

}
