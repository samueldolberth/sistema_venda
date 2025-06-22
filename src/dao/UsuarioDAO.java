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
    
    
    public void adiciona(Usuario usuario) throws SQLException{
        
        try (connection) {
            String sql = "INSERT INTO usuario(login, senha) VALUES (?, ?);";
            try {
                PreparedStatement statement = connection.prepareStatement (sql);
                statement.setString(1, usuario.getNome());
                statement.setString(2, usuario.getSenha());
                statement.execute();
                statement.close();
                
            } catch(SQLException u){
                throw new RuntimeException(u);
            }
                
        }
            
            
            
        
    }
    
}
