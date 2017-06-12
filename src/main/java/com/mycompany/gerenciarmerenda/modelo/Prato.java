/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciarmerenda.modelo;

import java.util.List;

/**
 *
 * @author Gabriel Alves
 */
public class Prato {
    
    private int codPrato;
    private List<ItemInsumo> itensInsumo;

    public Prato(int codPrato, List<ItemInsumo> itensInsumo) {
        this.codPrato = codPrato;
        this.itensInsumo = itensInsumo;
    }
    public Prato(){
    }
    
    public int getCodPrato() {
        return codPrato;
    }

    public List<ItemInsumo> getItensInsumo() {
        return itensInsumo;
    }

    public void setItensInsumo(List<ItemInsumo> itensInsumo) {
        this.itensInsumo = itensInsumo;
    }
    
    
}
