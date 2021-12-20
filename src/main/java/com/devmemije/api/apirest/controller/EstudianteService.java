package com.devmemije.api.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmemije.api.apirest.model.Estudiante;

@Service
public class EstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	public void guardar(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}

	public List<Estudiante> obtenerTodos() {
		return estudianteRepository.findAll();
	}

	public Optional<Estudiante> obtenerEstudiante(Integer id) {
		return estudianteRepository.findById(id);
	}

}
