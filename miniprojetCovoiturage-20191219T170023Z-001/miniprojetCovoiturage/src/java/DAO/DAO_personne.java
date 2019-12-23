/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.personne;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author safeee
 */
public class DAO_personne implements IDAO_personne{
    private Connection con;
	private Connection connecter() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Pilote MySQL JDBC charg�");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du chargmement du pilote");
        }
		try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/covoiturage", "root", "");
            System.out.println("Connexion opérationnelle");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'etablissement de la connexion");

        }
        return con;
		}
	public personne findByEmail(String emailP) {
		personne p = null;
		try {
			Statement st = connecter().createStatement();
			String requete="select * from personne where emailP='"+emailP+"';";
			ResultSet Rset=st.executeQuery(requete);
			if(Rset.next()) {
				String nomPersonne =Rset.getString("nomPersonne");
				String prenomPersonne= Rset.getString("prenomPersonne");
				String sexeP= Rset.getString("sexeP");
				String TelP= Rset.getString("TelP");
				String passwordP= Rset.getString("passwordP");
                                String type_personne=Rset.getString("type_personne");
				p=new personne(nomPersonne,prenomPersonne,sexeP,TelP,emailP,passwordP,type_personne);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return p;
		}
	public boolean ajouterPersonne(personne p) {
             try {
            Statement st = connecter().createStatement();
            String nomPersonne=p.getNomPersonne();
            String prenomPersonne=p.getPrenomPersonne();
            String sexeP=p.getSexeP();
            String TelP=p.getTelP();
            String emailP=p.getEmailP();
            String passwordP=p.getPasswordP();
            		
       String requete="insert into personne values('"+nomPersonne+"','"+prenomPersonne+"','"+sexeP+"','"+TelP+"','"+emailP+"','"+passwordP+"','"+p.getType_personne()+"','')";
	int Rset=st.executeUpdate(requete);
	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	return false;
				/*try {
					Connection con=this.connecter();
					Statement st=con.createStatement();
					String query = "insert into personne values('"+p.getNomPersonne()+"'"
									
                                                        + ",'"+p.getPrenomPersonne()+"'"
							+ ",'"+p.getSexeP()+"'"
                                                        + ",'"+p.getTelP()+"'"
							+ ",'"+p.getEmailP()+"'"
							+ ",'"+p.getPasswordP()+"');";
					int result = st.executeUpdate(query);
				}catch(SQLException ex) {
					System.err.print("error executing query:"+ex.getMessage());
				}
				return true;*/
	}
    
}
