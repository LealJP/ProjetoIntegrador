package com.ecoomerce.lifeshop.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoomerce.lifeshop.model.Categoria;
import com.ecoomerce.lifeshop.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;

	@GetMapping("/id/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Optional<Categoria> opt = service.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(opt.get());
	}
	
}
