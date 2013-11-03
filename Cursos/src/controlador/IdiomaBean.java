/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.Idioma;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class IdiomaBean {
    
    Idioma idioma;

    public IdiomaBean(Idioma idioma) {
        this.idioma = idioma;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    
    public boolean insertIdioma () {
        Banco banco = new Banco();
         String sql = "INSERT INTO idioma (nidioma) VALUES ("
                + "'" + this.idioma.getNidioma() + "');";
        return banco.Insert(sql);
        
    }
    
}
