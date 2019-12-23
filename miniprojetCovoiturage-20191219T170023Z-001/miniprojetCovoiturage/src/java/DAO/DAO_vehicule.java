/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.vehicule;
import Utilitaire.Singleton;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author safeee
 */
public class DAO_vehicule implements IDAO_vehicule{

    @Override
    public boolean ajouterVehicule(vehicule v) {
         try {
            Statement st =Singleton.getCon().createStatement();
       String requete="insert into vehicule values('"+v.getMatricule()+"','"+v.getMarque()+"','"+v.getFumeur()+"','"+v.getClimatisation()+"')";
	int Rset=st.executeUpdate(requete);
	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	return false;
        }
    
}
