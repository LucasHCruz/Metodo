<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<div class="pure-u-1-3" style="margin: 15px;">
		<a href="#" class="item" style="text-decoration: none; color: black" id="formulario" name="Extensao" onclick="carrega(id)">
			<div class="ui ribbon segment">
				<div class="ui orange ribbon label">
					<i class="blue large add icon"></i>Inserir
				</div>
				<p>Inserção de um novo componente no sistema.</p>
			</div>
		</a>
	</div>
	<div class="pure-u-1-3" style="margin: 15px;">
		<a href="#" class="item" style="text-decoration: none; color: black" id="lista" name="Extensao" onclick="carrega(id)">
			<div class="ui ribbon segment">
				<div class="ui orange ribbon label">
					<i class="blue large search icon"></i>Pesquisar
				</div>
				<p>Pesquisa dos componentes existentes no sistema.</p>
			</div>
		</a>
	</div>