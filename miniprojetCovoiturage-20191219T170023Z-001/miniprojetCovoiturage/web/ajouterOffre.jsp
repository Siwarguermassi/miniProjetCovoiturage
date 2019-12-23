<%-- 
    Document   : ajouterOffre
    Created on : 3 déc. 2019, 09:17:53
    Author     : safeee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String nom;%>
<% nom=(String)request.getParameter("id");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="cssajout.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
    <CENTER>
        <h1> Ajouter une offre </h1>
         <form action ="ServAjouterOffre" method="post">
            <label>Nom Personne :</label>
            <input type="text" name="nomPersonne" placeholder="nom personne" value="<%=nom%>"  /><br>  
            <label>id Offre :</label>
            <input type="text" name="idOffreCov" placeholder="idOffreCov" /><br>   
            <label>point du depart :</label>
            <input type="text" name="pointDepart" placeholder="pointDepart" /><br>
            <label>point d'arrivé :</label>
            <input type="text" name="pointArrive" placeholder="pointArrivé" /><br> 
            <label>D-heure du départ :</label>
            <input type="text" name="DheureDepart" placeholder="DheureDepart" /><br>
            <label>D-heure d'arrivée :</label>
            <input type="text" name="DheureArrive" placeholder="DheureArrivée" /><br>
            <label>type du trajet :</label>
            <select name="typeTrajet">
		<option value="regulier">Trajet regulier</option>
		<option value="occasionnel">Trajet occasionnel</option>
		</select>
            <br><br>
            <div>
                <input  type="submit" name ="Ajouter" value="Ajouter" /> <br><div>
            <a href='GestOffre.jsp'>Gestion des offres</a>
         </form></CENTER>
    </body>
</html>
