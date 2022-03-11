<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@page import="fr.eni.javaee.ProjetEncheres.bo.Utilisateurs"%>

<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<title>Eni Enchères - Mon profil</title>

<style>
a {
	text-decoration: none;
	color: black;
}

/* Extra small devices (phones, 600px and down) */
@media only screen and (max-width: 600px) {
	.container-fluid {
		width: 100%;
	}
	.header {
		margin-top: 20px;
		font-size: 2.2rem;
		margin-left: 5px;
	}
	.row-section {
		
	}
	.identifiant {
		visibility: hidden;
	}
	.center {
		margin-left: 20px;
		width:100%;
	}
	.td {
		font-size: 1.2em;
		margin-bottom:20px;
		
	}
	td {
		padding: 0 20px;
		height: 50px;
		margin-top:20px;
	}
	input {
	margin-left:200px;
}
}

/* Medium devices (landscape tablets, 768px and up) */
@media only screen and (min-width: 768px) {
	.container-fluid {
		width: 100vw;
	}
	.header {
		margin-left: 100px;
		margin-top: 50px;
		font-size: 2.8rem;
	}
	.row-section {
		margin-top: 30px;
		margin-left: 100px;
	}
	.identifiant {
		visibility: hidden;
	}
	.body-table {
		font-size: 2.5rem;
	}
	td {
		padding: 0 30px;
		height: 70px;
		font-size: 2.5rem;
	}
}

/* Large devices (laptops/desktops, 992px and up) */
@media only screen and (min-width: 992px) {
	.container-fluid {
		
	}
	.header {
		margin-left: 150px;
		margin-top: 50px;
		font-size: 2.5rem;
		width: 25vw;
	}
	.row-section {
		font-size: 2rem;
		width: 50vw;
		margin-left: 15rem;
		margin-top: -40px;
	}
	.identifiant {
		visibility: hidden;
	}
	.body-table {
		font-size: 2.4rem;
		height: 15em;
	}
	
	input {
	float:right;
}
}

/* Extra large devices (large laptops and desktops, 1200px and up) */
@media only screen and (min-width: 1200px) {
		.row-section {
		margin-left: 25rem;
	}
}
</style>
</head>

<body class="container-fluid">

		
	<header class="header"><a href="<%=request.getContextPath()%>/pageConnectee">Eni Enchères</a></header>
	<br>
	<!-- Haut de Page -->
	<section class="row-section">
		<div class="col-sm-12">
			<table class="center">
				<thead class="identifiant">
					<tr>
						<th colspan="2">Pseudo</th>
					</tr>
				</thead>
				<!-- Titre du tableau -->
				<tbody class="td">
					<!-- Pseudo -->
					<tr class="pseudo">
						<td>Pseudo:</td>
						<td>################</td>
					</tr>
					<!-- Nom -->
					<tr class="nom">
						<td>Nom:</td>
						<td>################</td>
					</tr>
					<!-- Prenom -->
					<tr class="prenom">
						<td>Prenom:</td>
						<td>################</td>
					</tr>
					<!-- Email -->
					<tr class="email">
						<td>Email:</td>
						<td>################</td>
					</tr>
					<!-- Telephone -->
					<tr class="telephone">
						<td>Telephone:</td>
						<td>################</td>
					</tr>
					<!-- Rue -->
					<tr class="rue">
						<td>Rue:</td>
						<td>################</td>
					</tr>
					<!-- Code Postal -->
					<tr class="codePostal">
						<td>Code Postal:</td>
						<td>################</td>
					</tr>
					<!-- Ville -->
					<tr class="ville">
						<td>Ville:</td>
						<td>################</td>
					</tr>
				</tbody>
			</table>
			<br>
			<!-- Mon choix s'est porter sur un tableau en 2 colonne, les attributs et leurs valeurs. -->
			<div class="col-sm-12 col-lg-6">
			
				<a href="<%=request.getContextPath()%>/PageModifierProfil"><input type="button"
						value="Modifier"/></a>
						
			</div>
			<!-- 2nde Ligne Bootstrap ayant le bouton modifier qui va rediriger l'utilisateur vers la page modifier -->
		</div>
	</section>
	<!-- Section qui comporte les information profil Utilisateur: 1ere ligne bootstrap-->

</body>
<!-- Container-fluid me permettant d'étandre au maximum l'espacement de la page -->
</html>