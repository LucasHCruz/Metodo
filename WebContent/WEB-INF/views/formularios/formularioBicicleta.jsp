<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form role="form-horizontal">
		<div class="row" style="height:80px">
			<div class="col-xs-2">
				Nome: <input type="text" class="form-control" name="nome_bicicleta"> <br />
			</div>
			<div class="col-xs-2">
				Modelo: <input type="text" class="form-control" name="modelo_bicicleta"> <br />
			</div>
		</div><!-- finaliza row -->
		<div class="row" style="height:80px">
			<div class="col-xs-2">
				Cor: <input type="color" class="form-control" name="cor_bicicleta"> <br />
			</div>
			<div class="col-xs-2">
				Preço: <input type="text" class="form-control" name="preco_bicicleta"> <br />
			</div>
			<div class="col-xs-2">
				Tipo: <input type="text" class="form-control" name="tipo_bicicleta"> <br />
			</div>
		</div><!-- finaliza row -->
		<hr class="featurette-divider">
		<div class="row" style="height:80px">
			<div class="col-xs-2">
				Material: <input type="text" class="form-control" name="material_bicicleta"> <br />
			</div>
			<div class="col-xs-2">
				Peso: <input type="text" class="form-control" name="peso_bicicleta"> <br />
			</div>
		</div><!-- finaliza row -->
		<hr class="featurette-divider">
		<div class="row">
			<div class="col-xs-1">
				Amortecedor: <input type="text" class="form-control" name="amortecedor_bicicleta"> <br />
			</div>
			<div class="col-xs-1">
				Guidao: <input type="text" class="form-control" name="guidao_bicicleta"> <br />
			</div>
			<div class="col-xs-1">
				Pneu: <input type="text" class="form-control" name="pneu_bicicleta"> <br />
			</div>
			<div class="col-xs-1">
				Aro: <input type="text" class="form-control" name="aro_bicicleta"> <br />
			</div>
			<div class="col-xs-1">
				Freio: <input type="text" class="form-control" class="form-control" name="freio_bicicleta"> <br />
			</div>
			<div class="col-xs-1">
				Banco: <input type="text" class="form-control" name="banco_bicicleta"> <br />
			</div>
			<div class="col-xs-1">
				Marcha: <input type="text" class="form-control" name="marcha_bicicleta"> <br />
			</div>
		</div><!-- finaliza row -->
		<hr class="featurette-divider">			
		<div class="row">
			<div class="col-xs-5">
				Descrição: <textarea class="form-control" name="descricao_bicicleta" rows="4"></textarea> <br />
			</div>
		</div><!-- finaliza row -->
		<hr class="featurette-divider">
		 <button type="submit" class="btn btn-primary">Criar</button>
	</form>
</body>
</html>