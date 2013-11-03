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
    int idSerial;
    Date dateIni;

    public ProfessorOferta(int ndoc, int idSerial, Date dateIni) {
        this.ndoc = ndoc;
        this.idSerial = idSerial;
        this.dateIni = dateIni;
    }

    public int getNdoc() {
        return ndoc;
    }

    public void setNdoc(int ndoc) {
        this.ndoc = ndoc;
    }

    public int getIdSerial() {
        return idSerial;
    }

    public void setIdSerial(int idSerial) {
        this.idSerial = idSerial;
    }

    public Date getDateIni() {
        return dateIni;
    }

    public void setDateIni(Date dateIni) {
        this.dateIni = dateIni;
    }
    
    
}
