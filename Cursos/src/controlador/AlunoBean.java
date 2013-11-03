/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Aluno;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class AlunoBean {

    Aluno aluno;

    public AlunoBean(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean insertAluno(Aluno aluno) {
       banco.Banco bd = new Banco();
       String sql = "INSERT INTO aluno (ndoc, nome, data_nasc, data_cad, mail, id_pais) VALUES (" +
               aluno.getnDoc() + ", " +
               "'" + aluno.getNome() + "'" + ", " +
               "'" + aluno.getData_nasc() + "'" + ", " +
               "'" + aluno.getData_cad() + "'" + ", " +
               "'" + aluno.getMail() + "'" + ", " +
               aluno.getId_pais() +
               ");";
       return bd.Insert(sql);
    }

    /*
     *Get e Set
     */
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
