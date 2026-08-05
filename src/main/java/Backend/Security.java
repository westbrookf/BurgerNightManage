package Backend;

import org.mindrot.jbcrypt.BCrypt;

public class Security {
	
	public static String hashPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
	public static boolean verifyPassword(String password, String hash) {
		return BCrypt.checkpw(password, hash);
	}

}
