package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" <link href=\"cssajout.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("<div class=\"card bg-light\">\n");
      out.write("\n");
      out.write("    <CENTER>\t\n");
      out.write("    <form method=\"post\" action=\"ServAuth\">\n");
      out.write("                    <h1>Bonjour!</h1>\n");
      out.write("                    <h2>Connectez-Vous</h2>\n");
      out.write("\t\n");
      out.write("                    <label>Nom d'utilisateur : </label>\t \n");
      out.write("                    <input name=\"username\" class=\"form-control\" placeholder=\"Nom d'utilisateur\" type=\"text\" required><br>\n");
      out.write("                    <label>Mot de passe : </label>\n");
      out.write("                    <input name=\"pass\" class=\"form-control\" placeholder=\"Mot de passe\" type=\"password\" required><br>\n");
      out.write("   \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input type=\"submit\" name=\"seconnecter\" value=\"Se Connecter\"class=\"btn btn-primary btn-block\"><br>\n");
      out.write("         <a  href=\"inscription.jsp\">Rejoigner-nous</a>\n");
      out.write("    </div> <!-- form-group// -->      \n");
      out.write("    </form></CENTER>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
