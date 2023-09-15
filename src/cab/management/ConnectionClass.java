/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab.management;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dkkes
 */
public class ConnectionClass {
    Connection con;
    Statement stm;
    ConnectionClass(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/cab_management";
            String username= "root";
            String password="";
            con=DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]){
        new ConnectionClass();
    }
}

