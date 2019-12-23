<%-- 
    Document   : formVoiture
    Created on : 7 déc. 2019, 19:12:45
    Author     : safeee
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">
     <link href="cssvehicule.css" rel="stylesheet">

    <!-- Title Page-->
    <title>Information Voiture</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    
</head>

<body>
    
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <CENTER>
                    <h1 class="title">Information Voiture</h1>
                    
                    <form action="ServInscri" method="POST">
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Matricule : </label>
                                    <input class="input--style-4" type="text" name="matricule">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Marque : </label>
                                    <input class="input--style-4" type="text" name="marque">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                              
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Fumeur : </label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Oui
                                            <input type="radio" checked="" name="fumeur">
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Non
                                            <input type="radio" name="fumeur">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                                 <div class="input-group">
                                    <label class="label">Climatisation : </label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Oui
                                            <input type="radio" checked="" name="climatisation">
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Non
                                            <input type="radio" name="climatisation">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                                 <div class="input-group">
                                    <label class="label">Musique : </label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Oui
                                            <input type="radio" checked="c" name="musique">
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Non
                                            <input type="radio" name="musique">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                       
                             <input class="btn btn--radius-2 btn--blue" type="submit" name="enreg" value="s'enregistrer">
                          
                        </div>
                       
                        </div>
                       
                           
                      
</form></CENTER>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body>

</html>
