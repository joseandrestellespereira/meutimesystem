<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Loading Lists - Devmedia</title>
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('#div1').load('list', {acao: 1, ultimo: 3});
		});
	</script>
	<style type="text/css">
		body {
			font-size: 20pt;
			font-family: Segoe UI, Arial;
		}
		
		div.conteudo {
			float: left;
			margin-left: 5px;
		}
		
		div.option {
			border: 1px solid gray;
			padding: 5px;
			margin: 2px;
			width: 300px;
		}
	</style>
</head>
<body>
	<div id="div1" class="conteudo">
	
	</div>
	<div id="div2" class="conteudo">
	
	</div>
	<div id="div3" class="conteudo">
	
	</div>
</body>
</html>