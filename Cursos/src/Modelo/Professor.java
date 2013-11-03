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
public class Professor {

    int nDoc;
    String nome;
    Date nome_nasc;
    Date data_cad;
    String resumop;

    public Professor(int nDoc, String nome, Date nome_nasc, Date data_cad, String resumop) {
        this.nDoc = nDoc;
        this.nome = nome;
        this.nome_nasc = nome_nasc;
        this.data_cad = data_cad;
        this.resumop = resumop;
    }

    public int getnDoc() {
        return nDoc;
    }

    public void setnDoc(int nDoc) {
        this.nDoc = nDoc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNome_nasc() {
        return nome_nasc;
    }

    public void setNome_nasc(Date nome_nasc) {
        this.nome_nasc = nome_nasc;
    }

    public Date getData_cad() {
        return data_cad;
    }

    public void setData_cad(Date data_cad) {
        this.data_cad = data_cad;
    }

    public String getResumop() {
        return resumop;
    }

    public void setResumop(String resumop) {
        this.resumop = resumop;
    }

}
