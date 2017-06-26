/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Gabriel Alves
 */
@Entity
public class ItemInsumo  {
    
    @ManyToOne
    private Insumo insumo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codItemInsumo;

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

    public long getCodItemInsumo() {
        return codItemInsumo;
    }

    

    
    
    
}
