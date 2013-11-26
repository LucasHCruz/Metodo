<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="bs-example">
	<table class="table">
		<thead>
			<tr>
				<th>BICICLETAS</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Modelo</th>
				<th>Preço</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bicicletas}" var="bicicleta">
				<tr class="sucess">
					<td><a href="#" id="Bicicleta" onclick="unit(id,'${bicicleta.codigo}')">${bicicleta.codigo}</a></td>
					<td>${bicicleta.nome}</td>
					<td>${bicicleta.modelo}</td>
					<td>R$ ${bicicleta.preco}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>