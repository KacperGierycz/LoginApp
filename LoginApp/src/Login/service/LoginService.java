package Login.service;

import java.util.HashMap;

public class LoginService {
	
	HashMap<String,String> users = new HashMap<String,String>();
	
	
	public LoginService() {
	users.put("johndoe","John Doe");
	users.put("janedoe","Jane Doe");
	users.put("javadoe","Java Doe");
		
	}

	public boolean authenticate(String userId, String password) {
		
		System.out.println(userId+password);
		if (password.isEmpty() || password.trim().equals("")){
			return false;
		
		}
		else {
		return true;
		}
	}
	
	public String getUserName(String userId) {
		return users.get(userId);
		
	}
}
