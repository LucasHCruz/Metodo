<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<form class="pure-form pure-form-aligned" action="criaPatinete" method="post">
	<fieldset>
		<legend>Criar Patinete</legend>
			<label for="nome">Nome</label> <br/>
			<input id="nome" name="nome" type="text" placeholder="Ex: Forcer"> <br/>
			<label for="modelo">Modelo</label> <br/>
			<input id="modelo" name="modelo" type="text" placeholder="Ex: FX421"> <br/>
			<label for="tipo">Tipo</label> <br/> 
			<input id="tipo" name="tipo" type="text" placeholder="Ex: Lazer"> <br/>
			<label for="material">Material</label> <br/> 
			<input id="material" name="material" type="text" placeholder="Ex: Fibra de carbono"> <br/>
			<label for="cor">Cor</label> <br/> 
			<input id="cor" name="cor" type="color"> <br/>
			<label for="preco">Preço</label> <br/>
			<input id="preco" name="preco" type="text" placeholder="R$"> <br/>
			<label for="peso">Peso</label> <br/>
			<input id="peso" name="peso" type="text" placeholder="Ex: 150,00"> <br/>
			
		<legend>Extensões</legend>
		<div class ="pure-g-r pure-form-stacked">
			<div class="pure-u-1-3">
				<label for="materialRoda">Material da Roda</label>
				<select id="materialRoda" name="materialRoda">
                    <c:forEach items="${materiaisRoda}" var="materialRoda">
                    	<option value="${materialRoda.codigo}">${materialRoda.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="materialPrancha">Material da Prancha</label>
				<select id="materialPrancha" name="materialPrancha">
                    <c:forEach items="${materiaisPrancha}" var="materialPrancha">
                    	<option value="${materialPrancha.codigo}">${materialPrancha.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="roda">Roda</label>
				<select id="roda" name="roda">
                    <c:forEach items="${rodas}" var="roda">
                    	<option value="${roda.codigo}">${roda.nome}</option>
                    </c:forEach>
                </select>
			</div>
		</div>
		<legend>Descrição</legend>
		<div class="pure-control-group">
			<textarea id="descricao" name="descricao" rows="3" style="width:400px;"></textarea>
		</div>
		<button type="submit" class="pure-button pure-button-primary">Criar</button>
	</fieldset>
</form>