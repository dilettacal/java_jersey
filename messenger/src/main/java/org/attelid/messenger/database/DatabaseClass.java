package org.attelid.messenger.database;
import org.attelid.messenger.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * This class handles access to the maps
 * @author attelid
 *
 */
public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}

}
