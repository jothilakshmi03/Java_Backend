package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/college";
        String user="root";
        String password="jyothii_143ee";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println("connected Successfully");
            PreparedStatement ps=con.prepareStatement("Update student_info set name=? where roll_no=2");
            ps.setString(1,"mohini");
            ps.executeUpdate();
            System.out.println("updated successfully");
            ResultSet rs=ps.executeQuery("select * from student_info");
            while (rs.next()){
                int roll_no=rs.getInt("roll_no");
                String name=rs.getNString("name");
                String dept=rs.getNString("dept");
                System.out.println("rollNo : "+roll_no+" name : "+name+" dept : "+dept);

            }
            rs.close();
            ps.close();
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
