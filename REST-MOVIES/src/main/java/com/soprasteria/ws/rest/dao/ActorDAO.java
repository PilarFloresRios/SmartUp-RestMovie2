package com.soprasteria.ws.rest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soprasteria.ws.rest.entity.ActorEntity;

public interface ActorDAO extends JpaRepository<ActorEntity, Long>{
	
	Optional<ActorEntity> findById(Long id);

	Optional<ActorEntity> findByName(String name);
}
