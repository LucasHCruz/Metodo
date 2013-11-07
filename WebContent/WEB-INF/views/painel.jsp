<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/jquery.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap-theme.css" />" />
<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metodo</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	<div style="margin-top: 100px">
		<div class="col-xs-3 col-sm-2 sidebar-offcanvas" id="sidebar"
			role="navigation">
			<div class="list-group">
				<a href="#" class="list-group-item active">Bicicletas</a> 
				<a href="#"	class="list-group-item">Patinetes</a> 
				<a href="#" class="list-group-item">Funcionarios</a>
			</div>
		</div>
	</div>
	<div class="container"><c:import url="formularios/formularioBicicleta.jsp"></c:import></div>

	<c:import url="rodape.jsp"></c:import>
</body>
</html>