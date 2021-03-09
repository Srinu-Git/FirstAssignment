package com.srinu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srinu.model.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer>{
	
	
}
