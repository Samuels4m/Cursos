/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import java.sql.Connection;

/**
 *
 * @author samuel
 */
public class Banco {
    
    Postgres postgres;
    Connection con;

    public Banco() {
        this.postgres = new Postgres();
    }
    
    
    
}
