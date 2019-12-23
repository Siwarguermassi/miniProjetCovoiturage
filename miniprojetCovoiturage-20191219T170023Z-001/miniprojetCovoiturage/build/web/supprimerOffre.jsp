<%-- 
    Document   : supprimerOffre
    Created on : 3 déc. 2019, 11:33:16
    Author     : safeee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action ="ServSupprimerOffre" method="post">
       <p>id Offre</p>
            <input type="text" name="idOffreCov" placeholder="idOffreCov" />
            <br><br>
             <input type="submit" name ="Supprimer" value="Supprimer" /> 
           
             <br>
            <a href='GestOffre.jsp'>Gestion des offres</a>
    </body>
</html>
