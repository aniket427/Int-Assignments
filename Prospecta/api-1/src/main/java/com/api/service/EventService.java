package com.api.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Event;
import com.api.repository.EventDao;

@Service
public class EventService {
		
	@Autowired
	EventDao eRepo;
		
	public Event getDetailsByCategory(String category){
		
			Event event =  eRepo.findByCategory(category);
			
			return event;
		
		}

	public Event saveEvent(Event event) {
		
		
		if(event != null) {
			return eRepo.save(event);
			
		}else {
			return null;
		}
		
	}
	
}
