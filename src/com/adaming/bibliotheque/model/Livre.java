package com.adaming.bibliotheque.model;

public class Livre {
	
	private int id_livre;
	private String titre;
	private String auteur;
	private float prix;
	private String genre;
	public Livre() {
		
	// Constructeur
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Livre(int id_livre, String titre, String auteur, float prix, String genre) {
		super();
		this.id_livre = id_livre;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.genre = genre;
	}


	public Livre(String titre, String auteur, float prix, String genre) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.genre = genre;
	}
	
	// Getter Setter
	
	/**
	 * @return the id_livre
	 */
	public int getId_livre() {
		return id_livre;
	}


	/**
	 * @param id_livre the id_livre to set
	 */
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}


	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}


	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}


	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}


	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}


	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}


	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	// toString
	
	@Override
	public String toString() {
		return "Livre [id_livre=" + id_livre + ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", genre="
				+ genre + "]";
	}
	
	
	
	
	
	

}
