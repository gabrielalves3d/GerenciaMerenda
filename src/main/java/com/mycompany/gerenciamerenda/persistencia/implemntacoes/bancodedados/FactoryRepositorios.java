/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciamerenda.persistencia.implemntacoes.bancodedados;

import com.mycompany.gerenciamerenda.persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author Gabriel Alves
 */
public class FactoryRepositorios {
    public static final int INSUMO = 1;
    public static final int ITEMINSUMO = 2;
    public static final int PRATO = 3;
    public static final int CARDAPIO = 4;
    public static final int BANCODADOS = 1;
    
    public static RepositorioGenerico fabricarRepositorio(int tipoNegocio, int tipoPersistencia){
        if(tipoPersistencia == BANCODADOS){
            if(tipoNegocio==INSUMO){
                return new RepositorioInsumoImplBANCO();
            }
        }
        return null;
    }
}
