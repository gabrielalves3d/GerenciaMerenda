/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciamerenda.persistencia.implemntacoes.bancodedados;

import com.mycompany.gerenciamerenda.persistencia.comportamentos.RepositorioGenerico;
import com.mycompany.gerenciarmerenda.modelo.Insumo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Alves
 */
public class RepositorioInsumoImplBANCO implements RepositorioGenerico<Insumo, String> {

    private List<Insumo> listaInsumo = null;

    protected RepositorioInsumoImplBANCO() {
        this.listaInsumo = new ArrayList<>();

    }

    @Override
    public void inserir(Insumo t) {
        this.listaInsumo.add(t);
    }

    @Override
    public void alterar(Insumo t) {
        for (Insumo ta : this.listaInsumo) {

            if (ta.getCodInsumo() == t.getCodInsumo()) {
                ta.setNome(t.getNome());
                ta.setQuantidade(t.getQuantidade());

            }

        }
    }

    @Override
    public Insumo recuperar(String g) {
        for (Insumo ta : this.listaInsumo) {
            if (ta.getNome() == g) {
                return ta;
            }
        }
        return null;
    }

    @Override
    public void excluir(Insumo t) {
        this.listaInsumo.remove(t);
    }

    @Override
    public List recuperarTodos() {
        return this.listaInsumo;
    }

}
