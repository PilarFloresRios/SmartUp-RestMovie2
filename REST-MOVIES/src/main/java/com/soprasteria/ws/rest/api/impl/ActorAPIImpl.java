package com.soprasteria.ws.rest.api.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soprasteria.ws.rest.api.ActorAPI;
import com.soprasteria.ws.rest.exception.MovieExistsException;
import com.soprasteria.ws.rest.request.actor.ActorRequest;
import com.soprasteria.ws.rest.response.actor.ActorResponse;
import com.soprasteria.ws.rest.service.ActorService;

public class ActorAPIImpl implements ActorAPI {

	ActorService actorService;
	
	
	@Autowired
	public ActorAPIImpl(ActorService actorService) {
		super();
		this.actorService = actorService;
	}

	@Override
	@GetMapping(value = "/actors/{id}")
	public ActorResponse getById(Long id) {
		return actorService.getById(id);
	}

	@Override
	@PostMapping(value = "/actors")
	public ActorResponse save(@Valid @RequestBody ActorRequest actor) throws MovieExistsException {
		return actorService.save(actor);
	}
	
	

}
