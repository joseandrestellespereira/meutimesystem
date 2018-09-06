<%@page import="br.edu.devmedia.objetos.Entidade"%>
<%@page import="java.util.List"%>
<%
	List<Entidade> lista = (List<Entidade>) request.getAttribute("lista");
	int acao = Integer.parseInt(request.getParameter("acao"));
	int ultimo = Integer.parseInt(request.getParameter("ultimo"));
	int proximo = acao + 1;
	for (Entidade entidade : lista) {
%>
<span onclick="$('#div<%=proximo%>').load('list', {acao: <%=proximo%>, id: <%=entidade.getId()%>, ultimo: ${param.ultimo}}, function() {
	<%= acao == 1 ? "$('#div" + ultimo + "').empty()" : "" %>
	$('#div<%=acao%>').hide();
	$('#div<%=acao%>').show('fast');
})">
	<div class="option">
		<%= entidade.getDescricao() %>
	</div>
</span>
<%
	}
%>