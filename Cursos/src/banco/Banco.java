/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author samuel
 */
public class Banco {

    Postgres postgres;

    public Banco() {
        this.postgres = new Postgres();
    }

    public boolean Insert(String sql) {

        try {
            Class.forName(this.postgres.drive);
            Connection con;
            con = (Connection) DriverManager.getConnection(this.postgres.url, this.postgres.usuario, this.postgres.senha);
            System.out.println("Conexão realizada com sucesso.");
            Statement stm = con.createStatement();
            PreparedStatement pstm = con.prepareStatement(sql);
        // SETA OS PARAMETROS DO PREPAREDSTATEMENT AQUI!  
            int rs = 0;
            rs = Integer.parseInt(sql, pstm.executeUpdate());
      
            return true;

        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }

        return false;
    }

}
