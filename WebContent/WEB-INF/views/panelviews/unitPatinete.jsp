<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<form class="pure-form pure-form-aligned" action="" method="post">
	<fieldset>
		<legend>Patinete - Código: ${patinete.codigo}</legend>
		<div class="pure-u-1-3">
			<input type="hidden" name="codigo" value="${patinete.codigo}">
			<label for="nome">Nome</label> <br/>
			<input id="nome" name="nome" type="text" placeholder="Ex: Forcer" value="${patinete.nome}"> <br/>
			<label for="modelo">Modelo</label> <br/>
			<input id="modelo" name="modelo" type="text" placeholder="Ex: FX421" value="${patinete.modelo}"> <br/>
			<label for="tipo">Tipo</label> <br/> 
			<input id="tipo" name="tipo" type="text" placeholder="Ex: Lazer" value="${patinete.tipo}"> <br/>
			<label for="material">Material</label> <br/> 
			<input id="material" name="material" type="text" placeholder="Ex: Fibra de carbono" value="${patinete.material}"> <br/>
			<label for="cor">Cor</label> <br/> 
			<input id="cor" name="cor" type="color" value="${patinete.cor}"> <br/>
			<label for="preco">Preço</label> <br/>
			<input id="preco" name="preco" type="text" placeholder="R$" value="${patinete.preco}"> <br/>
			<label for="peso">Peso</label> <br/>
			<input id="peso" name="peso" type="text" placeholder="Ex: 150,00" value="${patinete.peso}"> <br/>
		</div>
		<div class="pure-u-1-3">
			<img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="<c:url value="/img/patinete${patinete.codigo}.png" />">
		</div>	
		<legend>Extensões</legend>
		<div class ="pure-g-r pure-form-stacked">
			<div class="pure-u-1-3">
				<label for="pneu">Material Roda</label>
				<select id="pneu" name="pneu">
                    <option value="${mr.codigo}" selected>${mr.nome}</option>
                    <c:forEach items="${materiaisRoda}" var="materialRoda">
                    	<option value="${materialRoda.codigo}">${materialRoda.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="guidao">Material Prancha</label>
				<select id="guidao" name="guidao">
					<option value="${mp.codigo}" selected>${mp.nome}</option>
                    <c:forEach items="${materiaisPrancha}" var="materialPrancha">
                    	<option value="${materialPrancha.codigo}">${materialPrancha.nome}</option>
                    </c:forEach>
                </select>
			</div>
			<div class="pure-u-1-3">
				<label for="freio">Roda</label>
				<select id="freio" name="freio">
					<option value="${r.codigo}" selected>${r.nome}</option>
                    <c:forEach items="${rodas}" var="freio">
                    	<option value="${roda.codigo}">${roda.nome}</option>
                    </c:forEach>
                </select>
			</div>
		</div>
		<legend>Descrição</legend>
		<div class="pure-control-group">
			<textarea id="descricao" name="descricao" rows="3" style="width:400px;">${patinete.descricao}</textarea>
		</div>
		<button type="submit" class="pure-button pure-button-warning" onclick="this.form.action='alteraPatinete';">Alterar</button>
		<button type="submit" class="pure-button pure-button-error" onclick="this.form.action='removePatinete';">Remover</button>
	</fieldset>
</form>