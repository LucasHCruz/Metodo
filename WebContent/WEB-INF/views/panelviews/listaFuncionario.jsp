<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="bs-example">
	<table class="table">
		<thead>
			<tr>
				<th>FUNCIONÁRIOS</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<th>Registro</th>
				<th>E-mail</th>
				<th>Nome</th>
				<th>Sobrenome</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${funcionarios}" var="funcionario">
				<tr class="sucess">
					<td><a href="#" id="Funcionario" onclick="unit(id,'${funcionario.registro}')">${funcionario.registro}</a></td>
					<td>${funcionario.email}</td>
					<td>${funcionario.nome}</td>
					<td>R$ ${funcionario.sobrenome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>