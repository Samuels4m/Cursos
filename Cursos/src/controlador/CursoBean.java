/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.Curso;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class CursoBean {
    Curso curso;

    public CursoBean(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public boolean insertCurso () {
                Banco banco = new Banco();
         String sql = "INSERT INTO curso (titulo, descr, cert, id_idioma) VALUES ("
                + "'" + this.curso.getNomeCurso() + "', "  
                + "'" + this.curso.getDescCurso() + "', "  
                + "'" + this.curso.isCert() + "', "
                + this.curso.getIdIdioma() + ");";
        return banco.Insert(sql);
    }
}
