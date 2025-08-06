package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
            int rs= st.executeUpdate("delete from student_info where roll_no=1");
            if(rs>0){
                System.out.println("row deleted successfully");
            }else {
                System.out.println("No row found with roll_no=1");
            }
            st.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
