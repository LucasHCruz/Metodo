<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap.css" />" />  
<link rel="stylesheet" type="text/css" href="<c:url value="/css/bootstrap-theme.css" />" />  
<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script> 
<script type="text/javascript" src="<c:url value="/js/bootstrap.js" />"></script> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metodo</title>
</head>
<body>
	<c:import url="cabecalho.jsp"></c:import>
	
	<div class="container marketing" style="margin-top: 100px">

      <!-- Tr�s propagandas -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-rounded" data-src="holder.js/140x140" alt="140x140" style="width: 140px; height: 140px;" src="<c:url value="/img/propaganda.png" />" >
          <h2>Propaganda 1</h2>
          <p style="text-align:justify;">As experi�ncias acumuladas demonstram que a crescente influ�ncia da m�dia auxilia a prepara��o e a composi��o da gest�o inovadora da qual fazemos parte.</p>
          <p><a class="btn btn-default" href="#" role="button">Mais detalhes �</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-rounded" data-src="holder.js/140x140" alt="140x140" style="width: 140px; height: 140px;" src="<c:url value="/img/propaganda2.png" />" >
          <h2>Propaganda 2</h2>
          <p style="text-align:justify;">Desta maneira, o novo modelo estrutural aqui preconizado possibilita uma melhor vis�o global do investimento em reciclagem t�cnica.</p>
          <p><a class="btn btn-default" href="#" role="button">Mais detalhes �</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-rounded" data-src="holder.js/140x140" alt="140x140" style="width: 140px; height: 140px;" src="<c:url value="/img/propaganda3.png" />" >
          <h2>Propaganda 3</h2>
          <p style="text-align:justify;">Por outro lado, o surgimento do com�rcio virtual causa impacto indireto na reavalia��o das condi��es financeiras e administrativas exigidas.</p>
          <p><a class="btn btn-default" href="#" role="button">Mais detalhes �</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


      <!-- Novidades e textos -->

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">Patinete Girl. <span class="text-muted">Para enlouquecer as meninas.</span></h2>
          <p class="lead" style="text-align:justify;">N�o acredite em algo simplesmente porque ouviu. N�o acredite em algo simplesmente porque todos falam a respeito. N�o acredite em algo simplesmente porque esta escrito em seus livros religiosos. N�o acredite em algo s� porque seus professores e mestres dizem que � verdade. N�o acredite em tradi��es s� porque foram passadas de gera��o em gera��o. Mas depois de muita an�lise e observa��o, se voc� v� que algo concorda com a raz�o, e que conduz ao bem e beneficio de todos, aceite-o e viva-o.</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="<c:url value="/img/propaganda4.png" />" >
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-5">
          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="<c:url value="/img/propaganda5.png" />" >
        </div>
        <div class="col-md-7">
          <h2 class="featurette-heading">Radicalmente bom. <span class="text-muted">Sinta a adrenalina em voc�.</span></h2>
          <p class="lead" style="text-align:justify;">Fa�a o que for necess�rio para ser feliz. Mas n�o se esque�a que a felicidade � um sentimento simples, voc� pode encontr�-la e deix�-la ir embora por n�o perceber sua simplicidade.</p>
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">Para voc� que quer correr. <span class="text-muted">Checkmate.</span></h2>
          <p class="lead" style="text-align:justify;">Fa�a o que for necess�rio para ser feliz. Mas n�o se esque�a que a felicidade � um sentimento simples, voc� pode encontr�-la e deix�-la ir embora por n�o perceber sua simplicidade.</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" src="<c:url value="/img/propaganda6.png" />" >
        </div>
      </div>

      <hr class="featurette-divider">

      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Voltar para o topo</a></p>
        <p>� 2013 M�todo, Inc. � <a href="#">Privacidade</a> � <a href="#">Termos</a></p>
      </footer>

    </div>
	
	
	
	<c:import url="rodape.jsp"></c:import>

</body>
</html>