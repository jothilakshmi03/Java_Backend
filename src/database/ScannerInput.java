package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ScannerInput {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String password = "jyothii_143ee";
            Scanner scanner = new Scanner(System.in);

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, username, password);
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your dept: ");
                String dept = scanner.nextLine();

                System.out.print("Enter your Age: ");
                int age= scanner.nextInt();

                PreparedStatement ps = con.prepareStatement("insert into student_info (name, dept,age) VALUES (?, ?,?)");
                ps.setString(1, name);
                ps.setString(2, dept);
                ps.setInt(3,age);

                 ps.executeUpdate();
                 System.out.println("inserted successfully!");

                ps.close();
                con.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

