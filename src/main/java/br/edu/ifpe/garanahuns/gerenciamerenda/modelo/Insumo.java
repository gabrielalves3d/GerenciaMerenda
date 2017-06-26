/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Gabriel Alves
 */
@Entity
public class Insumo {

    @Id
    @GeneratedValue
    private long codInsumo;
    @Column
    private String nome;
    @Column
    private TipoUnidade tipo;

    public Insumo(int codInsumo, String nome, TipoUnidade tipo) {
        this.codInsumo = codInsumo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Insumo() {

    }

    public long getCodInsumo() {
        return codInsumo;
    }

    public String getNome() {
        return nome;
    }

    public TipoUnidade getTipo() {
        return tipo;
    }

    public void setTipo(TipoUnidade tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
