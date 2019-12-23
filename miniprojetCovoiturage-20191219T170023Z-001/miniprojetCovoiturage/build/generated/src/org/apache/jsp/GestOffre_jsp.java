package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAO_offre;
import java.util.ArrayList;
import Beans.offreCov;
import java.util.List;

public final class GestOffre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String nom ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
nom=(String)request.getAttribute("nom");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 DAO_offre DAO=new DAO_offre();
      out.write("\n");
      out.write("        ");
ArrayList<offreCov> l=DAO.getAllOffre();
      out.write("\n");
      out.write("        <a href='GestOffre.jsp'>Gestion des offres</a><br>\n");
      out.write("        <a href='ajouterOffre.jsp?id=");
      out.print(nom);
      out.write("'> Ajouter une offre </a><br>\n");
      out.write("        <a href='rechercherOffre.jsp'> Rechercher une offre</a><br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr><th>IDoffre</th><th>Heure Départ</th><th>Point de départ</th><th>Point d'Arrivée</th><th>Type de trajet</th><th>Nom Personne</th><th>Matricule</th><th>Editer</th><th>Supprimer</th></tr>\n");
      out.write("        <tr>\n");
      out.write("        ");
 for (int i=0; i<l.size(); i++) { 
      out.write(" \n");
      out.write("        <td>");
      out.print( l.get(i).getIdOffreCov() );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print( l.get(i).getDheureDepart() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( l.get(i).getPointDepart() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( l.get(i).getPointArrivé() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( l.get(i).getTypeTrajet() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( l.get(i).getNomPersonne() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( l.get(i).getMatricule() );
      out.write("</td>\n");
      out.write("        <td><a href='modifierOffre.jsp'> Editer une offre</a></td>\n");
      out.write("        <td><a href='supprimerOffre.jsp'> Supprimer une offre</a></td>\n");
      out.write("        </tr>\n");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
