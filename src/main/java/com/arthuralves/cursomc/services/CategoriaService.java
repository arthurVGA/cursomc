package com.arthuralves.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthuralves.cursomc.domain.Categoria;
import com.arthuralves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> buscar() {
		return repository.findAll();
	}
	
	public Categoria buscarPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}