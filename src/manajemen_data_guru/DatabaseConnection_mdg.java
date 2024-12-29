/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen_data_guru;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lenov
 */
public class DatabaseConnection_mdg {
    
    private static final String URL="jdbc:mysql://localhost:3306/manajemen_data_guru"; // kampus=nama database
    private static final String USER="root";
    private static final String PASSWORD="";
    
    public static Connection connect() throws SQLException {
        // Mengembalikan koneksi ke database
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Koneksi ke database gagal: " + e.getMessage());
        }
    }
}
    
