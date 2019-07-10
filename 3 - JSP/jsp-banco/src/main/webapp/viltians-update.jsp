<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="head-content.jsp" />
<html>
<body>
	<br>
	<br>
	<div class="container col-md-6 border rounded p-5">
		<div class="bg-dark col-md-12 text-light rounded">
			<h3>Atualize o Viltian</h3>
		</div>
		<br>
		<form action="./viltian" method="GET">
			<input type="hidden" name="command" value="UPDATE" />
			
			<input type="hidden" name="id" value="${viltian.id}" />
			
			<div class="form-row">
				<div class="form-group col">
					<label for="formGroupName">Nome</label> <input type="text"
						class="form-control" name="nome" value="${viltian.nome}">
				</div>
				<div class="form-group col">
					<label for="formGroupLastName">Sobrenome</label> <input type="text"
						class="form-control" name="sobrenome" value="${viltian.sobrenome}">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col">
					<label for="formGroupEmail">Email</label> <input type="email"
						class="form-control" name="email" value="${viltian.email}">
				</div>
			</div>
			<br>
			<button class="btn btn-dark btn-lg" type="submit">Salvar</button>
			<br> <br> <a href="viltian">De volta a lista</a>
		</form>
	</div>
</body>
</html>