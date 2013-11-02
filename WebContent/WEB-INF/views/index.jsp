<html lang="pt-br">
	<head>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="Site da método">
	    <meta name="author" content="WEBTEKNOMARCA">
	    <link rel="shortcut icon" href="images/logo_metodo.png">
	
	    <title>Metal&uacute;rgica M&eacute;todo</title>
	    <script src="js/jquery.js"></script>
   		<script src="js/bootstrap.min.js"></script>
	    <link href="css/bootstrap.css" rel="stylesheet">
	    <link href="css/jumbotron.css" rel="stylesheet">
		<style type="text/css"></style>
	</head>

	<body>
		<c:import url="navbar-top.jsp" />

		<div class="container">
			<div id="myCarousel" class="carousel slide">
				<div class="carousel-inner">
					<div class="item active">
						<img src="bike.png" alt="Primeiro slide" style="height: 400px; width: 100%; display: ;">
							<div class="container">
								<div class="carousel-caption">
									<h1>Exemplo1</h1>
									<p>Texto1</p>
									<p><a class="btn btn-large btn-primary" href="#">Botao1</a></p>
								</div>
							</div>
						</div>
						<div class="item">
							<img src="bike.png" alt="Segundo slide" style="height: 400px; width: 100%; display: block;">
							<div class="container">
								<div class="carousel-caption">
									<h1>Exemplo2</h1>
									<p>Texto2</p>
									<p><a class="btn btn-large btn-primary" href="#">Botao2</a></p>
								</div>
							</div>
						</div>
						<div class="item">
							<img src="bike.png" alt="Terceiro slide" style="height: 400px; width: 100%; display: block;">
							<div class="container">
								<div class="carousel-caption">
									<h1>Exemplo3</h1>
									<p>Texto3</p>
									<p><a class="btn btn-large btn-primary" href="#">Botao3</a></p>
								</div>
							</div>
						</div>
					</div>
					<a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
					<a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>
	
			<div class="navbar navbar-inverse navbar-fixed">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Bicicletas <b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">Esportivo</a></li>
									<li><a href="#">Infantil</a></li>
									<li><a href="#">Lazer</a></li>
									<li class="divider"></li>
								</ul>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Patinetes <b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">Esportivo</a></li>
									<li><a href="#">Infantil</a></li>
									<li><a href="#">Lazer</a></li>
									<li class="divider"></li>
								</ul>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Promo&ccedil;&otilde;es <b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">Bicicletas</a></li>
									<li><a href="#">Patinetes</a></li>
									<li><a href="#">Todos os produtos</a></li>
									<li class="divider"></li>
								</ul>
							</li>
						</ul>
						<form class="navbar-form navbar-right">
							<div class="form-group">
								<input type="busca" placeholder="Busca" class="form-control">
							</div>
							<button type="submit" class="btn btn-info">Buscar</button>
						</form>
					</div>
				</div>
			</div>	

		<div class="container">
		  <div class="row">
			  <div class="col-sm-5 col-md-3">
				<div class="thumbnail">
				  <img src="bike.png" alt="...">
				  <div class="caption">
					<h3>GTI v1</h3>
					<p>Descricao da GTI v1</p>
					<p><a href="#" class="btn btn-primary">Mais</a> <a href="#" class="btn btn-default">Carrinho</a></p>
				  </div>
				</div>
			  </div>
			<div class="col-sm-5 col-md-3">
				<div class="thumbnail">
				  <img src="bike.png" alt="...">
				  <div class="caption">
					<h3>GTI v2</h3>
					<p>Descricao da GTI v2</p>
					<p><a href="#" class="btn btn-primary">Mais</a> <a href="#" class="btn btn-default">Carrinho</a></p>
				  </div>
				</div>
			  </div>
				<div class="col-sm-5 col-md-3">
					<div class="thumbnail">
						<img src="bike.png" alt="...">
						<div class="caption">
							<h3>GTI v3</h3>
							<p>Descricao da GTI v3</p>
							<p><a href="#" class="btn btn-primary">Mais</a> <a href="#" class="btn btn-default">Carrinho</a></p>
						</div>
					</div>
				</div>
				<div class="col-sm-5 col-md-3">
					<div class="thumbnail">
						<img src="bike.png" alt="...">
						<div class="caption">
							<h3>GTI v4</h3>
							<p>Descricao da GTI v4</p>
							<p><a href="#" class="btn btn-primary">Mais</a> <a href="#" class="btn btn-default">Carrinho</a></p>
						</div>
					</div>
				</div>
			</div>

			<hr>

			<c:import url="rodape" />
		</div>
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
  

</body></html>