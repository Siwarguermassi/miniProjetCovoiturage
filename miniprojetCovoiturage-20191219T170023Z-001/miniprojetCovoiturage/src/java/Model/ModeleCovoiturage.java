
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.personne;
import Beans.vehicule;
import DAO.DAO_personne;

/**
 *
 * @author safeee
 */
public class ModeleCovoiturage {
    	private personne p;
        private vehicule v;
	private DAO_personne leDAO =new DAO_personne();

    public vehicule getV() {
            return v;
        }
    public void setV(vehicule v) {
            this.v = v;
        }

    public personne getPersonne() {
            return p;
    }
    public void setPersonne(personne personne) {
            this.p = personne;
    }
    public void ajouterPers() {
            leDAO.ajouterPersonne(p);
    }
    public personne findByEmail(String emailP) {
            return leDAO.findByEmail(emailP);
    }
    }
