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
    int idSerial;
    Date dataIni;
    String status;
    String avl;

    public AlunoOferta(int nDoc, int idSerial, Date dataIni, String status, String avl) {
        this.nDoc = nDoc;
        this.idSerial = idSerial;
        this.dataIni = dataIni;
        this.status = status;
        this.avl = avl;
    }

    public int getnDoc() {
        return nDoc;
    }

    public void setnDoc(int nDoc) {
        this.nDoc = nDoc;
    }

    public int getIdSerial() {
        return idSerial;
    }

    public void setIdSerial(int idSerial) {
        this.idSerial = idSerial;
    }

    public Date getDataIni() {
        return dataIni;
    }

    public void setDataIni(Date dataIni) {
        this.dataIni = dataIni;
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
