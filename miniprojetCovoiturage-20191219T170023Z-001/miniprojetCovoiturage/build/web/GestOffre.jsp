<%-- 
    Document   : GestOffre
    Created on : 1 déc. 2019, 18:02:23
    Author     : safeee
--%>
<%@page import="DAO.DAO_offre"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Beans.offreCov"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String nom ;%>
<%nom=(String)request.getAttribute("nom");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% DAO_offre DAO=new DAO_offre();%>
        <%ArrayList<offreCov> l=DAO.getAllOffre();%>
        <a href='GestOffre.jsp'>Gestion des offres</a><br>
        <a href='ajouterOffre.jsp?id=<%=nom%>'> Ajouter une offre </a><br>
        <a href='rechercherOffre.jsp'> Rechercher une offre</a><br>
        <table border="1">
            <tr><th>IDoffre</th><th>Heure Départ</th><th>Point de départ</th><th>Point d'Arrivée</th><th>Type de trajet</th><th>Nom Personne</th><th>Matricule</th><th>Editer</th><th>Supprimer</th></tr>
        <tr>
        <% for (int i=0; i<l.size(); i++) { %> 
        <td><%= l.get(i).getIdOffreCov() %> </td>
        <td><%= l.get(i).getDheureDepart() %></td>
        <td><%= l.get(i).getPointDepart() %></td>
        <td><%= l.get(i).getPointArrivé() %></td>
        <td><%= l.get(i).getTypeTrajet() %></td>
        <td><%= l.get(i).getNomPersonne() %></td>
        <td><%= l.get(i).getMatricule() %></td>
        <td><a href='modifierOffre.jsp'> Editer une offre</a></td>
        <td><a href='supprimerOffre.jsp'> Supprimer une offre</a></td>
        </tr>
<% }%>
        </table>
    </body>
</html>