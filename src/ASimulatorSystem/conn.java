package ASimulatorSystem;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
           Class.forName("com.mysql.jdbc.Driver");
Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/nirmalya", "root", "nirmalya");
            s=con.createStatement();
           System.out.println("connected");
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
    public static void main(String[] args){
        new conn();
    }
}  