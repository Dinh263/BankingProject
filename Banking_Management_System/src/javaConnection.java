
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DinhN
 */
public class javaConnection {
    public static void main(String[]args){
        System.out.println(System.getProperty("user.dir"));
    }
    
    Connection conn = null;
    
    public static Connection ConnectionDB(){
        
        try{
            Class.forName("org.sqllite.JDBC");
            String currentPathofDB = System.getProperty("user.dir")+"/databases/bank.sqlite";
            Connection conn = DriverManager.getConnection("jdbc:sqlite:"+currentPathofDB);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
