/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.modelo;

/**
 *
 * @author Gabriel Alves
 */
public enum TipoUnidade {
    UN(1),KG(2),PCT(3);
    
    private final int valor;

    private TipoUnidade(int valorOpcao) {
        this.valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }
    
    
    
}
