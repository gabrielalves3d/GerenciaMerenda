/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    @Enumerated(EnumType.STRING)
    private TipoUnidade tipo;
    @Column
    private double quantidade;

    public Insumo(int codInsumo, String nome, TipoUnidade tipo, double quantidade) {
        this.codInsumo = codInsumo;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade=quantidade;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
}
