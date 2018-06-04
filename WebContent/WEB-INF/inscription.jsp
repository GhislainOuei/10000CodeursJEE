<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/theme.css">


<title>Inscription - 10000 Codeurs</title>
</head>
<body>
	<div class="container">
	<h2 align ="center">10000 Codeurs Côte d'Ivoire</h2>
	<marquee>Merci de rejoindre l'aventure 10000 Codeurs</marquee>
		<div class="container">
		<div class ="title"> Inscription</div>
		<fieldset>		
			<% if (request.getAttribute("erreur") != null) { %>
				<%if(request.getAttribute("erreur_nom") != null) {%>
					<div class="alert alert-warning">erreur sur le nom</div>
				<%} %>
			
		<% } %>
		</fieldset>
		
		<form action="inscription" method="post">
			<div class="form-group">
				<label for="nom">Nom: 
				<input type="text" class="form-control" name="nom">
				</label>
				
			</div>
			
			<div class="form-group">
				<label for="prenom">Prénom: 
				<input type="text" class="form-control" name="prenom"> 
				</label>
				
			</div>
			
			<div class="form-group">
				<label for="nom">Email:
				<input type="text" class="form-control" name="email" placeholder="exemple@objis.com">
				 </label>
				
			</div>
			
			<div class="form-group">
				<label for="dateNaiss">Date de naissance: 
				<input type="text" class="form-control" name="dateNaiss" placeholder="JJ/MM/AAAA">
				</label>
				
			</div>
			<div class="form-group">
				<label for="tel">Telephone:
				<input type="text" class="form-control" name="tel" placeholder="225 09309699">
				 </label>
				
			</div>
			<button class="btn btn-primary" type="submit"> S'inscrire</button>
			
		</form>
		</div>	
	</div>

<script type="text/javascript" src="bootstrap/js/bootstrap.min.js" ></script>
</body>
</html>