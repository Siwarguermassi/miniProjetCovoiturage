/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author safeee
 */
public class vehicule {
        private String matricule;
        private String marque;
        private String fumeur;
        private String climatisation;
        private String musique;

    public vehicule(String matricule, String marque, String fumeur, String climatisation,String musique) {
        this.matricule = matricule;
        this.marque = marque;
        this.fumeur = fumeur;
        this.climatisation = climatisation;
        this.musique= musique;
    }

    public String getMusique() {
        return musique;
    }

    public void setMusique(String musique) {
        this.musique = musique;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getFumeur() {
        return fumeur;
    }

    public void setFumeur(String fumeur) {
        this.fumeur = fumeur;
    }

    public String getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(String climatisation) {
        this.climatisation = climatisation;
    }
    
}
