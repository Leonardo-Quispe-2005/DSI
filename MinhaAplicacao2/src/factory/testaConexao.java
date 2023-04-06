package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testaConexao {
    public static void main(String[] args)throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Conexão Aberta");
        }
        catch(Exception e){
            
        }
    }
}
