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
public class offreCov {
    private String idOffreCov;
    private String DheureArrivée;
    private String DheureDepart;
    private String pointArrivé;
    private String pointDepart;
    private String typeTrajet;
    private String nomPersonne;
    private String matricule;

    public offreCov(String idOffreCov, String DheureArrivée, String DheureDepart, String pointArrivé, String pointDepart, String typeTrajet, String nomPersonne) {
        this.idOffreCov = idOffreCov;
        this.DheureArrivée = DheureArrivée;
        this.DheureDepart = DheureDepart;
        this.pointArrivé = pointArrivé;
        this.pointDepart = pointDepart;
        this.typeTrajet = typeTrajet;
        this.nomPersonne = nomPersonne;     
    }

    public offreCov(String idOffreCov, String DheureArrivée, String DheureDepart, String pointArrivé, String pointDepart, String typeTrajet, String nomPersonne, String matricule) {
        this.idOffreCov = idOffreCov;
        this.DheureArrivée = DheureArrivée;
        this.DheureDepart = DheureDepart;
        this.pointArrivé = pointArrivé;
        this.pointDepart = pointDepart;
        this.typeTrajet = typeTrajet;
        this.nomPersonne = nomPersonne;
        this.matricule = matricule;
    }

    public offreCov(String idOffreCov, String DheureArrivée, String DheureDepart, String pointArrivé, String pointDepart, String typeTrajet){
        this.idOffreCov = idOffreCov;
        this.DheureArrivée = DheureArrivée;
        this.DheureDepart = DheureDepart;
        this.pointArrivé = pointArrivé;
        this.pointDepart = pointDepart;
        this.typeTrajet = typeTrajet;
    }

    public String getIdOffreCov() {
        return idOffreCov;
    }

    public void setIdOffreCov(String idOffreCov) {
        this.idOffreCov = idOffreCov;
    }

    public String getDheureArrivée() {
        return DheureArrivée;
    }

    public void setDheureArrivée(String DheureArrivée) {
        this.DheureArrivée = DheureArrivée;
    }

    public String getDheureDepart() {
        return DheureDepart;
    }

    public void setDheureDepart(String DheureDepart) {
        this.DheureDepart = DheureDepart;
    }

    public String getPointArrivé() {
        return pointArrivé;
    }

    public void setPointArrivé(String pointArrivé) {
        this.pointArrivé = pointArrivé;
    }

    public String getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public String getTypeTrajet() {
        return typeTrajet;
    }

    public void setTypeTrajet(String typeTrajet) {
        this.typeTrajet = typeTrajet;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
}
