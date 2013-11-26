<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<div class="pure-u-1-3" style="margin: 15px;">
		<a href="#" class="item" style="text-decoration: none; color: black" id="formulario" name="Funcionario" onclick="carrega(id)">
			<div class="ui ribbon segment">
				<div class="ui green ribbon label">
					<i class="black large add icon"></i>Inserir
				</div>
				<p>Cadastro de um novo funcionário no sistema.</p>
			</div>
		</a>
	</div>
	<div class="pure-u-1-3" style="margin: 15px;">
		<a href="#" class="item" style="text-decoration: none; color: black" id="lista" name="Funcionario" onclick="carrega(id)">
			<div class="ui ribbon segment">
				<div class="ui green ribbon label">
					<i class="black large search icon"></i>Pesquisar
				</div>
				<p>Pesquisa dos funcionários existentes no sistema.</p>
			</div>
		</a>
	</div>