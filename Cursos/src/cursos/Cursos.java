/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos;

import controlador.EnderecoBean;
import Modelo.Aluno;
import Modelo.Endereco;
import Modelo.Pais;
import Modelo.Professor;
import Modelo.Universidade;
import banco.Banco;
import controlador.AlunoBean;
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
        
        Professor professor = new Professor(123, "OIIII", dn, dh, "Não sei oq significa isso");
        ProfessorBean pb = new ProfessorBean(professor);
        
        pb.insertProfessor();
        
    }
    
}
