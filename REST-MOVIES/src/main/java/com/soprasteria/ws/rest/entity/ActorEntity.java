package com.soprasteria.ws.rest.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACTORS")
public class ActorEntity {

	

	@Id
	@GeneratedValue
//	@Column
	private Long id;
	
//	@Column
	private String name;
	
//	@Column
	private String fullname;
	


	@ManyToMany(mappedBy = "actors")
	private List<MovieEntity> movies;

	public ActorEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public Long getId() {
		return id;
	}

	public List<MovieEntity> getMovies() {
		return movies;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ActorEntity [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", fullname=");
		builder.append(fullname);
		builder.append(", movies=");
		builder.append(movies);
		builder.append("]");
		return builder.toString();
	}


	
	
	

	
	
	
	
}
