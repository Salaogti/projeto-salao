/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salao.Model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KAIQUE
 */
public class Conexaobd {
    
    private String meuIP = "127.0.0.1";
    
    private String usuario;
    
     
    private String senha;
    
    
    private String url;

    
    public Conexaobd() {
        this.usuario = "root";
        this.senha = "123456";
        this.url = meuIP+":3306/Salao";
    }
    
   
    public Conexaobd(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.url = meuIP+":3306/Salao";
    }
    
   
    public Conexaobd(String usuario, String senha, String url) {
        this.usuario = usuario;
        this.senha = senha;
        this.url = url;
    }
    
   
    public Connection getConexao() throws SQLException{
        Connection conex;
        String urlDB = "jdbc:mysql://" + this.url;
        conex = DriverManager.getConnection(urlDB, 
                                this.usuario, this.senha);
        return conex;
    }
    
}
