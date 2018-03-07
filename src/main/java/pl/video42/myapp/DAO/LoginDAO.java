package pl.video42.myapp.DAO;

import org.springframework.stereotype.Repository;

import pl.video42.myapp.domain.User;

@Repository
public class LoginDAO {
	public User getUser(User incompleteUser) {
		
		User userFromDatabase = new User();
		
		userFromDatabase.setUsername("Krzysztof");
		userFromDatabase.setPassword("1234");
		
		return userFromDatabase;

	}

}
