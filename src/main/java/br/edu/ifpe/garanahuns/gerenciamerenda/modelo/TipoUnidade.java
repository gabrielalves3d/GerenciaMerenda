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
    UNIDADE(1),KILOGRAMA(2),PACOTE(3),LITRO(4);
    
    private final int valor;

    TipoUnidade(int valorOpcao) {
        this.valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }
    
    
    
}
