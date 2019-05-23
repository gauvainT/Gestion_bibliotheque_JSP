package com.adaming.bibliotheque.controller;

import java.io.IOException;
import java.util.List;

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

@WebServlet( name = "LivreServlet" , urlPatterns = {"/livreGestion"})
public class LivreServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ILivreService livreService = new LivreService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameterMap().containsKey("idLivreToDelete")) {
			
			int idSaisie = Integer.parseInt(request.getParameter("idLivreToDelete"));
						
			livreService.supprimerLivre(idSaisie);
			
		}
		
		List<Livre> listeLivre = livreService.getAll();
		
		for(Livre l : listeLivre) {
			System.out.println(l.toString());
		}
		
		request.setAttribute("simpleList", listeLivre);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre = request.getParameter("titre");
		String auteur = request.getParameter("auteur");
		float prix = Float.parseFloat(request.getParameter("prix"));
		String genre = request.getParameter("genre");

		Livre l = new Livre(titre, auteur, prix, genre);
		
		livreService.ajouterLivre(l);
		
		doGet(request, response);

				
	}

}
