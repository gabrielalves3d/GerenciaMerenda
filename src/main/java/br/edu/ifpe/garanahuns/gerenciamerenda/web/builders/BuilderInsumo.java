/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanahuns.gerenciamerenda.web.builders;

import br.edu.ifpe.garanahuns.gerenciamerenda.modelo.Insumo;
import br.edu.ifpe.garanahuns.gerenciamerenda.modelo.TipoUnidade;

/**
 *
 * @author Gabriel Alves
 */
public class BuilderInsumo {
    private int codInsumo;
    private String nome;
    private TipoUnidade tipo;

   

    public TipoUnidade getTipoUnidade() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoUnidade(TipoUnidade tipo) {
        this.tipo = tipo;
    }
    
    public Insumo buildInsumo(){
        return new Insumo(codInsumo,nome,tipo);
    }

}
