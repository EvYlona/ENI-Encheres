<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta content="width=device-width, initial-scale=1"
	name="viewport" />
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

/* Penser mobile first */
 /* Extra small devices (phones, 600px and down) */
@media only screen and (max-width: 600px) {
	body {

	}
	header {
		margin-top:20px;
		font-size:1.3rem;
		margin-left:50px;
	}
	
}




h1 {
	font-size: 4rem;
	margin-left: 50px;
	margin-top: 50px;
}

h2 {
	font-size: 3.5rem;
	margin-left: 50px;
	margin-top: 50px;
}

.row {
	font-size:2rem;
	margin-top:60px;
	height:40px;
	text-align:right;
}

form {
    display: inline-block;
}

.form-control {
	border-color:black;
	border-width:thick;
}

.btn {
	border-color:black;
	border-width:thick;
	margin-top:40px;
	
}


@media only screen and (min-width: 375px) and (max-width: 576px)
    body { line-height: 1.4 }
    .col {sm-12}
}
/* // Small devices (landscape phones, less than 768px) */
@media ( max-width : 767.98px) {
	...
}

/* Medium devices (tablets, less than 992px) */
@media ( max-width : 991.98px) {
	...
}

/* Large devices (desktops, less than 1200px) */
@media ( max-width : 1199.98px) {
}
}
</style>
</head>
<body>
	<div class="container-fluid">
		<header>
			<h1>Eni Enchères</h1>
		</header>

		<section id="main">
			<div class="container-fluid">
				<div class="row">
					<h2 align="center">Creer un compte</h2>
				</div>
				<div class="row">
					<form>
						<div class="row g-3">
						<!-- Pseudo -->
							<div class="col-sm-6 col-lg-3">
								<label for="pseudo" class="col-form-label">Pseudo:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="text" id="pseudo" class="form-control">
							</div>
						<!-- Nom -->
							<div class="col-sm-6 col-lg-3">
								<label for="inputPassword6" class="col-form-label">Nom:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="password" id="inputPassword6" class="form-control">
							</div>
						</div><br>
						<div class="row g-3">
						<!-- Prenom -->
							<div class="col-sm-6 col-lg-3">
								<label for="prenom" class="col-form-label">Prenom:</label>
							</div>
							<div class="col-sm-6 col-lg-3" > 
								<input type="text" id="prenom" class="form-control">
							</div>
						<!-- Email -->
							<div class="col-sm-6 col-lg-3">
								<label for="email" class="col-form-label">Email:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="email" id="email" class="form-control">
							</div>
						</div><br>
						<div class="row g-3">
						<!-- Telephone -->
							<div class="col-sm-6 col-lg-3">
								<label for="telephone" class="col-form-label">Telephone:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="text" id="telephone" class="form-control">
							</div>
						<!-- Rue -->
							<div class="col-sm-6 col-lg-3">
								<label for="rue" class="col-form-label">Rue</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="text" id="rue" class="form-control">
							</div>
						</div><br>
						<div class="row g-3">
						<!-- Code Postal -->
							<div class="col-sm-6 col-lg-3">
								<label for="codePostal" class="col-form-label">Code Postal:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="text" id="codepostal" class="form-control">
							</div>
							
						<!-- Ville -->
							<div class="col-sm-6 col-lg-3">
								<label for="ville" class="col-form-label">Ville:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="text" id="ville" class="form-control">
							</div>
						</div><br>
						<div class="row g-3">	
						<!-- Mot de passe -->
							<div class="col-sm-6 col-lg-3">
								<label for="Password" class="col-form-label">Mot de Passe:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="password" id="Password" class="form-control">
							</div>
						<!-- Pseudo -->
							<div class="col-sm-6 col-lg-3">
								<label for="inputConfirmedPassword" class="col-form-label">Confirmation:</label>
							</div>
							<div class="col-sm-6 col-lg-3">
								<input type="password" id="inputConfirmedPassword"
									class="form-control">
							</div>
						</div><br>
						
						<div class="row">
							<div class="col-sm-6">
								<a href="acceuil">
									<button type="button" class="btn btn-light btn-lg">Creer</button>
								</a>
							</div>
							<div class="col-sm-6">
								<a href="index.html"><button type="button" class="btn btn-light btn-lg">Annuler</button></a>
							</div>
						</div>
					</form>
				</div>
			</div>
		</section>



		<footer></footer>

	</div>






</body>
</html>