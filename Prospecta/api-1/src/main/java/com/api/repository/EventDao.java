package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Event;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {

	Event findByCategory(String category);

}
