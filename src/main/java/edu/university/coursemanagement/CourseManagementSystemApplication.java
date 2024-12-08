package edu.university.coursemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;// JDBC Connection sınıfını import ettik
import edu.university.coursemanagement.connection.DatabaseConnection;  // DatabaseConnection sınıfını import ettik
@SpringBootApplication
public class CourseManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseManagementSystemApplication.class, args);

        // Veritabanı bağlantısını kurmak için DatabaseConnection sınıfını kullanıyoruz
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection connection = dbConnection.getConnection();  // Connection sınıfı burada kullanılıyor

        // Bağlantı başarılı ise mesaj yazdırılır
        if (connection != null) {
            System.out.println("Database connection is successful!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}

