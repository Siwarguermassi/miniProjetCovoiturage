/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.personne;

/**
 *
 * @author safeee
 */
public interface IDAO_personne {
	public boolean ajouterPersonne(personne p);
	public personne findByEmail(String emailP);
    
}
