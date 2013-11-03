/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.Categoria;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class CategoriaBean {
    
    Categoria categoria;

    public CategoriaBean(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public boolean insertBean () {
        Banco banco = new Banco();
        String sql = "INSERT INTO categoria (ncat) VALUES ("
                + "'" + this.categoria.getNomeCategoria() + "');";
        return banco.Insert(sql);
    }
    
}
