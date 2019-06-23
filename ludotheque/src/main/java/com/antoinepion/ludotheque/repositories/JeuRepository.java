package com.antoinepion.ludotheque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoinepion.ludotheque.models.Jeu;

public interface JeuRepository extends JpaRepository<Jeu, Long> {

}
