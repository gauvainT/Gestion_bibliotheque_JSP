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

@WebServlet(name="deleteLivre", urlPatterns = {"/delete"})
public class LivreDeleteServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ILivreDao livreDao = new LivreDao();

		
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idSaisie = Integer.parseInt(request.getParameter("idLivreToDelete"));
		
		System.out.println(idSaisie);
		
		livreDao.supprimerLivre(idSaisie);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);

		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
