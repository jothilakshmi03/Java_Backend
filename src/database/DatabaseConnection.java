package database;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/college";
        String user="root";
        String password="jyothii_143ee";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected successfully");
            Statement st= con.createStatement();
            PreparedStatement ps=con.prepareStatement("delete from student_info where roll_no=?");
//            if(rs>0){
//                System.out.println("row deleted successfully");
//            }else {
//                System.out.println("No row found with roll_no=1");
//            }
            ps.setInt(1,3);
            ps.executeUpdate();
            System.out.println("deleted successfully");
            st.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


