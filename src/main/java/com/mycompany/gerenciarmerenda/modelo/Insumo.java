/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciarmerenda.modelo;

/**
 *
 * @author Gabriel Alves
 */
public class Insumo {
    private int codInsumo;
    private String nome;
    private int quantidade;

    public Insumo(int codInsumo, String nome, int quantidade) {
        this.codInsumo = codInsumo;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public Insumo(){
        
    }

    public int getCodInsumo() {
        return codInsumo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
