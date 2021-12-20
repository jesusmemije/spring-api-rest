package com.devmemije.api.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devmemije.api.apirest.model.Estudiante;

@RestController
public class EstudianteController {

	@Autowired
	private EstudianteService estudianteService;

	@PostMapping("api/estudiantes")
	public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
		System.out.println(estudiante);
		estudianteService.guardar(estudiante);
		return estudiante;
	}

	@GetMapping("api/estudiantes")
	public List<Estudiante> obtener() {
		return estudianteService.obtenerTodos();
	}

	@GetMapping("api/estudiantes/{id}")
	public Optional<Estudiante> obtenerEstudiante(@PathVariable("id") Integer id) {
		return estudianteService.obtenerEstudiante(id);
	}

	@PutMapping("api/estudiantes")
	public void actualizarEstudiante(@RequestBody Estudiante estudiante) {
		estudianteService.actualizar(estudiante);
	}

	@DeleteMapping("api/estudiantes/{id}")
	public void eliminarEstudiante(@PathVariable("id") Integer id) {
		estudianteService.eliminar(id);
	}

}
