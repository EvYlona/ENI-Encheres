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

<title>Eni Enchères -</title>
<style>

/* Small devices (tablets, mobile max 768px) */
@media only screen and (max-width: 768px) {
	.header1 {
		margin-top: 15px;
		width: 100%;
		margin-bottom: 10px;
		margin-left: 40px;
		font-size: 1.2rem;
	}
	h3 {
		font-size: 1.2rem;
		margin-left: 30px;
		margin-bottom: 5px;
	}
	.row_reverse {
		display: flex;
		flex-wrap: wrap;
		flex-direction: column-reverse;
	}
	.img_article {
		max-width: 40%;
		margin-bottom: 40px;
		margin-left: 80px;
	}
	.text2 {
		padding-right: 80px;
	}
	legend {
		float: none;
		padding: inherit;
	}
	.text4 {
		font-size: 1rem;
	}
	fieldset {
		border: 1px solid black;
		margin-bottom: 10px;
	}
	legend {
		font-size: .9rem;
		margin-left: 10px;
	}
	.text3, .text5 {
		margin-left: 10px;
	}
	.btn-lg {
		visibility: hidden;
	}
	.btn-lg:after {
		content: 'Back';
		visibility: visible;
		display: block;
		position: absolute;
		border: 1px solid black;
		height: 30px;
		background-color: #e7e7e7;
		width:30%;
		text-decoration: none;
	}
}
/* Medium devices (desktops, 992px and up) */
@media ( min-width : 992px) {
	.header1 {
		font-size: 2rem;
		margin-top: 20px;
		margin-left: 120px;
	}
	h3 {
		text-align: center;
		margin-bottom: 60px;
	}
	article {
		font-size: 1.5rem;
	}
	.img_article {
		float: left;
		width: 80%;
	}
	#description {
		width: 30%;
		vertical-align: top;
		font-size: .8rem;
	}
	.row_reverse {
		margin-bottom: 50px;
	}
	.text2 {
		padding-left: 200px;
	}
	.text3 {
		margin-left: 150px;
	}
	.text4 {
		font-size: 1.3rem;
	}
	fieldset {
		margin-bottom: 30px;
	}
	btn-lg {
		width: 30%;
		border: 2px solid black;
	}
	/* Large devices (large desktops, 1200px and up) */
	@media ( min-width : 1200px) {
	}
}
</style>
</head>
<body class="container-fluid">
	<section>
		<header class="row">
			<div class="col-sm-12 col-lg-12">
				<h2 class="header1">Eni-Encheres</h2>
			</div>
		</header>
	</section>
	<section>
		<article>
			<div class="row">
				<h3>Vous avez remporté l'enchère</h3>
			</div>
			<div class="row_reverse">
				<div class="col-sm-12 col-lg-4">
					<img class="img_article" src="Ressources/image/test1.jpg" />
				</div>
				<div class="col-sm-12 col-lg-8">
					<p class="text4">PC Gamer pour travailler</p>
				</div>
				<div class="d-none d-md-block col-lg-8">
					<label for="story">Description:</label>
					<textarea id="description" name="description" rows="6" cols="3">	sql.Descriptio
					
				</textarea>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12 col-lg-8">
					<p class="text1" style="float: left;">Meilleur offre:</p>
					<p class="text2">(get.offreValue)</p>
				</div>
				<div class="col-sm-12 col-lg-8">
					<p class="text1" style="float: left;">Mise à prix:</p>
					<p class="text2" >(get.mapValue)</p>
				</div>
				<div class="col-sm-12 col-lg-8">
					<fieldset>
						<legend class="d-sm-none w-auto">Retrait</legend>
						<p class="d-none d-md-block text1" style="float: left;">Retrait:</p>
						<p class="text3">(get.adresse)</p>
						<p class="text3">(get.code Postal) (get.ville)</p>
						<p class="text5" style="float: left;">Vendeur:</p>
						<p class="text3">(get.vendeur)</p>
						<p class="text5" style="float: left;">Tel:</p>
						<p class="text3">(get.num)</p>
					</fieldset>
				</div>

				<div class="col-sm-12 col-lg-8">
					<a href="PageListeEncheres">
						<button type="button" class="btn-lg">Retrait effectué</button>
					</a>
				</div>
			</div>
		</article>
	</section>
</body>
</html>