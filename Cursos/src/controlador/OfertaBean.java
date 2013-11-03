/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import Modelo.Oferta;
import banco.Banco;

/**
 *
 * @author samuel
 */
public class OfertaBean {
    
    Oferta oferta;

    public OfertaBean(Oferta oferta) {
        this.oferta = oferta;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    
    public boolean insertOferta() {
        Banco banco = new Banco();
         String sql = "INSERT INTO oferta (data_ini, ttl, lim_ins, id_curso) VALUES ("
                + "'" + this.oferta.getDateIni() + "', " + 
                + this.oferta.getTtl() + ", " + 
                + this.oferta.getLim_ins() + ", " 
                + this.oferta.getIdCurso() + ");";
        return banco.Insert(sql);
    }
    
}
