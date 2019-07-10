<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<jsp:include page="head-content.jsp" />
</head>
<body>
	<br>
	<br>
	<button class="btn btn-dark btn-lg btn-block"
		onclick="window.location.href='viltians-add.jsp'">Adicione
		Viltian</button>
	<br>
	<br>
	<table class="table table-striped table-bordered text-center">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nome</th>
				<th scope="col">Sobrenome</th>
				<th scope="col">E-mail</th>
				<th scope="col">Ação</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempViltian" items="${viltians}">
				<c:url var="updateLink" value="ViltianController">
					<c:param name="command" value="LOAD" />
					<c:param name="viltianID" value="${tempViltian.id}" />
				</c:url>
				<c:url var="deleteLink" value="ViltianController">
					<c:param name="command" value="DELETE" />
					<c:param name="viltianID" value="${tempViltian.id}" />
				</c:url>
				<tr>
					<th scope="row">${tempViltian.id}</th>
					<td>${tempViltian.nome}</td>
					<td>${tempViltian.sobrenome}</td>
					<td>${tempViltian.email}</td>
					<td><a href="${updateLink}">Atualizar</a> | <a
						data-toggle="modal" onclick="confirmarDelete('${deleteLink}')"
						href="#">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Confirmar
						exlusão</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Deseja realmente excluir esse Viltian?</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Fechar</button>
					<button type="button" class="btn btn-dark"
						onclick="deleteViltian()">Salvar</button>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="scripts.jsp" />

</body>
</html>