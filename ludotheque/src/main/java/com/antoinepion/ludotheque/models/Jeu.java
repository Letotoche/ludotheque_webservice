package com.antoinepion.ludotheque.models;

public class Jeu {
	private String nom;
	private String editeur;
	private String distributeur;
	private CategorieJeu categorie;
	private int accessibilite;
	private int ageMin;
	private int nbJoueursMin;
	private int nbJoueursMax;
	private int dureeMin;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public String getDistributeur() {
		return distributeur;
	}
	public void setDistributeur(String distributeur) {
		this.distributeur = distributeur;
	}
	public CategorieJeu getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieJeu categorie) {
		this.categorie = categorie;
	}
	public int getAccessibilite() {
		return accessibilite;
	}
	public void setAccessibilite(int accessibilite) {
		this.accessibilite = accessibilite;
	}
	public int getAgeMin() {
		return ageMin;
	}
	public void setAgeMin(int ageMin) {
		this.ageMin = ageMin;
	}
	public int getNbJoueursMin() {
		return nbJoueursMin;
	}
	public void setNbJoueursMin(int nbJoueursMin) {
		this.nbJoueursMin = nbJoueursMin;
	}
	public int getNbJoueursMax() {
		return nbJoueursMax;
	}
	public void setNbJoueursMax(int nbJoueursMax) {
		this.nbJoueursMax = nbJoueursMax;
	}
	public int getDureeMin() {
		return dureeMin;
	}
	public void setDureeMin(int dureeMin) {
		this.dureeMin = dureeMin;
	}
	
	
	
}