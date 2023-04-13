/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection; //COnexão SQL para java
import java.sql.DriverManager; //driver de conexão SQL para java
import java.sql.SQLException; //classe para tratamento de exceções

/**
 *
 * @author CAMARGO
 */
public class ConnectionFactory {

    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }

    }

}
