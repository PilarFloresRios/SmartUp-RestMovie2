package com.soprasteria.ws.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.soprasteria.ws.rest.builder.concrete.ActorBuilderObject;
import com.soprasteria.ws.rest.dao.ActorDAO;
import com.soprasteria.ws.rest.entity.ActorEntity;
import com.soprasteria.ws.rest.exception.MovieExistsException;
import com.soprasteria.ws.rest.exception.OrderNotFoundException;
import com.soprasteria.ws.rest.request.actor.ActorRequest;
import com.soprasteria.ws.rest.response.actor.ActorResponse;
import com.soprasteria.ws.rest.service.ActorService;

public class ActorServiceImpl implements ActorService {

	ActorDAO dao;

	@Autowired
	public ActorServiceImpl(ActorDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public ActorResponse getById(Long id) {

		if (dao.findById(id).isPresent()) {
			ActorEntity actorEntity = dao.findById(id).get();

			ActorResponse response = ActorBuilderObject.buildResponse(actorEntity);
			
			
			
			return response;
		} else {
			throw new OrderNotFoundException();
		}
	}

	@Override
	public ActorResponse save(ActorRequest actor) throws MovieExistsException {

		if (dao.findByName(actor.getName()).isPresent()) {
			throw new MovieExistsException();
		} else {
			ActorEntity actorToSave = ActorBuilderObject.buildEntity(actor);
			ActorEntity actorSaved = dao.save(actorToSave);
			ActorResponse response = ActorBuilderObject.buildResponse(actorSaved);
			return response;
		}

	}

}
