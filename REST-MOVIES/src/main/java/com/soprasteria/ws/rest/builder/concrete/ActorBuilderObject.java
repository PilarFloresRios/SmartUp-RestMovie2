package com.soprasteria.ws.rest.builder.concrete;

import java.util.List;

import com.soprasteria.ws.rest.entity.ActorEntity;
import com.soprasteria.ws.rest.entity.MovieEntity;
import com.soprasteria.ws.rest.request.actor.ActorRequest;
import com.soprasteria.ws.rest.request.movie.MovieRequest;
import com.soprasteria.ws.rest.response.actor.ActorResponse;

public class ActorBuilderObject {
	
	private Long id;
	
	private String name;
	
	private String fullname;
	
	private List<MovieEntity> movies;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getFullname() {
		return fullname;
	}

	public List<MovieEntity> getMovies() {
		return movies;
	}

	public  ActorBuilderObject setId(Long id) {
		this.id = id;
		return this;
	}

	public ActorBuilderObject setName(String name) {
		this.name = name;
		return this;
	}

	public ActorBuilderObject setFullname(String fullname) {
		this.fullname = fullname;
		return this;
	}

	public ActorBuilderObject setMovies(List<MovieEntity> movies) {
		this.movies = movies;
		return this;
	}


	
	public static ActorEntity buildEntity(ActorRequest in) {
		ActorEntity out = new ActorEntity();
		out.setName(in.getName());
		out.setFullname(in.getFullname());

		out.setMovies(in.getMovies());
		
		return out;

	}

	
	public static ActorResponse buildResponse(ActorEntity in) {
		ActorResponse out = new ActorResponse();
		out.setId(in.getId());
		out.setName(in.getName());
		out.setFullname(in.getFullname());

		out.setMovies(in.getMovies());
		
		return out;

	}
	

}
