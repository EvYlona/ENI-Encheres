<!DOCTYPE html>
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

<title>Eni Enchères - Modifier son Profil</title>
<style>
a {
	text-decoration: none;
	color: black;
}
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
	font-size: 0.95rem;
}

form .form-group {
	width: 50%;
	float: right;
	margin-bottom: 10px;
	border: 1px solid black;
}

form .col-form-label {
	margin-left: 10px !important;
	margin-top: -5px;
	font-size: 0.80rem;
}

.bouton {
	text-align: center;
	margin-top: 10px;
	width: 100%;
}

.btn-md {
	border: 2px solid black;
	font-size: 10px;
	width: 40%;
	height: 50px;
	margin: 3px;
}

.btn-sm {
	border: 2px solid black;
	font-size: 10px;
	width: 20%;
	height: 50px;
	margin: 3px;
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
		font-size: 1rem;
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
		font-size: 1rem;
	}
	.bouton {
		text-align: center;
		margin-top: 20px;
		width: 100%;
	}
	.btn-lg {
		border: 2px solid black;
		font-size: 15px;
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
		font-size: 1rem;
		width: 30%;
		height: 80px;
		font-weight: normal;
	}
	
	.btn-md, .btn-sm{
		font-size:15px;
	}
}
</style>
</head>
<body class="container-fluid">
	<section>
		<header class="row">
			<div class="col-sm-12 col-lg-12">
				<h2 class="header1"><a href="<%=request.getContextPath()%>/pageConnectee">Eni-Encheres</a></h2>
			</div>
		</header>
		<article class="col-xs-12">
			<div class="row">
				<p class="titre" align="center">Modifier le profil</p>
			</div>
			<form class="row">
				<!-- Pseudo -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="pseudo" class="col-form-label">Pseudo:</label> <input
						type="text" class="form-group">
				</div>
				<!-- Nom -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="nom" class="col-form-label">Nom:</label> <input
						type="password"  class="form-group">
				</div>
				<!-- Prenom -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="prenom" class="col-form-label">Prenom:</label> <input
						type="text"  class="form-group">
				</div>
				<!-- Email -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="email" class="col-form-label">Email:</label> <input
						type="email"  class="form-group">
				</div>
				<!-- Telephone -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="telephone" class="col-form-label">Telephone:</label> <input
						type="text"  class="form-group">
				</div>
				<!-- Rue -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="rue" class="col-form-label">Rue</label> <input
						type="text"  class="form-group">
				</div>
				<!-- Code Postal -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="codePostal" class="col-form-label">Code Postal:</label>
					<input type="text" class="form-group">
				</div>

				<!-- Ville -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="ville" class="col-form-label">Ville:</label> <input
						type="text"  class="form-group">
				</div>

				<!-- Mot de passe ACTUEL -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="Password" class="col-form-label">Mot de passe
						actuel:</label> <input type="password"  class="form-group">
				</div>
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
				</div>
				<!-- Mot de passe -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="Password" class="col-form-label">Nouveau mot de
						passe:</label> <input type="password" class="form-group">
				</div>

				<!-- Confirmation -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
					<label for="inputConfirmedPassword" class="col-form-label">Confirmation:</label>
					<input type="password" id="ConfirmedNewPassword" class="form-group">
				</div>
				<!-- Confirmation -->
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-6"
					style="margin-top: 20px;">
					<span class="col-form-label">Crédit:</span> <span
						class="form-group" style="border: none; font-size:1.2rem;">########</span>
				</div>

			</form>

			<!-- Bouton -->
			<div class="row bouton">
				<div class="col-xs-12 col-sm-12">
					<a href="<%=request.getContextPath()%>/pageConnectee"><button type="submit" class="btn-sm">Enregistrer</button></a>
					<a href="<%=request.getContextPath()%>/index"><button type="submit" class="btn-md">Supprimer
							mon compte</button></a> <a href="<%=request.getContextPath()%>/pageConnectee"><button type="button"
							class="btn-sm">Retour</button></a>

				</div>
			</div>
		</article>
	</section>
</body>
</html>