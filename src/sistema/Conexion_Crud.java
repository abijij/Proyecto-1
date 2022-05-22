
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion_Crud {
    
    public static Connection getConexion(){
        
    String url="jdbc:sqlserver://localhost:1433;"
            + "databaseName=sistema;"
            + "user=ConexionJ;"
            + "password=1234;";
    
    try{
        Connection con = DriverManager.getConnection(url);
        return con;
    }catch(SQLException e){
        System.out.println(e.toString());
        return null;
        
    }
       
    
    }  
    
}
