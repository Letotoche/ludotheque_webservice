package com.antoinepion.ludotheque.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.antoinepion.ludotheque.models.Jeu;
import com.antoinepion.ludotheque.repositories.CategorieJeuRepository;
import com.antoinepion.ludotheque.repositories.JeuRepository;

@RestController
@RequestMapping("/api/v1/jeux")
public class JeuController  {
	Logger logger = LoggerFactory.getLogger(JeuController.class);
	
	@Autowired
	private JeuRepository jeuRepository;
	
	@Autowired
	private CategorieJeuRepository categorieRepository;
	
	@GetMapping
	public List<Jeu> list() {
		List<Jeu> jeux = jeuRepository.findAll();
		return jeux;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Jeu jeu) {
		jeuRepository.save(jeu);
	}
	
	@GetMapping("/{id}")
	public Jeu get(@PathVariable("id") long id) {
		logger.debug("JeuController.get id : " + id);
		return jeuRepository.getOne(id);
	}
	
}
