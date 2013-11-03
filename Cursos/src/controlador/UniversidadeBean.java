/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.Universidade;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class UniversidadeBean {
    
    Universidade universidade;

    public UniversidadeBean(Universidade universidade) {
        this.universidade = universidade;
    }
    
    public boolean insertUniversidade () {
        Banco banco = new Banco();
        String sql = "INSERT INTO universidade (nome, publica, id_pais, id_end) VALUES (" +
               "'" + this.universidade.getNome() + "'" + ", " +
               "'" + this.universidade.isPublica() + "'" + ", " +
               this.universidade.getIdPais() + ", " +
               this.universidade.getIdEndereco() + ");";
        
        return banco.Insert(sql);
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    
    
    
}
