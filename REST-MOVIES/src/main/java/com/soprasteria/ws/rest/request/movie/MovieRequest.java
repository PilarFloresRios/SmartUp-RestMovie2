package com.soprasteria.ws.rest.request.movie;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.soprasteria.ws.rest.annotation.Year;
import com.soprasteria.ws.rest.entity.ActorEntity;

public class MovieRequest {

	@NotBlank(message = "{movie.title.notBlank}")
	@Size(min = 4, message = "The title must have a minimum of 4 characters")
	private String title;
	private String genre;
	@Year
	private int year;
	private List<ActorEntity> actors;

	public MovieRequest() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
		builder.append("MovieRequest [title=");
		builder.append(title);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", year=");
		builder.append(year);
		builder.append(", actors=");
		builder.append(actors);
		builder.append("]");
		return builder.toString();
	}







	
	
}
