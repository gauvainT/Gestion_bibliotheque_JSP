package com.adaming.bibliotheque.service;

import java.util.List;

import com.adaming.bibliotheque.dao.ILivreDao;
import com.adaming.bibliotheque.model.Livre;

public interface ILivreService {
	
	public void ajouterLivre();
	
	public void ajouterLivre(Livre l);
	
	public void modifierLivre(int id, Livre l);
	
	public void supprimerLivre(int id);
	
	public List<Livre> getAll();
	
	public Livre getById(int id);

}
