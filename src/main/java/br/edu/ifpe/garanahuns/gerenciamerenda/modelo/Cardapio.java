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
import javax.persistence.ManyToMany;

/**
 *
 * @author Gabriel Alves
 */
@Entity
public class Cardapio {
    @ManyToMany
    private List<Prato> pratos;
    @Id
    @GeneratedValue
     private long codCardapio;

    public Cardapio(List<Prato> pratos, int codCardapio) {
        this.pratos = pratos;
        this.codCardapio = codCardapio;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public long getCodCardapio() {
        return codCardapio;
    }

}
