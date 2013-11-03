/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author samuel
 */
public class Idioma {

    int idIdioma;
    String nidioma;

    public Idioma(int idIdioma, String nidioma) {
        this.idIdioma = idIdioma;
        this.nidioma = nidioma;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNidioma() {
        return nidioma;
    }

    public void setNidioma(String nidioma) {
        this.nidioma = nidioma;
    }

}
