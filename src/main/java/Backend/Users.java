package Backend;
import java.util.ArrayList;

import Components.DropDowns.CompRoleInput;

public class Users {
	
	
//	private static ArrayList<Users> allUsers;
	private int UserId;
	private String FirstName;
	private String LastName;
	private Role UserRole;
	private String UserEmail;
	private String PasswordHash;
	static ArrayList<Users> allUsers =new ArrayList<>();
	
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Role getUserRole() {
		return UserRole;
	}
	public void setUserRole(Role userRole) {
		UserRole = userRole;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getPasswordHash() {
		return PasswordHash;
	}
	public void setPasswordHash(String passwordHash) {
		PasswordHash = passwordHash;
	}
	
	
		
}
