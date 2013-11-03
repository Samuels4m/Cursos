/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author samuel
 */
public class ProfessorOferta {

    int ndoc;
    int idOferta;

    // Date dateIni;
    public ProfessorOferta(int ndoc, int idOferta) {
        this.ndoc = ndoc;
        this.idOferta = idOferta;
    }

    public int getNdoc() {
        return ndoc;
    }

    public void setNdoc(int ndoc) {
        this.ndoc = ndoc;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

}
