
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    public static void main(String[] args){
        System.out.println(DbConnection.getDB());
    }
    
    public static Connection getDB()
    {
        Connection conn=null;
        String url="jdbc:mysql://localhost:3306/mms";
        String user="root";
        String passpord="1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, passpord);
            } catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
         catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        return conn;
    }
    
}
