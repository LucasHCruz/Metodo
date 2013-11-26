<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="bs-example">
	<table class="table">
		<thead>
			<tr>
				<th>EXTENSÕES</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${extensoes}" var="extensao">
				<tr class="sucess">
					<td><a href="#" id="Extensao" onclick="unit(id,'${extensao.codigo}')">${extensao.codigo}</a></td>
					<td>${extensao.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>