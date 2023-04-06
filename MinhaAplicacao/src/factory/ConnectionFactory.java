/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.Connection; //Conexão SQL para java
import java.sql.DriverManager; //Driver de conexão SQL para java
import java.sql.SQLException; //Classe para tratamentos de exceções
/**
 *
 * @author CAMARGO
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","root","");
        }
        
        catch(SQLException excecao){
        throw new RuntimeException(excecao);
        }
        
    }
}
