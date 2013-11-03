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
public class AlunoOferta {
    int nDoc;
    int idOferta;
    //Date dataIni;
    String status;
    String avl;

    public AlunoOferta(int nDoc, int idOferta, String status, String avl) {
        this.nDoc = nDoc;
        this.idOferta = idOferta;
        this.status = status;
        this.avl = avl;
    }

    public int getnDoc() {
        return nDoc;
    }

    public void setnDoc(int nDoc) {
        this.nDoc = nDoc;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvl() {
        return avl;
    }

    public void setAvl(String avl) {
        this.avl = avl;
    }

    
    
}
