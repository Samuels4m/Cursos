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
public class Universidade {

    int idUnivercidade;
    String nome;
    boolean publica;
    int idPais;
    int idEndereco;

    public Universidade(int idUnivercidade, String nome, boolean publica, int idPais, int idEndereco) {
        this.idUnivercidade = idUnivercidade;
        this.nome = nome;
        this.publica = publica;
        this.idPais = idPais;
        this.idEndereco = idEndereco;
    }

    public int getIdUnivercidade() {
        return idUnivercidade;
    }

    public void setIdUnivercidade(int idUnivercidade) {
        this.idUnivercidade = idUnivercidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPublica() {
        return publica;
    }

    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

}
