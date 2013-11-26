function carrega(id,name)
{
	$("#carregar").load(id+$("#"+id).attr("name"));
}

function carregaCrud(id)
{
	$("#carregar").load("crud"+id);
	$("[name = 'botaoPainel']").removeClass('active');
	$('#'+id).addClass('active');
}

function unit(id,codigo)
{
	$("#carregar").load("unit"+id, {'codigo' : codigo});
}

function remove(id,tipo)
{
	$.post(id+tipo);
}

function changeAction(aForm,aValue)
{
	if(aValue=="")
		return;
	aForm.setAttribute("action",aValue);
}
