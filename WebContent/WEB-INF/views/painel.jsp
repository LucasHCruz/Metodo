<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/bootstrap.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/bootstrap-theme.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/pure.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/semantic.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/font-awesome.css" />" />
<link rel="stylesheet" type="text/css"	href="<c:url value="/css/docs.css" />" />
<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/personal.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/semantic.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metodo</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	<div style="margin-top: 100px">
		<div class="col-xs-3 col-sm-2 sidebar-offcanvas" id="sidebar" role="navigation">
			<div class="list-group">
				<a class="list-group-item dropdown active" name="botaoPainel" id="Bicicleta" onclick="carregaCrud(id)" >Bicicletas</a> 
				<a class="list-group-item" name="botaoPainel" id="Patinete" onclick="carregaCrud(id)" >Patinetes</a>
				<a class="list-group-item" name="botaoPainel" id="Extensao" onclick="carregaCrud(id)" >Extensões</a>  
				<a class="list-group-item" name="botaoPainel" id="Funcionario" onclick="carregaCrud(id)" >Funcionários</a>
			</div>
		</div>
	</div>
	<div class="container" id="carregar"></div>

	<c:import url="rodape.jsp"></c:import>
</body>


</html>