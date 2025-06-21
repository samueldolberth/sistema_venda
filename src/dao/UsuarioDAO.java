/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Usuario;
import java.sql.*;

/**
 *
 * @author Adm
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    
    public void insert(Usuario usuario) throws SQLException{
        
        String sql = "INSERT INTO usuario(login, senha) VALUES ('"+usuario.getLogin()+"', '"+usuario.getSenha()+"');"; 
        PreparedStatement statement = connection.prepareStatement (sql);
        statement.execute();
        connection.close();
            
            
            
            
        
    }
    
}
