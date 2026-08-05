package Backend;

public class Session {
	
	private static Users currentUser;
	
	public static void login(Users user) {
		currentUser = user;
	}
	
	public static void logout() {
        currentUser = null;
    }

    public static Users getCurrentUser() {
        return currentUser;
    }

    public static boolean isLoggedIn() {
        return currentUser != null;
    }

}
