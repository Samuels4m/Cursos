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
public class Oferta {
    int idOferta;
    Date dateIni;
    int ttl;
    int lim_ins;
    int idCurso;

    public Oferta(int idOferta, Date dateIni, int ttl, int lim_ins, int idCurso) {
        this.idOferta = idOferta;
        this.dateIni = dateIni;
        this.ttl = ttl;
        this.lim_ins = lim_ins;
        this.idCurso = idCurso;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public Date getDateIni() {
        return dateIni;
    }

    public void setDateIni(Date dateIni) {
        this.dateIni = dateIni;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public int getLim_ins() {
        return lim_ins;
    }

    public void setLim_ins(int lim_ins) {
        this.lim_ins = lim_ins;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

}
