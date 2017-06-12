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
public class ItemInsumo  {
    private Insumo insumo;
    private int codItemInsumo;

    public ItemInsumo(Insumo insumo, int codItemInsumo) {
        this.insumo = insumo;
        this.codItemInsumo = codItemInsumo;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public int getCodItemInsumo() {
        return codItemInsumo;
    }

    

    
    
    
}
