/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chitchat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DataBaseConnection {
   
   public static Statement connection(){
       try{
        Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded");
       }
       catch(Exception e){
           System.out.println("Driver not loaded"); 
       }
       
       Connection con=null;
       try{
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chitchat","root","");
           System.out.println("Connection Established");
       }
       catch(Exception f){
           System.out.println("Connection is not established");
       }
       
        Statement st=null;
       try{
            st= con.createStatement();
       }
       
       catch(Exception g){
           
       }
       return st;
   } 

    
    
}
