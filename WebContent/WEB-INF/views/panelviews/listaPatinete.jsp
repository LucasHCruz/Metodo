<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="bs-example">
	<table class="table">
		<thead>
			<tr>
				<th>PATINETES</th>
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
			<c:forEach items="${patinetes}" var="patinete">
				<tr class="sucess">
					<td><a href="#" id="Patinete" onclick="unit(id,'${patinete.codigo}')">${patinete.codigo}</a></td>
					<td>${patinete.nome}</td>
					<td>${patinete.modelo}</td>
					<td>R$ ${patinete.preco}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>