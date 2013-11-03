package controlador;


import Modelo.Endereco;
import banco.Banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class EnderecoBean {
    Endereco endereco;

    public EnderecoBean(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public boolean insertEndereco() {
        Banco banco = new Banco();
        String sql = "INSERT INTO endereco (estado, cidade, numero, cod_pos, comp) VALUES (" +
               "'" + this.endereco.getEstado() + "'" + ", " +
               "'" + this.endereco.getCidade() + "'" + ", " +
               this.endereco.getNumero() + ", " +
               this.endereco.getCodPostal() + ", " +
                "'" + this.endereco.getCodPostal() + "');";
        
             
        return banco.Insert(sql);
    }
}
