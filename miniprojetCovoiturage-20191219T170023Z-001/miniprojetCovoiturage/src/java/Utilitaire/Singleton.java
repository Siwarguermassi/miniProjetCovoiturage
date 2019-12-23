/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author safeee
 */
public class Singleton {
     private static Connection con;
	static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Pilote MySQL JDBC chargé");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur lors du chargmement du pilote");
        }
		try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/covoiturage", "root", "");
            System.out.println("Connexion opérationnelle");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'etablissement de la connexion");

        }
        }
    public static Connection getCon(){
        return con;
    }
}
