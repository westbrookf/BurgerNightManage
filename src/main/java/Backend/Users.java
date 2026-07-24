package Backend;
import java.util.ArrayList;

public class Users {
	
	
//	private static ArrayList<Users> allUsers;
	private String FirstName;
	private String LastName;
	private String UserEmail;
	private String Password;
	static ArrayList<Users> allUsers =new ArrayList<>();
	
	
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
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
	    return "Users{" +
	            "First Name='" + FirstName + '\'' +
	            ", Last Name='" + LastName + '\''+
	            ", email='" + UserEmail + '\''+
	            ", password='" + Password + '\'' +
	            '}';
	}
	
	
	public static void createUser(String fName, String lName, String uEmail, String uPassword) {
		
		Users newUser = new Users();
		newUser.setFirstName(fName);
		newUser.setLastName(lName);
		newUser.setUserEmail(uEmail);
		newUser.setPassword(uPassword);
		allUsers.add(newUser);
		
		
		System.out.print(newUser);
		
	}
//	
//	public static ArrayList usersCreated() {
//		ArrayList<Users> newUsers;
//		newUsers = new ArrayList<Users>();
//		
//		
//		
//		
//		return null;
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
}
