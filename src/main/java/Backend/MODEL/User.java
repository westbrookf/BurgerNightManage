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
	public void setFirstName(String FirstName) {
		firstName = FirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String LastName) {
		lastName = LastName;
	}
	public Role getUserRole() {
		return role;
	}
	public void setUserRole(Role Role) {
		role = Role;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String UserEmail) {
		userEmail = UserEmail;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String PasswordHash) {
		passwordHash = PasswordHash;
	}
	
	
		
}
