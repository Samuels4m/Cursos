/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.Professor;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class ProfessorBean {
    
    Professor professor;

    public ProfessorBean(Professor professor) {
        this.professor = professor;
    }
    
    public boolean insertProfessor () {
        Banco banco = new Banco();
        String sql= "INSERT INTO professor (ndoc, nome, data_nasc, data_cad, resumop) VALUES (" +
                this.professor.getnDoc() + ", " +
               "'" + this.professor.getNome() + "'" + ", " +
               "'" + this.professor.getData_nasc() + "'" + ", " +
               "'" + this.professor.getData_cad() + "'" + ", " +
               "'" + this.professor.getResumop() + "');";
        return banco.Insert(sql);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
}
