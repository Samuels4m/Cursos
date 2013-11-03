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
public class ProfessorUniversidade {

    int ndoc;
    int idUni;

    public ProfessorUniversidade(int ndoc, int idUni) {
        this.ndoc = ndoc;
        this.idUni = idUni;
    }

    public int getNdoc() {
        return ndoc;
    }

    public void setNdoc(int ndoc) {
        this.ndoc = ndoc;
    }

    public int getIdUni() {
        return idUni;
    }

    public void setIdUni(int idUni) {
        this.idUni = idUni;
    }

}
