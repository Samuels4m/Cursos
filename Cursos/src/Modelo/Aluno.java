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
public class Aluno {
    
    int nDoc;
    String nome;
    Date data_nasc;
    Date data_cad;
    String mail;
    int id_pais;

    public Aluno(int nDoc, String nome, Date nome_nasc, Date data_cad, String mail, int id_pais) {
        this.nDoc = nDoc;
        this.nome = nome;
        this.data_nasc = nome_nasc;
        this.data_cad = data_cad;
        this.mail = mail;
        this.id_pais = id_pais;
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

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }


    public Date getData_cad() {
        return data_cad;
    }

    public void setData_cad(Date data_cad) {
        this.data_cad = data_cad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
    
    
    
}
