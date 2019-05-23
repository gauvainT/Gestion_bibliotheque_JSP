package com.adaming.bibliotheque.dao;

import java.util.List;

import com.adaming.bibliotheque.model.Livre;

public interface ILivreDao {
	
	public void ajouterLivre();
	
	public void ajouterLivre(Livre l);
	
	public void modifierLivre(int id, Livre l);
	
	public void supprimerLivre(int id);
	
	public List<Livre> getAll();
	
	public Livre getById(int id);

}
