package com.soprasteria.ws.rest.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.soprasteria.ws.rest.builder.concrete.MovieBuilderObject;

//import com.soprasteria.ws.rest.builder.concrete.MovieResponseBuilder;
//import com.soprasteria.ws.rest.builder.concrete.MovieResponseFullBuilder;
//import com.soprasteria.ws.rest.response.movie.MovieResponse;
//import com.soprasteria.ws.rest.response.movie.MovieResponseFull;

@Entity
@Table(name = "MOVIES")
public class MovieEntity implements Serializable {

	private static final long serialVersionUID = 4894729030347835498L;

	@Id
	@GeneratedValue
//	@Column
	private Long id;

//	@Column
	private String title;

//	@Column
	private String genre;

//	@Column
	private int year;

//	@Column	

//	@ManyToMany

		
	@ManyToMany
//	@JoinTable(
//			  name = "relations", 
//			  joinColumns = @JoinColumn(name = "movie_id"), 
//			  inverseJoinColumns = @JoinColumn(name = "autor_id"))
    @JoinTable(
            name = "relations",
            joinColumns = @JoinColumn(name = "FK_MOVIE", nullable = false),
            inverseJoinColumns = @JoinColumn(name="FK_ACTOR", nullable = false)
        )
	private List<ActorEntity> actors;
	
	

//	public MovieDTO(Long id, String title, String genre, int year, String[] actors) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.genre = genre;
//		this.year = year;
//		this.actors = actors;
//	}

	public MovieEntity() {

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		builder.append("MovieEntity [id=");
		builder.append(id);
		builder.append(", title=");
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
