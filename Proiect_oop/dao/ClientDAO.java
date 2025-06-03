package main.Java.pr.dao;

import main.Java.pr.Client;
import main.Java.pr.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO {

    public void addClient(Client client) {
        String sql = "INSERT INTO Client (nume, prenume, email) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, client.getNume());
            stmt.setString(2, client.getPrenume());
            stmt.setString(3, client.getEmail());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int generatedId = rs.getInt(1);
                client.setId(generatedId);
                System.out.println("Client adăugat cu ID gener: " + generatedId);
            }

        } catch (SQLException e) {
            System.out.println("Eroare la inserare client:");
            e.printStackTrace();
        }
    }
}
