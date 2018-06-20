package org.attelid.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.attelid.messenger.model.Message;

public class MessageService {
	
	/**
	 * hard coded messages
	 * here: call to Database to get concrete values
	 * @return
	 */
	public List<Message> getAllMessages(){
		Message m1 = new Message(1, "Hello World!", "attelid");
		Message m2 = new Message(2, "Hello Germany!", "attelid");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
	
}
