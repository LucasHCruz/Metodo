<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class="pure-form pure-form-aligned">
		<fieldset>
			<legend>Criar Bicicleta</legend>
			<div class="pure-control-group">
				<label for="nome">Nome</label> 
				<input id="nome" type="text" placeholder="Primeiro nome">
			</div>

			<div class="pure-control-group">
				<label for="password">Password</label> 
				<input id="password" type="password" placeholder="Password">
			</div>

			<div class="pure-control-group">
				<label for="email">Email Address</label> 
				<input id="email" type="email" placeholder="Email Address">
			</div>

			<div class="pure-control-group">
				<label for="foo">Patinete Label</label> 
				<input id="foo" type="text" placeholder="Enter something here...">
			</div>
			<div class="pure-control-group">
				<label for="descricao">Descrição</label>
				<textarea id="descricao" rows="3" style="width:40%;"></textarea>
			</div>

			<div class="pure-controls">
				<label for="cb" class="pure-checkbox"> <input id="cb"
					type="checkbox"> I've read the terms and conditions
				</label>
				<button type="submit" class="pure-button pure-button-primary">Submit</button>
			</div>
		</fieldset>
	</form>
</body>
</html>