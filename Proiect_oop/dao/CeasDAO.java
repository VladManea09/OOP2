package main.Java.pr.dao;

import main.Java.pr.Ceas;
import main.Java.pr.db.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CeasDAO {

    private static CeasDAO instance;

    private CeasDAO() {}

    public static CeasDAO getInstance() {
        if (instance == null) {
            instance = new CeasDAO();
        }
        return instance;
    }

    public void addCeas(Ceas ceas, int clientId) {
        String sql = "INSERT INTO Ceas (marca, model, pret, client_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, ceas.getMarca());
            stmt.setString(2, ceas.getModel());
            stmt.setDouble(3, ceas.getPret());
            stmt.setInt(4, clientId);

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Eroare la inserare ceas: " + e.getMessage());
        }
    }

    public List<Ceas> getAllCeasuri() {
        List<Ceas> ceasuri = new ArrayList<>();
        String sql = "SELECT * FROM Ceas";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Ceas c = new Ceas(
                        rs.getString("marca"),
                        rs.getString("model"),
                        rs.getDouble("pret")
                );
                ceasuri.add(c);
            }

        } catch (SQLException e) {
            System.out.println(" Eroare la citire ceasuri: " + e.getMessage());
        }

        return ceasuri;
    }

    public void updatePret(int id, double pretNou) {
        String sql = "UPDATE Ceas SET pret = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, pretNou);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Eroare la update preț: " + e.getMessage());
        }
    }

    public void deleteCeas(int id) {
        String sql = "DELETE FROM Ceas WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Eroare la ștergere ceas: " + e.getMessage());
        }
    }
}
