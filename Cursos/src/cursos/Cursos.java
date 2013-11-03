/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos;

import controlador.EnderecoBean;
import Modelo.Aluno;
import Modelo.Categoria;
import Modelo.Curso;
import Modelo.Endereco;
import Modelo.Idioma;
import Modelo.Oferta;
import Modelo.Pais;
import Modelo.Professor;
import Modelo.Universidade;
import banco.Banco;
import controlador.AlunoBean;
import controlador.CategoriaBean;
import controlador.CursoBean;
import controlador.IdiomaBean;
import controlador.OfertaBean;
import controlador.PaisBean;
import controlador.ProfessorBean;
import controlador.UniversidadeBean;
import java.sql.Date;

/**
 *
 * @author samuel
 */
public class Cursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dn = new Date(1992, 02, 02);
        Date dh = new Date(02, 10, 2013);
        
        
        Oferta of = new Oferta(0, dn, 10, 20, 1);
        OfertaBean ofb = new OfertaBean(of);
        
        ofb.insertOferta();
    }

}
