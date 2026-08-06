package Backend.DAO;

import Backend.DataBase;
import Backend.MODEL.Role;
import Backend.MODEL.User;
import Backend.DAO.RoleDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {

    // ==========================
    // CREATE USER
    // ==========================
    public static boolean createUser(User user) {

        String sql = """
                INSERT INTO users
                (first_name, last_name, role, email, password_hash)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection con = DataBase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setInt(3, user.getUserRole().getId());
            ps.setString(4, user.getUserEmail());
            ps.setString(5, user.getPasswordHash());

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ==========================
    // FIND USER BY EMAIL
    // ==========================
    public static User findByEmail(String email) {

        String sql = """
                SELECT *
                FROM users
                WHERE email = ?
                """;

        try (Connection con = DataBase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

            	
            	int roleId = rs.getInt("role_id");

            	Role role = RoleDAO.findById(roleId);
            	
                User user = new User();

                user.setUserId(rs.getInt("id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setUserRole(role);
                user.setUserEmail(rs.getString("email"));
                user.setPasswordHash(rs.getString("password_hash"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // ==========================
    // FIND USER BY ID
    // ==========================
    public static User findById(int id) {

        String sql = """
                SELECT *
                FROM users
                WHERE id = ?
                """;

        try (Connection con = DataBase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	int roleId = rs.getInt("role_id");

                Role role = RoleDAO.findById(roleId);

                User user = new User();

                user.setUserId(rs.getInt("id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setUserRole(role);
                user.setUserEmail(rs.getString("email"));
                user.setPasswordHash(rs.getString("password_hash"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // ==========================
    // UPDATE USER
    // ==========================
    public static boolean updateUser(User user) {

        String sql = """
                UPDATE users
                SET
                    first_name = ?,
                    last_name = ?,
                    role = ?,
                    email = ?,
                    password_hash = ?
                WHERE id = ?
                """;

        try (Connection con = DataBase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setInt(3, user.getUserRole().getId());
            ps.setString(4, user.getUserEmail());
            ps.setString(5, user.getPasswordHash());
            ps.setInt(6, user.getUserId());

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ==========================
    // DELETE USER
    // ==========================
    public static boolean deleteUser(int id) {

        String sql = """
                DELETE FROM users
                WHERE id = ?
                """;

        try (Connection con = DataBase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
 static boolean changePassword(int userId, String newPassword) {

        String sql = """
                UPDATE users
                SET password_hash = ?
                WHERE id = ?
                """;

        try (Connection con = DataBase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newPassword);
            ps.setInt(2, userId);

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
