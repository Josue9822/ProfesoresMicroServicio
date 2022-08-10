package com.idat.Microservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.Microservicio.model.Profesor;
import com.idat.Microservicio.service.ProfesorService;

@Controller
@RequestMapping("api/profesor/v1")
public class ProfesorController {

	@Autowired
	private ProfesorService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarProfesor(@RequestBody Profesor profesor) {
		service.guardarProfesor(profesor);
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Profesor> listar(){
		return service.listarProfesor();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Profesor obtener(@PathVariable Integer id) {
		return service.obtenerProfesorId(id);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Profesor profesor) {
		service.actualizarProfesor(profesor);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminarProfesor(id);
	}
}
