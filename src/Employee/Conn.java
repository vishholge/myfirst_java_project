/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;

import  java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;
    public  Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project10","root","");
            // project10 is name of database here
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
