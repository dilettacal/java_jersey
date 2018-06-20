package org.attelid.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)	
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}

}
