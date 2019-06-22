package com.antoinepion.ludotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.antoinepion.ludotheque.models.Jeu;

@RestController
@RequestMapping("/api/v1/jeux")
public class JeuController {
	
	@GetMapping
	public List<Jeu> list() {
		List<Jeu> jeux = new ArrayList<>(); 
		return jeux;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Jeu jeu) {
		
	}
	
	@GetMapping("/{id}")
	public Jeu get(@PathVariable("id") long id) {
		return new Jeu();
	}
	
}
