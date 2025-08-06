package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java7pm";
        String username = "root";
        String password = "jyothii_143ee";
        try {
            //setting up jdbc connection in java

            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connected successfully");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from employee");
            while (rs.next()) {
                int id=rs.getInt("id");
                String name=rs.getNString("name");
                String email=rs.getNString("email");
                System.out.println("ID : "+id+" Name : "+name+" Email : "+email);
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//        String url = "jdbc:mysql://localhost:3306/java7pm";
//        String username = "root";
//        String password = "root";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("connected successfully");
//
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
