package org.attelid.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.attelid.messenger.model.Message;
import org.attelid.messenger.service.MessageService;

/**
 * Resource for handling messages
 * @author attelid
 *
 */
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON) 
@Produces(MediaType.APPLICATION_JSON) 
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	//adds a new message in messages/
	@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam(value = "messageId") long messageId, Message message) {
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam(value = "messageId") long messageId) {
			return messageService.getMessage(messageId);
	}
	


}
