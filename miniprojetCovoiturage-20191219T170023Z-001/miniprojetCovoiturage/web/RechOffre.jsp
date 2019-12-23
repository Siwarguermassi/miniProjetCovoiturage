<%-- 
    Document   : RechOffre
    Created on : 7 déc. 2019, 16:38:58
    Author     : safeee
--%>

<%@page import="Beans.offreCov"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
 <head>
     <link href="cssBib.css" rel="stylesheet">
 <title>MAP</title>
 <meta charset="utf8" />
 <script type="text/javascript" src="http://maps.google.com/maps/api/js?&key=AIzaSyC7AOdnEdlcKT-ERg_qn_u8UrSDvn1cpVs&libraries=places"></script>
 <style type="text/css">
html, body {
 width: 100%;
 height: 100%;
}
body {
 margin: 0;
 position: relative;
}
#maps {
	margin-top: 80px;
 margin-left: 140px;
 width: 80%;
 height: 70%; 
 position: absolute;
 left: 0;
 top: 0;
  border-radius:15px 0 15px 0;
    box-shadow:1px 1px 3px #999;
}
#search{
    margin-top: 20px;
 margin-left: 138px;
 width: 80%;
 height: 100%; 
 font-weight: bold;
font-size:20px;
 margin-bottom: 20px;   
    border-radius:15px 0 15px 0;
    box-shadow:1px 1px 3px #999;
}
#search:hover{
     background:darkseagreen;
}
#steps {
  width: 280px;
  height: 400px;
  position: absolute;
  right: 24px;
  top: 24px;
  background-color: #FFFFFF;
  border-radius: 8px;
  box-shadow: 0 0 16px #C0C0C0;
  padding: 10px;
  overflow: auto;
}
 </style>
 <script type="text/javascript">

var objLocation, objMaps, objCurrentLocationMarker, objInfoWindow, objService ,objDirection;

if (navigator.geolocation) {
 navigator.geolocation.getCurrentPosition(function(position) {
 objLocation = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
 objMaps = new google.maps.Map(document.querySelector("#maps"), {
 zoom: 16, 
 center: objLocation, 
 mapTypeControl: false,
 scaleControl: false,
 streetViewControl: false,
 overviewMapControl: false,
 zoomControl: true,
 navigationControlOptions: { style: google.maps.NavigationControlStyle.SMALL },
 mapTypeId: google.maps.MapTypeId.ROADMAP
 });
 
 objCurrentLocationMarker = new google.maps.Marker({
 position: objLocation,
 map: objMaps,
 title: "Vous êtes ici !" 
 });
 google.maps.event.addListener(objCurrentLocationMarker, 'click', function() {
 objInfoWindow.setContent("Vous êtes ici !");
 objInfoWindow.open(objMaps, this);
 });

 objInfoWindow = new google.maps.InfoWindow();
 objService = new google.maps.places.PlacesService(objMaps);
 objDirection = new google.maps.DirectionsRenderer({
  map: objMaps,
  panel: document.getElementById("steps")
});

 google.maps.event.addListenerOnce(objMaps, 'bounds_changed', doSearch);
doSearch();

 }, function(msg) {
 alert("Erreur : " + msg);
 });
}
function doSearch() {
    objService.nearbySearch({
        location: objLocation,
        radius: 1000,
        types: ['Entreprise','Buisness','Société']
    }, function(results, status) {
        if (status == google.maps.places.PlacesServiceStatus.OK) {
            for (var i = 0; i < results.length; i++) {
                createMarker(results[i]);
            }       
        } 
    });
}
function createMarker(objPlace) {
    if (objPlace.types[0] !== "Entreprise" && objPlace.types[0] !== "Buisness" &&
        objPlace.types[0] !== "Société") {
        return;   
    }
    
    var objMarker = new google.maps.Marker({
        position: objPlace.geometry.location,
        map: objMaps,
        icon: "http://www.google.com/mapfiles/ms/micons/purple-dot.png",
        title: objPlace.name
    });

    google.maps.event.addListener(objMarker, 'load', function() {
       var strHTML = "<b>" + objPlace.name + "</b><br />";
        if (objPlace.types[0] == "bar") {
            strHTML += "Bistrot";
        } else if (objPlace.types[0] == "cafe") {
            strHTML += "Café";
        } else if (objPlace.types[0] == "restaurant") {
            strHTML += "Resto";      
        } else {
            strHTML += "Inconnu (" + objPlace.types[0] + ")";   
        }
        
        objInfoWindow.setContent(strHTML);
        objInfoWindow.open(objMaps, this);
        
        document.getElementById("steps").style.display = 'block';
  var objDirectionService = new google.maps.DirectionsService();
  objDirectionService.route({
    origin: objLocation,
    destination: objPlace.geometry.location,
    travelMode: google.maps.DirectionsTravelMode.DRIVING
  }, function(response, status) {
    if (google.maps.DirectionsStatus.OK) {
      objDirection.setDirections(response);
    }
  });
    }); 
    
    
}
var map,infowindow;
    function initialize() {
       var option ={
        zoom: 19,
        center: {lat :36.806496, lng :10.181532},
        mapTypeId: google.maps.MapTypeId.ROADMAP


      };
  map = new google.maps.Map(document.getElementById("maps"),option);
  	var input = document.getElementById('search');
  	var searchbox = new google.maps.places.SearchBox(input);
  	map.addListener('bounds_changed',function(){
  		searchbox.setBounds(map.getBounds());
  	});
  	var markers=[];
  	searchbox.addListener('places_changes',function(){
  		var places = searchbox.getPlaces();
  		if(places.length ===0)
  			return;
  			markers.foreach(function(m){m.setMap(null);});
  			markers =[];
  			var bounds = new google.maps.LatLngBounds();
  			places.foreach(function(p){
  				if(!p.geometry){
  					return;
  				}
  				markers.push(new google.maps.Marker({
  					map : map,
  					title : p.name,
  					position : p.geometry.location
  				}));
  				if(p.geometry.viewport)
  					bounds.union(p.geometry.viewport);
  				else
  					bounds.extends(p.geometry.viewport);
  			});

  		map.fitBounds(bounds);
  	});
      
      var marker = new google.maps.Marker({
	
	position: {lat: lat, lng: lon},

	map: map
});
	}
 </script>
 
 </head>
 <body onload="initialize()" style="background-color: #2d2d2d">
  <div class="coll">
    	<input class="form-control" id="search" type="text"  placeholder="search..." /><br><br>
        
    </div>	
 <div id="maps"></div>
 <div id="steps" style="display: none;"></div>
 
 
 </body>
</html>