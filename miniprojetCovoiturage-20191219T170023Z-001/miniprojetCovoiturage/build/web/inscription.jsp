<%-- 
    Document   : Inscription
    Created on : 19 nov. 2019, 10:04:21
    Author     : Dell
--%>


<html>
<head>
 <link href="cssajout.css" rel="stylesheet">
</head>
 <body>
 <CENTER>
	<h4 class="card-title mt-3 text-center">Création de compte</h4>

	<form method="post" action="ServInscri">
            <label>Nom : </label>
            <input name="nomPersonne" class="form-control" placeholder="Nom" type="text"><br>
        
        <label>Prenom : </label>
		
        <input name="prenomPersonne" class="form-control" placeholder="Prenom" type="text"><br>
        <label>Sexe :</label>
      <select name="sexeP" class="form-control">
			<option value="homme">Homme</option>
			<option value="femme">Femme</option>
      </select><br>
      <label>Telephone : </label>
      <input name="TelP" class="form-control" placeholder="+216" type="telephone"><br>        
            <label>Adresse Email : </label>
            <input name="emailP" class="form-control" placeholder="Adresse Email" type="email"> <br>     
      
        <label>Type : </label>
  
		<select name="type" class="form-control">
			<option value="passager">passager</option>
			<option value="conducteur">conducteur</option>
                </select><br>
	
                <div>
        <input name="inscription" type="submit"  value="S'inscrire"class="btn btn-primary btn-block"><br>
                </div>
    <a  href="index.jsp">Retour à la connection</a>
        </form></CENTER>
</body>
</html>

