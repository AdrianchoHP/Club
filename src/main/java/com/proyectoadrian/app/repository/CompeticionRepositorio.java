package com.proyectoadrian.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoadrian.app.tables.Competicion;

public interface CompeticionRepositorio extends JpaRepository<Competicion, Integer> {

}
