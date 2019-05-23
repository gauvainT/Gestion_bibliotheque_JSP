package com.adaming.bibliotheque.service.impl;

import java.util.List;

import com.adaming.bibliotheque.dao.ILivreDao;
import com.adaming.bibliotheque.dao.impl.LivreDao;
import com.adaming.bibliotheque.model.Livre;
import com.adaming.bibliotheque.service.ILivreService;

public class LivreService implements ILivreService {
	
	ILivreDao livreDao = new LivreDao();

	@Override
	public void ajouterLivre() {
		// TODO Auto-generated method stub
		livreDao.ajouterLivre();
		
	}

	@Override
	public void ajouterLivre(Livre l) {
		// TODO Auto-generated method stub
		livreDao.ajouterLivre(l);		
	}

	@Override
	public void modifierLivre(int id, Livre l) {
		// TODO Auto-generated method stub
		livreDao.modifierLivre(id, l);
		
	}

	@Override
	public void supprimerLivre(int id) {
		// TODO Auto-generated method stub
		livreDao.supprimerLivre(id);
		
	}

	@Override
	public List<Livre> getAll() {
		return livreDao.getAll();
	}

	@Override
	public Livre getById(int id) {
		// TODO Auto-generated method stub
		return livreDao.getById(id);
	}
	
	
	
}
