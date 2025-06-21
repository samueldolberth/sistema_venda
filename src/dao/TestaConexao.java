/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Adm
 */
public class TestaConexao {
    public static void main(String [] arg) throws SQLException{
        Connection connection = new Conexao().getConnection();
        JOptionPane.showMessageDialog(null, "Conexão aberta com sucesso!");
        connection.close();
        
    }
}
