package com.devmemije.api.apirest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("api/estudiante")
	public List<Estudiante> obtenerEstudiantes() {
		List<Estudiante> listaEstudiantes = new ArrayList<>();

		Estudiante e = new Estudiante();

		e.setId(1);
		e.setNombres("Jesús");
		e.setApellidos("González");
		e.setEmail("memije.dev@gmail.com");
		e.setNota(5D);

		Estudiante e1 = new Estudiante();

		e1.setId(1);
		e1.setNombres("Cristina");
		e1.setApellidos("González");
		e1.setEmail("kris@gmail.com");
		e1.setNota(8D);

		listaEstudiantes.add(e);
		listaEstudiantes.add(e1);

		return listaEstudiantes;
	}

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

}
