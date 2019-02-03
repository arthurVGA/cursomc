package com.arthuralves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthuralves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		Categoria cat1;
		Categoria cat2;
		List<Categoria> categorias;
		
		cat1 = new Categoria(1, "Informática");
		cat2 = new Categoria(2, "Escritório");
		categorias = new ArrayList<>();
		
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;
	}
}