package jp.co.netmile.crwdsrc.service;

import java.util.List;

import jp.co.netmile.crwdsrc.dto.EventMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class EventDataService {
	
	@Autowired
	private MongoOperations mongoOperations;
	
	public List<EventMessage> getEvents() {
		
		return mongoOperations.findAll(EventMessage.class);
	}

}
