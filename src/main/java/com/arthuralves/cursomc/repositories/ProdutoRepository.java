package com.arthuralves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthuralves.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}