package com.devmemije.api.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmemije.api.apirest.model.Estudiante;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
