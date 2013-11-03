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
public class ProfessorIdioma {
    
    int ndoc;
    int idIdioma;

    public ProfessorIdioma(int ndoc, int idIdioma) {
        this.ndoc = ndoc;
        this.idIdioma = idIdioma;
    }

    public int getNdoc() {
        return ndoc;
    }

    public void setNdoc(int ndoc) {
        this.ndoc = ndoc;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }
    
    
    
}
