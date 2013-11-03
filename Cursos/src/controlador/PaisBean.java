/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Pais;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class PaisBean {

    Pais pais;

    public PaisBean(Pais pais) {
        this.pais = pais;
    }

    public boolean cadastrarPais(Pais pais) {
        banco.Banco bd = new Banco();
        String sql = "INSERT INTO pais (npais) VALUES ("
                + "'" + pais.getNomePais()
                + "');";
        return bd.Insert(sql);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
