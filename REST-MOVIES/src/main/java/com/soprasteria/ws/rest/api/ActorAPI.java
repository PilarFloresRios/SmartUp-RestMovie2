package com.soprasteria.ws.rest.api;

import com.soprasteria.ws.rest.exception.MovieExistsException;
import com.soprasteria.ws.rest.request.actor.ActorRequest;
import com.soprasteria.ws.rest.response.actor.ActorResponse;

public interface ActorAPI {
	
	public abstract ActorResponse getById(Long id);

	public abstract ActorResponse save(ActorRequest actor) throws MovieExistsException;
}
