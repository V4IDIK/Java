package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlConnectivity {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Clg_DB", "root", "password");
            System.out.println("Connected");
            Statement set=con.createStatement();
            ResultSet rs=set.executeQuery("select * from Test1");
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}


