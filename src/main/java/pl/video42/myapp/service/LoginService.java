package pl.video42.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.video42.myapp.DAO.LoginDAO;
import pl.video42.myapp.domain.User;

@Service
public class LoginService {
	@Autowired
	private LoginDAO loginDao;
	User userFromDatebase2 = new User();

	public boolean isUsernameAndPasswordValid(User user) {
		userFromDatebase2.setUsername("Tomek");
		userFromDatebase2.setPassword("lipa");
		User userFromDataBase = loginDao.getUser(user);

		if (" ".equals(user.getUsername()) || " ".equals(user.getPassword())) {
			return false;
		
		
		}
		else if ((userFromDatebase2.getUsername().toString().equals(user.getUsername().toString()))
				|| (userFromDatebase2.getPassword().equals(user.getUsername()))) {

			return true;

		}

		else {
			return false;
		}
	}
}
