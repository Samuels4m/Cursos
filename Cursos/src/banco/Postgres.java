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

    String drive;
    String url;
    String usuario;
    String senha;

    public Postgres() {
        this.drive = "org.postgresql.Driver";
        this.url = "jdbc:postgresql://localhost:5432/Curso";
        this.usuario = "postgres";
        this.senha = "postgres";

    }
}
