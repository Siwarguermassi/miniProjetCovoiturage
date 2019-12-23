package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <link href=\"cssajout.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write(" <body>\n");
      out.write(" <CENTER>\n");
      out.write("\t<h4 class=\"card-title mt-3 text-center\">Création de compte</h4>\n");
      out.write("\n");
      out.write("\t<form method=\"post\" action=\"ServInscri\">\n");
      out.write("            <label>Nom : </label>\n");
      out.write("            <input name=\"nomPersonne\" class=\"form-control\" placeholder=\"Nom\" type=\"text\"><br>\n");
      out.write("        \n");
      out.write("        <label>Prenom : </label>\n");
      out.write("\t\t\n");
      out.write("        <input name=\"prenomPersonne\" class=\"form-control\" placeholder=\"Prenom\" type=\"text\"><br>\n");
      out.write("        <label>Sexe :</label>\n");
      out.write("      <select name=\"sexeP\" class=\"form-control\">\n");
      out.write("\t\t\t<option value=\"homme\">Homme</option>\n");
      out.write("\t\t\t<option value=\"femme\">Femme</option>\n");
      out.write("      </select><br>\n");
      out.write("      <label>Telephone : </label>\n");
      out.write("      <input name=\"TelP\" class=\"form-control\" placeholder=\"+216\" type=\"telephone\"><br>        \n");
      out.write("            <label>Adresse Email : </label>\n");
      out.write("            <input name=\"emailP\" class=\"form-control\" placeholder=\"Adresse Email\" type=\"email\"> <br>     \n");
      out.write("      \n");
      out.write("        <label>Type : </label>\n");
      out.write("  \n");
      out.write("\t\t<select name=\"type\" class=\"form-control\">\n");
      out.write("\t\t\t<option value=\"passager\">passager</option>\n");
      out.write("\t\t\t<option value=\"conducteur\">conducteur</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t\n");
      out.write("  \n");
      out.write("        <input name=\"inscription\" type=\"submit\"  value=\"S'inscrire\"class=\"btn btn-primary btn-block\">\n");
      out.write("   \n");
      out.write("    <a style=\"margin-left:80px\" href=\"index.jsp\">Retour à la connection</a>\n");
      out.write("        </form></CENTER>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
