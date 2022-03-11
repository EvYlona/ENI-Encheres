<%@page import="fr.eni.javaee.ProjetEncheres.bo.Utilisateurs"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html lang="fr">
<head>
<meta charset="UTF-8">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<!-- BootStrap JS -->
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
	integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
	crossorigin="anonymous">
	
</script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
	integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
	crossorigin="anonymous">
	
</script>


<title>Eni Enchères - Page Connexion</title>


<style>
h2 a {
	text-decoration: none;
	color: black;
}

/* Small devices (tablets, 768px and up) */
@media ( max-width : 768px) {
	h2 {
		margin-bottom: 130px;
		font-size: 3em;
	}
	.contenu {
		padding: 20px;
		font-size: .9em;
		width: 100%;
		text-align: justify;
	}
	.saisie {
		padding: 10px;
		margin-bottom: 20px;
	}
	.check {
		text-align: right;
		margin-top: -50px;
	}
	.button2 {
		margin-top: 40px;
		text-align: center;
	}
	.saisie input {
		float: right;
	}
}

/* Desktop Device */
@media ( min-width : 992px) {
	h2 {
		margin-bottom: 130px;
		font-size: 3em;
	}
	.contenu {
		font-size: 1.7em;
		text-align: center;
		width: 100%;
	}
	.saisie {
		margin-bottom: 40px;
	}
	button {
		height: 150px;
		width: 80%;
	}
	.checkbox input {
		margin-top: 20px;
		margin-left: 40px;
	}
	.button2 {
		margin-top: 70px;
		width: 40%;
		margin-left: 400px;
	}
	.saisie input {
		float: right;
		width: 30%;
		margin-right: 300px;
	}
}
</style>
</head>
<body class="container">
	<div class="row">
		<div class="col-sm-12 col-lg-6">
			<h2>
				<a href="<%=request.getContextPath()%>/index">Eni-Encheres</a>
			</h2>
		</div>
	</div>
	<div class="contenu">
		<form action="pageConnexion" method="post">
			<div class="saisie">
				<label for="pseudo">Identifiant:</label> <input type=text
					name="pseudo" value="<%=request.getParameter("pseudo")%>" autofocus />
			</div>
			<div class="saisie">
				<label for="motDePasse">Mot de passe:</label> <input type=text
					name="motdepasse" value="<%=request.getParameter("motdepasse")%>" />
			</div>
			<!-- Bouton Connexion -->
			<div class="row">
				<div class="button1 col-lg-6 col-lg-offset-3">
					<a href="pageConnectee"><button type="submit" class="btn-lg">Connexion</button></a>
				</div>
				<div class="check col-sm-6 col-lg-3 ">
					<span><input type="checkbox" name="save">Se souvenir
						de moi</span>
					<p>
						<a href="<%=request.getContextPath()%>"> Mot de Passe oublié</a>
					</p>
				</div>
			</div>
			<div class="row">
				<div class="button2 col-lg-12">
					<a href="pageCreationCompte"><button type="button"
							class="btn-lg">Creer un compte</button></a>
				</div>
			</div>
		</form>
	</div>

</body>
</html>