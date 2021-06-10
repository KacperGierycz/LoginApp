package Login.service;

import java.util.HashMap;

import dto.User;

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
	
	public User getUserDetails(String userId) {
		User user= new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		
		return user;
		
	}
}
