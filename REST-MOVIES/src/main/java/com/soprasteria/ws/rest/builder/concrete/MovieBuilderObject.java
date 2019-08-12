package com.soprasteria.ws.rest.builder.concrete;

import java.util.List;
import java.util.Set;

import com.soprasteria.ws.rest.entity.ActorEntity;
import com.soprasteria.ws.rest.entity.MovieEntity;
import com.soprasteria.ws.rest.request.movie.MovieRequest;
import com.soprasteria.ws.rest.response.movie.MovieResponse;
import com.soprasteria.ws.rest.response.movie.MovieResponseFull;

public class MovieBuilderObject {

	private Long id;

	private String title;

	private String genre;

	private int year;

	private List<ActorEntity> actors;

	public MovieBuilderObject setId(Long id) {
		this.id = id;
		return this;
	}

	public MovieBuilderObject setTitle(String title) {
		this.title = title;
		return this;

	}

	public MovieBuilderObject setGenre(String genre) {
		this.genre = genre;
		return this;

	}

	public MovieBuilderObject setYear(int year) {
		this.year = year;
		return this;

	}



	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}


	



	public List<ActorEntity> getActors() {
		return actors;
	}

	public MovieBuilderObject setActors(List<ActorEntity> actors) {
		this.actors = actors;
		return this;
	}

	public static MovieEntity buildEntity(MovieRequest movieIn) {
		MovieEntity movie = new MovieEntity();
		movie.setTitle(movieIn.getTitle());
		movie.setGenre(movieIn.getGenre());
		movie.setYear(movieIn.getYear());
		movie.setActors(movieIn.getActors());

		return movie;

	}

	public static MovieResponse buildResponse(MovieEntity movieIn) {
		MovieResponse movie = new MovieResponse();
		movie.setTitle(movieIn.getTitle());
		movie.setYear(movieIn.getYear());
		movie.setId(movieIn.getId());

		return movie;

	}

	public static MovieResponseFull buildResponseFull(MovieEntity movieIn) {
		MovieResponseFull movie = new MovieResponseFull();
		movie.setTitle(movieIn.getTitle());
		movie.setGenre(movieIn.getGenre());
		movie.setYear(movieIn.getYear());
		movie.setActors(movieIn.getActors());
		movie.setId(movieIn.getId());

		return movie;

	}

}
