package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajouterOffre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String nom;
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
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
 nom=(String)request.getParameter("id");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"cssajout.css\" rel=\"stylesheet\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <form action =\"ServAjouterOffre\" method=\"post\">\n");
      out.write("            <p>Nom Personne</p>\n");
      out.write("             <input type=\"text\" name=\"nomPersonne\" placeholder=\"nom personne\" value=\"");
      out.print(nom);
      out.write("\"  />  \n");
      out.write("            <p>id Offre</p>\n");
      out.write("            <input type=\"text\" name=\"idOffreCov\" placeholder=\"idOffreCov\" />   \n");
      out.write("            <p>point du depart</p>\n");
      out.write("            <input type=\"text\" name=\"pointDepart\" placeholder=\"pointDepart\" />\n");
      out.write("            <p>point d'arrivé</p>\n");
      out.write("            <input type=\"text\" name=\"pointArrive\" placeholder=\"pointArrivé\" /> \n");
      out.write("            <p>D-heure du départ</p>\n");
      out.write("            <input type=\"text\" name=\"DheureDepart\" placeholder=\"DheureDepart\" />\n");
      out.write("            <p>D-heure d'arrivée</p>\n");
      out.write("            <input type=\"text\" name=\"DheureArrive\" placeholder=\"DheureArrivée\" />\n");
      out.write("            <p>type du trajet</p>\n");
      out.write("            <select name=\"typeTrajet\">\n");
      out.write("\t\t<option value=\"regulier\">Trajet regulier</option>\n");
      out.write("\t\t<option value=\"occasionnel\">Trajet occasionnel</option>\n");
      out.write("\t\t</select>\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" name =\"Ajouter\" value=\"Ajouter\" /> \n");
      out.write("            <a href='GestOffre.jsp'>Gestion des offres</a>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
