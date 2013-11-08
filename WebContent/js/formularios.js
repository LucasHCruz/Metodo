/**
 * 
 */

function carregaFormulario(id,objeto)
{
	$("#carregar").load("formulario"+id);
	$('').removeClass('active');
	$('#'+id).addClass('active');
}