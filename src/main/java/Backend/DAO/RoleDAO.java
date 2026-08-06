package Backend.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Backend.DataBase;
import Backend.MODEL.Role;
import Backend.MODEL.User;

public class RoleDAO {
	
	public static Role findAll(int id) {
		String sql = """
					SELECT *
					FROM roles
					WHERE id = ?
					""";
		
		try (Connection con = DataBase.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {

	            ps.setInt(1, id);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {

	                Role role = new Role();

	                role.setId(rs.getInt("id"));
	                role.setRoleName(rs.getString("role_name"));
	                role.setDescription(rs.getString("description"));

	                return role;
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		
		return null;
	}

}
