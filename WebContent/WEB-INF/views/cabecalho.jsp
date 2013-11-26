<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Metodo</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Inicio</a></li>
					<li><a href="#about">Sobre</a></li>
					<li><a href="#contact">Contato</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Mais <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Lojas</a></li>
							<li class="divider"></li>
							<li><a href="#">Atacado</a></li>
							<li><a href="#">Varejo</a></li>
						</ul></li>
				</ul>
				<form class="navbar-form navbar-right" action="login" method="post">
					<div class="form-group">
						<input type="text" name="email" placeholder="Email" class="form-control"
							required>
					</div>
					<div class="form-group">
						<input type="password" name="senha" placeholder="Password" class="form-control"
							required>
					</div>
					<button type="submit" class="btn btn-success">Login</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>