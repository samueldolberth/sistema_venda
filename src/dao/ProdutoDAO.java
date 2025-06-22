/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Produto;

/**
 *
 * @author Adm
 */
public class ProdutoDAO {
    
    private final Connection connection;
    
    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void adiciona(Produto produto) throws SQLException{
        
        try (connection) {
            String sql = "INSERT INTO produto(descricao, preco) VALUES ('"+produto.getDescricao()+"', '"+produto.getPreco()+"');";
            PreparedStatement statement = connection.prepareStatement (sql);
            statement.execute();
        }
            
            
            
            
        
    }
    
}
