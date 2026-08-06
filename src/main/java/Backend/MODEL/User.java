package Backend.MODEL;
import java.util.ArrayList;

import Backend.MODEL.Role;
import Components.DropDowns.CompRoleInput;

public class User {
	
	
//	private static ArrayList<Users> allUsers;
	private int userId;
	private String firstName;
	private String lastName;
	private Role role;
	private String userEmail;
	private String passwordHash;
//	static ArrayList<User> allUsers =new ArrayList<>();
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		lastName = lastName;
	}
	public Role getUserRole() {
		return role;
	}
	public void setUserRole(Role role) {
		role = role;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		userEmail = userEmail;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		passwordHash = passwordHash;
	}
	
	
		
}
