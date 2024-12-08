/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=UniversityCourseSelection;encrypt=true;trustServerCertificate=true";  // SQL Server bağlantı URL'si
    private final String USER = "sa";  // Veritabanı kullanıcı adı (örneğin SQL Server için 'sa')
    private final String PASSWORD = "1234";  // Veritabanı şifresi

    public Connection getConnection() {
        try {
            // SQL Server JDBC sürücüsünü yükler
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Veritabanı bağlantısını oluşturur
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;  // Bağlantı başarısızsa null döner
        }
    }
}
