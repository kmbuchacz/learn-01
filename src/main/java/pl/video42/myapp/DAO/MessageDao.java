package pl.video42.myapp.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pl.video42.myapp.domain.Message;

@Repository
public class MessageDao {

	public MessageDao() {

		addMessageToList("test Message 1", 1L);
		addMessageToList("test Message 2", 2L);
		addMessageToList("test Message 3", 3L);
		addMessageToList("test Message 4", 4L);
		addMessageToList("test Message 5", 5L);
		addMessageToList("test Message 6", 6L);
		addMessageToList("test Message 7", 7L);

	}

	private List<Message> messages = new ArrayList<Message>();

	public List<Message> getMessages() {
		return messages;
	}

	private void addMessageToList(String content, long id) {
		Message message = new Message(id, content);
		messages.add(message);
	}

	public Message getMessagebyId(Long messageId) {

		for (Message returnedMessage : messages) {
			if (returnedMessage.getId().equals(messageId)) {
				return returnedMessage;
			}
		}
		return null;
	} 

}
