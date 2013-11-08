<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/bootstrap.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/bootstrap-theme.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/pure.css" />" />
<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/formularios.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metodo</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	<div style="margin-top: 100px">
		<div class="col-xs-3 col-sm-2 sidebar-offcanvas" id="sidebar"
			role="navigation">
			<div class="list-group">
				<a class="list-group-item active" name="botaoPainel" id="Bicicleta" onclick="carregaFormulario(id,this)" >Bicicletas</a> 
				<a class="list-group-item" name="botaoPainel" id="Patinete" onclick="carregaFormulario(id)" >Patinetes</a> 
				<a class="list-group-item" name="botaoPainel" id="funcionario" onclick="carregaFormulario(id)" >Funcionarios</a>
			</div>
		</div>
	</div>
	<div class="container" id="carregar"></div>

	<c:import url="rodape.jsp"></c:import>
</body>


</html>