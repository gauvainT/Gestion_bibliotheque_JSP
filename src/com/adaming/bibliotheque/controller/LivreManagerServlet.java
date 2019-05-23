package com.adaming.bibliotheque.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adaming.bibliotheque.dao.ILivreDao;
import com.adaming.bibliotheque.dao.impl.LivreDao;
import com.adaming.bibliotheque.model.Livre;
import com.adaming.bibliotheque.service.ILivreService;
import com.adaming.bibliotheque.service.impl.LivreService;

@WebServlet(name="managerLivre", urlPatterns = {"/managerlivre"})
public class LivreManagerServlet extends HttpServlet{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ILivreService livreService = new LivreService();

		
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String titre = request.getParameter("titre");
		String auteur = request.getParameter("auteur");
		float prix = Float.parseFloat(request.getParameter("prix"));
		String genre = request.getParameter("genre");
		
		Livre l = new Livre(id, titre, auteur, prix, genre);
		
		
		System.out.println("************************* livre à modifier*****************************");
		System.out.println(l.toString());
		System.out.println("******************************************************");

		livreService.modifierLivre(id, l);
		
		LivreServlet lS = new LivreServlet();
		
		lS.doGet(request, response);
		
		
	}

}
