/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import Beans.personne;
import Beans.vehicule;
import DAO.DAO_vehicule;
import Model.ModeleCovoiturage;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author safeee
 */
public class ServInscri extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if(request.getParameter("inscription")!=null){
            String nomPersonne=request.getParameter("nomPersonne");
            String prenomPersonne=request.getParameter("prenomPersonne");
            String sexeP=request.getParameter("sexeP");
            String TelP=request.getParameter("TelP");
            String emailP=request.getParameter("emailP");
            String passwordP=request.getParameter("passwordP");
            String type_personne=request.getParameter("type");
            ModeleCovoiturage M=new ModeleCovoiturage();
            M.setPersonne(new personne(nomPersonne, prenomPersonne, sexeP, TelP, emailP, passwordP,type_personne));
            M.ajouterPers();
            if(type_personne.equals("conducteur"))
                {request.getServletContext().getRequestDispatcher("/formVoiture.jsp").forward(request, response);
                if(request.getParameter("enreg")!=null){
                     String mat=request.getParameter("matricule");
                     String marque=request.getParameter("marque");
                     String fumeur=request.getParameter("fumeur");
                     String climatisation=request.getParameter("climatisation");
                     String musique=request.getParameter("musique");
                     DAO_vehicule dao_v =new DAO_vehicule();
                     vehicule v=new vehicule(mat,marque,fumeur,climatisation,musique);
                     dao_v.ajouterVehicule(v);
                 }
                }
                else
                request.getServletContext().getRequestDispatcher("/RechOffre.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
