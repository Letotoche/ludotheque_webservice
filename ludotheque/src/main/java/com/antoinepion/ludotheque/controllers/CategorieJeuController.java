package com.antoinepion.ludotheque.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.antoinepion.ludotheque.models.CategorieJeu;
import com.antoinepion.ludotheque.repositories.CategorieJeuRepository;

@RestController
@RequestMapping("/api/v1/categorieJeu")
public class CategorieJeuController {
	
	@Autowired
	private CategorieJeuRepository categorieJeuRepository;
	
	@GetMapping
	public List<CategorieJeu> list() {
		return categorieJeuRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody CategorieJeu categorie) {
		categorieJeuRepository.save(categorie);
	}
	
	@GetMapping("/{id}")
	public CategorieJeu get(@PathVariable("id") long id) {
		return categorieJeuRepository.getOne(id);
	}
	
}
