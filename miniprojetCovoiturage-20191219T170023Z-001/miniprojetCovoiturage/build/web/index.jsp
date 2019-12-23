
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
 <link href="cssajout.css" rel="stylesheet">
    </head>
 <body>

<div class="card bg-light">

    <CENTER>	
    <form method="post" action="ServAuth">
                    <h1>Bonjour!</h1>
                    <h2>Connectez-Vous</h2>
	
                    <label>Nom d'utilisateur : </label>	 
                    <input name="username" class="form-control" placeholder="Nom d'utilisateur" type="text" required><br>
                    <label>Mot de passe : </label>
                    <input name="pass" class="form-control" placeholder="Mot de passe" type="password" required><br>
   
    <div class="form-group">
        <input type="submit" name="seconnecter" value="Se Connecter"class="btn btn-primary btn-block"><br>
         <a  href="inscription.jsp">Rejoigner-nous</a>
    </div> <!-- form-group// -->      
    </form></CENTER>
   

</body>
</html>



