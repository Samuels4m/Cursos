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
public class UniversidadeCurso {

    int idUni;
    int idCurso;

    public UniversidadeCurso(int idUni, int idCurso) {
        this.idUni = idUni;
        this.idCurso = idCurso;
    }

    public int getIdUni() {
        return idUni;
    }

    public void setIdUni(int idUni) {
        this.idUni = idUni;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

}
