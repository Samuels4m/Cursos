/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Postgres {

    String url;
    String usuario;
    String senha;

    public Postgres() {

        this.url = "jdbc:postgresql://localhost:5432/Curso";
        this.usuario = "postgres";
        this.senha = "postgres";

    }

    public Connection criarConexao() {
        try {
            Connection con = DriverManager.getConnection(this.url,
                    this.usuario, this.senha);

            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
