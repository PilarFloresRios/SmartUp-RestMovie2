package com.soprasteria.ws.rest.response.movie;

import java.util.List;
import java.util.Set;

import com.soprasteria.ws.rest.entity.ActorEntity;

public class MovieResponseFull extends MovieResponse {

	private String genre;
	private List<ActorEntity> actors;

	public MovieResponseFull() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	

	public List<ActorEntity> getActors() {
		return actors;
	}

	public void setActors(List<ActorEntity> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovieResponseFull [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", year=");
		builder.append(year);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", actors=");
		builder.append(actors);
		builder.append("]");
		return builder.toString();
	}


	




	
	


	
	


	

}
