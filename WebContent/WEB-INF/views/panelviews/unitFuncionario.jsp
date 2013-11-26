<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class="pure-form pure-form-aligned" action="" method="post">
		<fieldset>
			<legend>Funcionário - Registro: ${funcionario.registro}</legend>
				<input type="hidden" name="registro" value="${funcionario.registro}">
				<label for="email">E-mail</label> <br/>
				<input id="email" name="email" type="email" placeholder="exemplo@metodo.com.br" value="${funcionario.email}"> <br/>
				<label for="nome">Nome</label> <br/>
				<input id="nome" name="nome" type="text" placeholder="Primeiro nome" value="${funcionario.nome}"> <br/>
				<label for="sobrenome">Sobrenome</label> <br/> 
				<input id="sobrenome" name="sobrenome" type="text" placeholder="Sobrenome" value="${funcionario.sobrenome}"> <br/>
				<label for="cargo">Cargo</label> <br/> 
				<input id="cargo" name="cargo" type="text" value="${funcionario.cargo}"> <br/>
				<label for="senha">Senha</label> <br/> 
				<input id="senha" name="senha" type="password" value="${funcionario.senha}"> <br/>
				<label for="permissao">Permissão</label> <br/> 
				<input id="permissao" name="permissao" type="number" value="${funcionario.permissao}" style="margin-bottom: 10px"> <br/>				
				<button type="submit" class="pure-button pure-button-warning" onclick="this.form.action='alteraFuncionario';">Alterar</button>
				<button type="submit" class="pure-button pure-button-error" onclick="this.form.action='removeFuncionario';">Remover</button>
		</fieldset>
	</form>
</body>
</html>