package com.soprasteria.ws.rest.response.actor;

import java.util.List;

import com.soprasteria.ws.rest.entity.MovieEntity;

public class ActorResponse {

	protected Long id;
	
	protected String name;

	protected String fullname;

	protected List<MovieEntity> movies;

	public ActorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}


	
	
	
}
