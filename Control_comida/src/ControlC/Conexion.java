/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlC;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LabingXEON
 */
public class Conexion {
    Connection con=null;
    public Connection conex(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/control_comida","root","123456");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    
}
