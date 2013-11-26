<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<form class="pure-form pure-form-aligned" action="criaBicicleta">
	<fieldset>
		<legend>Criar Bicicleta</legend>
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
			<label for="aro">Aro</label> <br/>
			<input id="aro" name="aro" type="number" placeholder="Ex: 26"> <br/>
			<label for="peso">Peso</label> <br/>
			<input id="peso" name="peso" type="text" placeholder="Ex: 150,00"> <br/>
			
		<legend>Extensões</legend>
		<div class ="pure-g-r pure-form-stacked">
			<div class="pure-u-1-3">
				<label for="pneu">Pneu</label>
				<select id="pneu" name="pneu">
                    <c:forEach items="${pneus}" var="pneu">
                    	<option value="${pneu.codigo}">${pneu.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="guidao">Guidão</label>
				<select id="guidao" name="guidao">
                    <c:forEach items="${guidoes}" var="guidao">
                    	<option value="${guidao.codigo}">${guidao.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="freio">Freio</label>
				<select id="freio" name="freio">
                    <c:forEach items="${freios}" var="freio">
                    	<option value="${freio.codigo}">${freio.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="banco">Banco</label>
				<select id="banco" name="banco">
                    <c:forEach items="${bancos}" var="banco">
                    	<option value="${banco.codigo}">${banco.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="marcha">Marcha</label>
				<select id="marcha" name="marcha">
                    <c:forEach items="${marchas}" var="marcha">
                    	<option value="${marcha.codigo}">${marcha.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="amortecedor">Amortecedor</label>
				<select id="amortecedor" name="amortecedor">
                    <c:forEach items="${amortecedores}" var="amortecedor">
                    	<option value="${amortecedor.codigo}">${amortecedor.nome}</option>
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