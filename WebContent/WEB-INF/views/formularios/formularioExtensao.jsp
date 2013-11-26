<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<form class="pure-form pure-form-aligned" id="extform" action="criaExtensao">
	<fieldset>
		<legend>Criar Extensão</legend>
			<select id="selectExtensao" onchange="changeAction(this.form,this.value);">
				<option selected></option>
				<option value="criaAmortecedor">Amortecedor</option>
				<option value="criaBanco">Banco</option>
				<option value="criaFreio">Freio</option>
				<option value="criaMarcha">Marcha</option>
				<option value="criaPneu">Pneu</option>
				<option value="criaGuidao">Guidão</option>
			</select> <br />
			<label for="nome">Nome</label> <br/>
			<input name="nome" type="text" placeholder="Ex: Forcer"> <br/>
		<button type="submit" class="pure-button pure-button-primary" style="margin-top: 10px;">Criar</button>
	</fieldset>
</form>