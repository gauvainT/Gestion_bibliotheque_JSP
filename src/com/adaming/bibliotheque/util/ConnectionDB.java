package com.adaming.bibliotheque.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private static final String url = "jdbc:mysql://localhost:3306/bdd_bibliotheque";
	private static final String user = "root";
	private static final String password = "";
	
	private static Connection connexion;
	// Constructeur de création de la connexion 
	public ConnectionDB() throws ClassNotFoundException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, user, password);
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	// Méthode pour établir la connexion
	public static Connection getConnection() throws ClassNotFoundException{
		if (connexion ==  null) {
			new ConnectionDB();
			System.out.println(" Ouverture de la connexion");
			return connexion;
		}
		else {
			System.out.println("Connexion existante");
			return connexion;
		}
	}
	public static void closeConnection() {
		try {
			connexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
