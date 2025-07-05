package com.eventhub.users.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.eventhub.users.model.Users;
import com.eventhub.users.utils.RandomUtils;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final String JDBC_URL = "jdbc:postgresql://localhost:5432/database-name";
    private final String JDBC_USER = "postgres";
    private final String JDBC_PASSWORD = "postgres";

    public Users createUser(Users user) {
        String insertQuery = "INSERT INTO users (firstName, lastName, email, phoneNumber, location, password) VALUES (?, ?, ?, ?, ?, ?)";

        String generatedId = RandomUtils.createId();
        user.setUserId(generatedId);

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_URL, JDBC_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

            stmt.setString(1, user.getUserId());
            stmt.setString(2, user.getFirstName());
            stmt.setString(3, user.getLastName());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getPhoneNumber());
            stmt.setString(6, user.getLocation());
            stmt.setString(7, user.getPassword());
            stmt.setTimestamp(8, Timestamp.valueOf(user.getCreatedAt()));
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Users findByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Users user = new Users();
                    user.setUserId(rs.getString("userId"));
                    user.setFirstName(rs.getString("firstName"));
                    user.setLastName(rs.getString("lastName"));
                    user.setEmail(rs.getString("email"));
                    user.setPhoneNumber(rs.getString("phoneNumber"));
                    user.setLocation(rs.getString("location"));
                    user.setPassword(rs.getString("password"));
                    user.setCreatedAt(rs.getTimestamp("createdAt").toLocalDateTime());

                    return user;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public List<Users> findAll() {
        List<Users> users = new ArrayList<>();
        String fetch_query = "SELECT * FROM users";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(fetch_query)) {

            while (rs.next()) {
                users.add(new Users(
                        // rs.getString();
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}