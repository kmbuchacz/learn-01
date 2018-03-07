package pl.video42.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import pl.video42.myapp.domain.Message;
import pl.video42.myapp.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.video42.myapp.DAO.MessageDao;

@Controller
public class UserPage {

	@Autowired
	MessageDao messageDao;

	@RequestMapping(value = "user/register", method = RequestMethod.GET)
	public String register(Locale locale, ModelMap model)
	{
		List <Message> messages = messageDao.getMessages();
		model.put("messages", messages);
		return "user/register";
	}

	@RequestMapping(value = "user/register/{messageId}", method = RequestMethod.GET)
	public String getMessageById (@PathVariable ("messageId") Long messageId, ModelMap model)
	{
		
		Message messagebyId = messageDao.getMessagebyId(messageId);
		
		
		
		List <Message> messages = new ArrayList<Message>();
		messages.add(messagebyId);
		
		
		model.addAttribute("messagebyId", messages );
		return "user/register";
		
	}

	
}
