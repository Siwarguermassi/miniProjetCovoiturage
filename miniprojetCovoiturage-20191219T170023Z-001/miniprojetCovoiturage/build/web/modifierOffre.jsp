<%-- 
    Document   : modifierOffre
    Created on : 3 déc. 2019, 09:40:04
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
        
         <form action ="ServModifierOffre" method="GET">
            <p>id Offre</p>
            <input type="text" name="idOffreCov" placeholder="idOffreCov" />
            <p>D-heure d'arrivée</p>
            <input type="text" name="DheureArrive" placeholder="DheureArrivée" />
            <p>D-heure du départ</p>
            <input type="text" name="DheureDepart" placeholder="DheureDepart" />
            <p>point d'arrivé</p>
            <input type="text" name="pointArrive" placeholder="pointArrivé" />    
            <p>point du depart</p>
            <input type="text" name="pointDepart" placeholder="pointDepart" />
            <p>type du trajet</p>
            <input type="text" name="typeTrajet" placeholder="typeTrajet" />
            <br><br>
            <input type="submit" name ="Modifier" value="Modifier" /> 
            <a href='GestOffre.jsp'>Gestion des offres</a>
            </form>
    </body>
</html>
