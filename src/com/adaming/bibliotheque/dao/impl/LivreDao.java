package com.adaming.bibliotheque.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adaming.bibliotheque.dao.ILivreDao;
import com.adaming.bibliotheque.model.Livre;
import com.adaming.bibliotheque.util.ConnectionDB;

public class LivreDao implements ILivreDao {
	
	Connection con;
	PreparedStatement ps;
	
	public LivreDao() {
		try {
			con = ConnectionDB.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void ajouterLivre() {
		// TODO Auto-generated method stub
		String req = "INSERT INTO `livre` (`titre`, `auteur`, `prix`, `genre`) VALUES (?, ?, ?, ?);";
		try {
			ps = con.prepareStatement(req);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void ajouterLivre(Livre l) {
		// TODO Auto-generated method stub
		String req = "INSERT INTO `livre` (`titre`, `auteur`, `prix`, `genre`) VALUES (?, ?, ?, ?);";
		try {
			ps = con.prepareStatement(req);
			ps.setString(1, l.getTitre());
			ps.setString(2, l.getAuteur());
			ps.setFloat(3, l.getPrix());
			ps.setString(4, l.getGenre());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void modifierLivre(int id, Livre l) {
		// TODO Auto-generated method stub
		String req = "UPDATE livre SET titre = ?, auteur = ?, prix = ?, genre = ? WHERE livre.id_livre = ?;";
		try {
			ps = con.prepareStatement(req);
			ps.setString(1, l.getTitre());
			ps.setString(2, l.getAuteur());
			ps.setFloat(3, l.getPrix());
			ps.setString(4, l.getGenre());
			ps.setInt(5, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void supprimerLivre(int id) {
		// TODO Auto-generated method stub
		String req = "DELETE FROM livre WHERE livre.id_livre = ?";
		try {
			ps = con.prepareStatement(req);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Livre> getAll() {
		// TODO Auto-generated method stub
		List<Livre> listeLivre = new ArrayList<>();

		String req = "SELECT * FROM livre";
		try {
			ps = con.prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			//rs.next();
			while (rs.next()) {
				listeLivre.add(new Livre(rs.getInt("id_livre"), rs.getString("titre"), rs.getString("auteur"), rs.getFloat("prix"), rs.getString("genre")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeLivre;
		
	}

	@Override
	public Livre getById(int id) {
		// TODO Auto-generated method stub
		String req = "SELECT * FROM livre WHERE id_livre= ?";
		try {
			ps = con.prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Livre l = new Livre(rs.getInt("id_livre"), rs.getString("titre"), rs.getString("auteur"), rs.getFloat("prix"), rs.getString("genre"));
			return l;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
