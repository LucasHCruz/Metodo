<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<div class="pure-u-1-3" style="margin: 15px;">
		<a href="#" class="item" style="text-decoration: none; color: black" id="formulario" name="Bicicleta" onclick="carrega(id)">
			<div class="ui ribbon segment">
				<div class="ui black ribbon label">
					<i class="blue large add icon"></i>Inserir
				</div>
				<p>Inser��o de uma nova bicicleta no sistema.</p>
			</div>
		</a>
	</div>
	<div class="pure-u-1-3" style="margin: 15px;">
		<a href="#" class="item" style="text-decoration: none; color: black" id="lista" name="Bicicleta" onclick="carrega(id)">
			<div class="ui ribbon segment">
				<div class="ui black ribbon label">
					<i class="blue large search icon"></i>Pesquisar
				</div>
				<p>Pesquisa das bicicletas existentes no sistema.</p>
			</div>
		</a>
	</div>