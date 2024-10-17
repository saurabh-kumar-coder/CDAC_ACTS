import java.sql.*;

public class StudentSQL {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the initial connection to create the database
            // mysql-container this name is to be container name of mysql
            con = DriverManager.getConnection("jdbc:mysql://mysql-container:3306?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");

            stmt = con.createStatement();

            // Create the database if it does not exist
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS cdac";
            stmt.executeUpdate(createDatabaseSQL);

            // Close the initial connection
            stmt.close();
            con.close();

            // Establish the connection to the newly created database
            // mysql-container this name is to be container name of mysql
            con = DriverManager.getConnection("jdbc:mysql://mysql-container:3306/cdac?useSSL=false", "root", "root");

            // Create the student table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student ("
                    + "PRN INT NOT NULL PRIMARY KEY, "
                    + "student_name CHAR(50), "
                    + "course CHAR(30)"
                    + ")";
            stmt = con.createStatement();
            stmt.execute(createTableSQL);

            // Insert SQL statement
            String insertSQL = "INSERT INTO student VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(insertSQL);

            // Insert three rows
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Student 1");
            pstmt.setString(3, "DAC");
            pstmt.executeUpdate();

            pstmt.setInt(1, 2);
            pstmt.setString(2, "Student 2");
            pstmt.setString(3, "DITISS");
            pstmt.executeUpdate();

            pstmt.setInt(1, 3);
            pstmt.setString(3, "Student 3");
            pstmt.setString(3, "DAI");
            pstmt.executeUpdate();

            // Select SQL statement
            String preparedSQL = "SELECT prn, student_name, course FROM student";
            pstmt = con.prepareStatement(preparedSQL);

            // Execute the select query
            rs = pstmt.executeQuery();

            // Display the results
            while (rs.next()) {
                int prn = rs.getInt("prn");
                String name = rs.getString("student_name");
                String course = rs.getString("course");
                System.out.println("PRN: " + prn + ", Name: " + name + ", Course: " + course);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

