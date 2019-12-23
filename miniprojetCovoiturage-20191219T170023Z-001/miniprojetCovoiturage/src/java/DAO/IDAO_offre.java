/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.offreCov;
import java.util.ArrayList;

/**
 *
 * @author safeee
 */
public interface IDAO_offre {
    public void ajouterOffre(offreCov o);
    public void modifierOffre(offreCov o) ;
    public void supprimerOffre(String idOffreCov) ;
    public ArrayList<offreCov> getAllOffre() ;
    public offreCov getOffre(String idOffreCov) ;
}
