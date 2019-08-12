package com.soprasteria.ws.rest.request.actor;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.soprasteria.ws.rest.builder.concrete.ActorBuilderObject;
import com.soprasteria.ws.rest.entity.ActorEntity;
import com.soprasteria.ws.rest.entity.MovieEntity;
import com.soprasteria.ws.rest.request.movie.MovieRequest;

public class ActorRequest {

	@NotBlank(message = "{actor.name.notBlank}")
	private String name;

	private String fullname;

	private List<MovieEntity> movies;

	public ActorRequest() {
	}

	public String getName() {
		return name;
	}

	public String getFullname() {
		return fullname;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public List<MovieEntity> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ActorRequest [name=");
		builder.append(name);
		builder.append(", fullname=");
		builder.append(fullname);
		builder.append(", movies=");
		builder.append(movies);
		builder.append("]");
		return builder.toString();
	}


	
}
