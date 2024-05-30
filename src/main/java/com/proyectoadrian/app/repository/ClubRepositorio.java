package com.proyectoadrian.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoadrian.app.tables.Club;


public interface ClubRepositorio extends JpaRepository<Club, Integer>{
	
}