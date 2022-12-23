package com.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Event;
import com.api.service.EventService;


@RestController
public class mainController {
	
	@Autowired
	EventService eService;
	
	@GetMapping("/getTitleDescription/{category}")
	public Event getTitleDescription(@PathVariable String category){
		
		return eService.getDetailsByCategory(category);
		
	}
	
	
	@PostMapping("/save")
	Event saveEvent(@RequestBody Event event){
		
		return eService.saveEvent(event);
		
	}
}
