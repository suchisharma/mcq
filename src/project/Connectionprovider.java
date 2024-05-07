/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author ankit
 */
public class Connectionprovider {
 public static Connection getcon()
 {
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinemcq","root","ehIy1p@1");
         return con;    
     }
     catch(Exception e)
     {
         return null;
     }
 }
}
