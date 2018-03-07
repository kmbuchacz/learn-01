package pl.video42.myapp;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.video42.myapp.domain.User;
import pl.video42.myapp.service.LoginService;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping ("/app")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		model.addAttribute("user", new User());

		return "app/home";
	}

	@RequestMapping(value = "home", method = RequestMethod.POST)
	public String homePOST(@ModelAttribute("user") User user, Locale locale, Model model) {

		model.addAttribute("user", user);
		model.addAttribute("username2", user.getUsername());
		
		

		Boolean isLoginValid = loginService.isUsernameAndPasswordValid(user);
		
		if(isLoginValid == true)
		{
			return"user/userPage";
		}else
		{
			model.addAttribute("result", "you typed wrong credentilas");
			
			return "app/home";	
		}
		
		
	}
		
}
