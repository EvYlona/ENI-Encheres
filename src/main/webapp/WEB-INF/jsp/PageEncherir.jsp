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

<title>Eni Enchères - Enrechir</title>
<style>

/* Mobile First */

/* Small devices (tablets, 768px and up) */
@media only screen and (max-width: 768px) {
	.header1 {
		margin-top: 10px;
		width: 100%;
		margin-left: 30px;
		margin-bottom: -2px;
		font-size: 1rem;
	}
	article {
		width: 100%;
		margin-top: 20px;
		font-size: .7rem;
	}
	#Description {
		height: 60px;
	}
	table {
		margin-top: 50px;
		width: 100%;
	}
	.row_reverse {
		display: flex;
		flex-wrap: wrap;
		flex-direction: column-reverse;
	}
	input, .form-group {
		float: right;
		width: 60%;
	}
	.img_upload {
		max-width: 30%;
		margin-left: 100px;
		margin-top: 15px;
		margin-bottom: 30px;
	}
	legend {
		font-size: .9rem;
	}
	fieldset {
		border: 0px solid #000;
	}
	.btn-lg {
		font-size: .8rem;
		margin-top: -10px;
	}
	.form_group {
		float: right;
		
	}
	
}
/* Medium devices (desktops, 992px and up) */
@media ( min-width : 992px) {
	form {
		margin-left: 300px;
	}
	
	article {
		margin-left:200px;
		margin-top:100px;
	}
	fieldset {
		border: 3px solid #000;
	}
	/* Large devices (large desktops, 1200px and up) */
	@media ( min-width : 1200px) {
		.form-group {
			float:right;
			width:60%;
			font-size:.8rem;
		}
		
		table {
			margin-top:80px;
			margin-bottom:100px;
			width:auto;
		}
		
		#Description {
			height:60px;
		
		}
		.row_reverse {
			width:auto;
		}
		
		.form_group2 {
			padding:auto;
			float:right;
			
		}
		
		.form_group {
			float:right;
		}
		
		#prix {
			width:40%;
		}
	}
}
\
</style>
</head>
<body class="container">
	<section>
		<header class="row">
			<div class="col-sm-12 col-lg-4">
				<h2 class="header1">Eni-Encheres</h2>
			</div>
			<div class="col-sm-12 col-lg-4 offset-1">
				<h2 class="header1">Nouvelle vente - Enrechir</h2>
			</div>
		</header>
	</section>
	<section>
		<article>

			<div class="row_reverse">
				<div class="col-sm-12 col-lg-3">
					<img alt="test" src="Ressources/image/test1.jpg" class="img_upload"
						style="float: left;">
				</div>
				<form>
					<div class="col-sm-12 col-lg-6">
						<!-- Article -->
						<div class="col-sm-12 col-lg-12">
							<label for="article" class="col-form-label">Article:</label> <input
								type="text" id="article" class="form-group">
						</div>
						<!-- Categorie -->
						<div class="col-sm-12 col-lg-12">
							<label for="categorie" class="col-form-label">Catégorie:</label>
							<select class="form-group choice" name="choice">
								<option selected="selected">Choisissez une catégorie</option>
								<option value="first">Informatique</option>
								<option value="second">Ameublement</option>
								<option value="third">Vetement</option>
								<option value="third">Sport et loisirs</option>
							</select>
						</div>
						<!-- Description -->
						<div class="col-sm-12 col-lg-12">
							<label for="Description" class="col-form-label">Description:</label>
							<input type="text" id="Description" class="form-group">
						</div>

						<!-- Upload iplame -->
						<div class="col-sm-12 col-lg-12">
							<table>
								<tr>
									<td>Photo de l'article</td>
									<td><input name="userfile" type="file" class="form-group"></td>
								</tr>
							</table>
						</div>
					</div>
				</form>
			</div>
			<div class="row">
				<form>
					<div class="col-sm-12 col-lg-4 ">
						<label for="prix" class="col-form-label">Prix Initial:</label> <input
							type="number" id="prix" class="form_group2">
					</div>
					<div class="col-sm-12 col-lg-4">
						<label for="debut_enchere" class="col-form-label">Début de
							l'enchère:</label> <input type="date" id="prix" class="form_group2">
					</div>
					<div class="col-sm-12 col-lg-4">
						<label for="fin_encheres" class="col-form-label">Fin de
							l'enchère:</label> <input type="date" id="prix" class="form_group2">
					</div>
				</form>
			</div>
			<div class="row">
				<form>
					<fieldset class="col-lg-5"
						style=" margin-top: 20px; margin-bottom: 20px;">
						<legend>Retrait</legend>
						<div class="col-sm-12 col-lg-11">
							<label for="adresse" class="col-form-label">Adresse</label> <input
								type="text" id="adresse" class="form_group">
						</div>
						<div class="col-sm-12 col-lg-11">
							<label for="cp" class="col-form-label">Code Postal</label> <input
								type="text" id="cp" class="form_group">
						</div>
						<div class="col-sm-12 col-lg-11">
							<label for="ville" class="col-form-label">Ville </label> <input
								type="text" id="ville" class="form_group">
						</div>
					</fieldset>
				</form>
			</div>
			<div class="row">
				<form>
					<div class="row bouton">
						<div class="col-sm-12">
							<a href="PageListeEncheres">
								<button type="button" class="btn-lg">Enregistrer</button>
							</a> <a href="PageListeEncheres">
								<button type="button" class="btn-lg">Annuler</button>
							</a> <a href="PageListeEncheres">
								<button type="button" class="btn-lg">Annuler la vente</button>
							</a>
						</div>
					</div>
				</form>
			</div>


		</article>
	</section>
</body>
</html>
