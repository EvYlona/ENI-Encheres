<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8"> 
<meta content="width=device-width, initial-scale=1"
	name="viewport" />
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

.btn {
	border-width: 2px;
	border-style: solid;
	border-color: black;
	outline: none;
}

/* Extra small devices (phones, 600px and down) */
@media only screen and (max-width: 600px) {
	.container-fluid {
		width: 100vw;
	}
	.header {
		margin-top: 20px;
		font-size: 2.2rem;
		margin-left: 5px;
	}
	.row-section {
		margin-left: 50px; 
	}
	.identifiant {
		margin-top: 10px;
		font-size: 1.8rem;
		text-align:center;
		
	}
	.body-table {
		height: 300px;
		font-size: 1.3em;
	}
	.btn {
		margin-left: 70px;
	}
}

/* Medium devices (landscape tablets, 768px and up) */
@media only screen and (min-width: 600px) and (max-width: 992px) {
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
		font-size: 2.4rem;
		height: 18em;
		font-stretch:125%;
	}
	.btn {
		margin-left: 200px;
	}
}

/* Large devices (laptops/desktops, 992px and up) */
@media only screen and (min-width: 992px) {
	.container-fluid {
		
	}
	.header {
		margin-left: 250px;
		margin-top: 50px;
		font-size: 3rem;
		width: 25vw;
	}
	.row-section {
		font-size: 2.4rem;
		width: 50vw;
		margin-left: 35rem;
		margin-top: -40px;
	}
	.identifiant {
		visibility: hidden;
	}
	.body-table {
		font-size: 2.4rem;
		height: 15em;
	}
	.btn {
		margin-left: 150px;
	}
}

/* Extra large devices (large laptops and desktops, 1200px and up) */
@media only screen and (min-width: 1200px) {
}
</style>
</head>

<body class="container-fluid">
	<a href="acceuil"> <header class="header">Eni Enchères</header></a>
	<br>
	<!-- Haut de Page -->
	<section class="row-section">
		<div class="col-sm-12">
			<table>
				<thead class="identifiant">
					<tr>
						<th colspan="2">Pseudo</th>
					</tr>
				</thead>
				<!-- Titre du tableau -->
				<tbody class="body-table">
					<!-- Pseudo -->
					<tr class="pseudo">
						<td>Pseudo:</td>
						<td>(get.Pseudo)</td>
					</tr>
					<!-- Nom -->
					<tr class="nom">
						<td>Nom:</td>
						<td>(get.Nom)</td>
					</tr>
					<!-- Prenom -->
					<tr class="prenom">
						<td>Prenom:</td>
						<td>(get.Prenom)</td>
					</tr>
					<!-- Email -->
					<tr class="email">
						<td>Email:</td>
						<td>(get.Email)</td>
					</tr>
					<!-- Telephone -->
					<tr class="telephone">
						<td>Telephone:</td>
						<td>(get.Telephone)</td>
					</tr>
					<!-- Rue -->
					<tr class="rue">
						<td>Rue:</td>
						<td>(get.Rue)</td>
					</tr>
					<!-- Code Postal -->
					<tr class="codePostal">
						<td>Code Postal:</td>
						<td>(get.codePostal)</td>
					</tr>
					<!-- Ville -->
					<tr class="ville">
						<td>Ville:</td>
						<td>(get.Ville)</td>
					</tr>
				</tbody>
			</table>
			<br>
			<!-- Mon choix s'est porter sur un tableau en 2 colonne, les attributs et leurs valeurs. -->
			<div class="row">
				<a href="PageModifierProfil"><button type="button"
						class="btn btn-light btn-lg">Modifier</button></a>
			</div>
			<!-- 2nde Ligne Bootstrap ayant le bouton modifier qui va rediriger l'utilisateur vers la page modifier -->
		</div>
	</section>
	<!-- Section qui comporte les information profil Utilisateur: 1ere ligne bootstrap-->

</body>
<!-- Container-fluid me permettant d'étandre au maximum l'espacement de la page -->
</html>