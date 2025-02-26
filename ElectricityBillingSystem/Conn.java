package ElectricityBillingSystem;

import java.sql.*;

public class Conn {
    public Statement s;
    private Connection c;

    public Conn() {
        try {
            //load kiya hai
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection banaya hai
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "123456789");
            // statement
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Optional: Close the connection when done
    public void close() {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}