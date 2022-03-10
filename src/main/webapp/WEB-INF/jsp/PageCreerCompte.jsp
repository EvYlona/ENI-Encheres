<!DOCTYPE html>
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

<title>Eni Enchères - Creer son compte</title>
<style>

/* Mobile First */
.header1 {
	margin-top: 15px;
	width: 100%;
	margin-bottom: 30px;
}

.titre {
	font-size: 1.2rem;
	margin-bottom: 25px;
	width: 100%;
}

form {
	width: 100%;
	font-size: 1.1rem;
}

form .form-group {
	width: 60%;
	float: right;
	margin-bottom: 10px;
	border: 1px solid black;
}

form .col-form-label {
	margin-left: 20px !important;
	margin-top: -5px;
	font-size: 0.95rem;
}

.bouton {
	text-align: center;
	margin-top: 15px;
	width: 100%;
}

.btn-lg {
	border: 2px solid black;
	font-size: 15x;
	width: 40%;
	height: 50px;
	margin: 15px;
}

/* Small devices (tablets, 768px and up) */
@media only screen and (min-width: 768px) {
	.header1 {
		margin-top: 20px;
		width: 100%;
		margin-bottom: 30px;
	}
	.titre {
		font-size: 1.5rem;
		margin-bottom: 30px;
		width: 100%;
	}
	form {
		width: 100%;
		font-size: 1.5rem;
	}
	form .form-group {
		width: 70%;
		float: right;
		margin-bottom: 10px;
		border: 1px solid black;
		height: 40px;
	}
	form .col-form-label {
		margin-left: 20px !important;
		margin-top: -10px;
		font-size: 1.3rem;
	}
	.bouton {
		text-align: center;
		margin-top: 20px;
		width: 100%;
	}
	.btn-lg {
		border: 2px solid black;
		font-size: 15x;
		width: 40%;
		height: 60px;
		margin: 15px;
	}
}
/* Medium devices (desktops, 992px and up) */
@media ( min-width : 992px) {
	.header1 {
		font-size: 2rem;
		margin-top: 20px;
		margin-left: 120px;
	}
	.titre {
		font-size: 2rem;
		margin-top: 40px;
		margin-bottom: 80px;
	}
	article {
		width: 80%;
		margin: auto;
		padding: 10px;
	}
	form {
		width: 100%;
		font-size: 0.7rem;
		margin-bottom: 20px;
	}
	form .form-group {
		width: 60%;
		font-size: .65rem;
		float: right;
	}
	form .col-form-label {
		font-size: .68rem;
		width: 30%;
		height: 80px;
		font-weight: bold;
	}
}

/* Large devices (large desktops, 1200px and up) */
@media ( min-width : 1200px) {
	form .col-form-label {
		font-size: 1.2rem;
		width: 30%;
		height: 80px;
		font-weight: normal;
	}
}
</style>
</head>
<body class="container-fluid">
	<header class="row">
		<div class="col-sm-12 col-lg-12">
			<h2 class="header1">Eni-Encheres</h2>
		</div>
	</header>
	<article class="col-xs-12">
		<div class="row">
			<p class="titre" align="center">Creer un compte</p>
		</div>
		<form action="<%=request.getContextPath()%>/pageCreationCompte"
			method="post">
			<!-- Pseudo -->
			<div class="col-sm-12 col-lg-6">
				<label for="pseudo" class="col-form-label">Pseudo:</label> <input
					type="text" name="pseudo" class="form-group"
					value="<%=request.getParameter("pseudo")%>">
			</div>
			<!-- Nom -->
			<div class="col-sm-12 col-lg-6">
				<label for="nom" class="col-form-label">Nom:</label> <input
					type="text" name="nom" class="form-group"
					value="<%=request.getParameter("nom")%>">
			</div>
			<!-- Prenom -->
			<div class="col-sm-12 col-lg-6">
				<label for="prenom" class="col-form-label">Prenom:</label> <input
					type="text" name="prenom" class="form-group"
					value="<%=request.getParameter("prenom")%>">
			</div>
			<!-- Email -->
			<div class="col-sm-12 col-lg-6">
				<label for="email" class="col-form-label">Email:</label> <input
					type="email" name="email" class="form-group"
					value="<%=request.getParameter("email")%>">
			</div>
			<!-- Telephone -->
			<div class="col-sm-12 col-lg-6">
				<label for="telephone" class="col-form-label">Telephone:</label> <input
					type="text" name="telephone" class="form-group"
					value="<%=request.getParameter("telephone")%>">
			</div>
			<!-- Rue -->
			<div class="col-sm-12 col-lg-6">
				<label for="rue" class="col-form-label">Rue</label> <input
					type="text" name="rue" class="form-group"
					value="<%=request.getParameter("rue")%>">
			</div>
			<!-- Code Postal -->
			<div class="col-sm-12 col-lg-6">
				<label for="codePostal" class="col-form-label">Code Postal:</label>
				<input type="text" name="codepostal" class="form-group"
					value="<%=request.getParameter("codepostal")%>">
			</div>

			<!-- Ville -->
			<div class="col-sm-12 col-lg-6">
				<label for="ville" class="col-form-label">Ville:</label> <input
					type="text" name="ville" class="form-group"
					value="<%=request.getParameter("ville")%>">
			</div>

			<!-- Mot de passe -->
			<div class="col-sm-12 col-lg-6">
				<label for="Password" class="col-form-label">Mot de Passe:</label> <input
					type="password" name="password" class="form-group"
					value="<%=request.getParameter("password")%>">
			</div>

			<!-- Pseudo -->
			<div class="col-sm-12 col-lg-6">
				<label for="Password" class="col-form-label">Confirmation:</label> <input
					type="password" name="password" class="form-group"
					value="<%=request.getParameter("password")%>">
			</div>

			<!-- Bouton -->
			<div class="row bouton">
				<div class="col-sm-12">
					<a href="<%=request.getContextPath()%>/pageConnectee"><input type="submit"
							></button></a> <a href="/index.jsp"><button
							type="button" class="btn-lg">Annuler</button></a>
				</div>
			</div>
		</form>
	</article>
</body>
</html>