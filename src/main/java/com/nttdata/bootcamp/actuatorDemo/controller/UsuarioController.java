package com.nttdata.bootcamp.actuatorDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.actuatorDemo.repository.Usuario;

@RestController
public class UsuarioController {

	@GetMapping("/prueba/{name}")
	public String prueba(@PathVariable String name) {
		
		return "hola "+ name;
	}
	
	@GetMapping("/pruebaUser")
	public Usuario pruebaUser(@RequestParam String nombre) {
		Usuario usuario= new Usuario(nombre,null,null,null);
		return usuario;
	}
	@PostMapping("/prueba/{name}")
	public String pruebaPost(@PathVariable String name) {
		return "hola "+ name;
	}
}
