/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Gabriel Alves
 */
@Entity
public class Prato {
    @Id
    @GeneratedValue
    private long codPrato;
    @OneToMany
    private List<ItemInsumo> itensInsumo;

    public Prato(int codPrato, List<ItemInsumo> itensInsumo) {
        this.codPrato = codPrato;
        this.itensInsumo = itensInsumo;
    }
    public Prato(){
    }
    
    public long getCodPrato() {
        return codPrato;
    }

    public List<ItemInsumo> getItensInsumo() {
        return itensInsumo;
    }

    public void setItensInsumo(List<ItemInsumo> itensInsumo) {
        this.itensInsumo = itensInsumo;
    }
    
    
}
