package main.Java.pr.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:sqlserver://localhost:4970;databaseName=Atelier_ceasuri_oop;encrypt=false;trustServerCertificate=true";
    private static final String USER = "vladmanea";
    private static final String PASSWORD = "Septembrie0905!";
    private static Connection connection;

    private DBConnection() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }
}
