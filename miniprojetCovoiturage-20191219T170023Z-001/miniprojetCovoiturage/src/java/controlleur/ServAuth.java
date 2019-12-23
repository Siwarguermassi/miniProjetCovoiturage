/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur;

import Beans.personne;
import Model.ModeleCovoiturage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author safeee
 */
public class ServAuth extends HttpServlet {

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
        if(request.getParameter("seconnecter")!=null) {
			String emailP=request.getParameter("username");
			String passwordP=request.getParameter("pass");
			ModeleCovoiturage m=new ModeleCovoiturage();
			personne p =m.findByEmail(emailP);
			if(p!=null) {
				if(passwordP.equals(p.getPasswordP())) {
					response.getWriter().print("Bienvenue");
                                        if(p.getType_personne().equals("conducteur"))
                                        {
                                            request.setAttribute("nom", p.getPrenomPersonne());
                                            request.getServletContext().getRequestDispatcher("/GestOffre.jsp").forward(request, response);
				}
                                        else
                                            request.getServletContext().getRequestDispatcher("/RechOffre.jsp").forward(request, response);
                                }
				else {
					response.getWriter().print("Veuillez retapez votre mot de passe");
					}
			}
			else {
				response.getWriter().print("Veuillez vous inscrire");
				
			}
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
