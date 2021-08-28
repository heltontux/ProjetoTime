<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Meu Projeto</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<c:set var="titulo" value="Cadastramento de usuários"/>
	<c:set var="rota" value="/usuario/incluir"/>
	<c:set var="metodo" value="post"/>
	<c:set var="botao" value="Cadastrar"/>
	
	<c:if test="${not empty meuUsuario}">
		<c:set var="titulo" value="Consulta de usuário"/>
		<c:set var="rota" value="/usuarioVoltar"/>
		<c:set var="metodo" value="get"/>
		<c:set var="botao" value="Voltar"/>
	</c:if>

<div class="container">
	<h2>${titulo}</h2>
	
	 <form action="${rota}" method="${metodo}">
		  <div class="form-group">
		    <label>Nome:</label>
		    <input type="text" class="form-control" value="${meuUsuario.nome}" placeholders="Entre com o nome do usuário" name="nome">
		  </div>
		  
		  <div class="form-group">
		    <label>Email:</label>
		    <input type="text" class="form-control" value="${meuUsuario.email}" placeholders="Entre com o email do usuário" name="email">
		  </div>
		  
		  <div class="form-group">
		    <label>Data de Nascimento:</label>
		    <input type="text" class="form-control" value="${meuUsuario.dataNascimento}" placeholders="Entre com a data de nascimento" name="dataNascimento">
		  </div>
		  
		  <div class="form-group">
		    <label>Senha:</label>
		    <input type="text" class="form-control" value="${meuUsuario.senha}" placeholders="Entre com a senha" name="senha">
		  </div>
		  
		  
		  <button type="submit" class="btn btn-default">${botao}</button>
	</form> 
	
</div>

</body>
</html>
    