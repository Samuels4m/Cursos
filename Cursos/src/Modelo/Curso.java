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
public class Curso {

    int idCurso;
    String nomeCurso;
    String descCurso;
    boolean cert;
    int idIdioma;

    public Curso(int idCurso, String nomeCurso, String descCurso, boolean cert, int idIdioma) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.descCurso = descCurso;
        this.cert = cert;
        this.idIdioma = idIdioma;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDescCurso() {
        return descCurso;
    }

    public void setDescCurso(String descCurso) {
        this.descCurso = descCurso;
    }

    public boolean isCert() {
        return cert;
    }

    public void setCert(boolean cert) {
        this.cert = cert;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

}
