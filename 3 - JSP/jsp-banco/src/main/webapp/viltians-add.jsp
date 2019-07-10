<jsp:include page="head-content.jsp" />
<html>
<body>
	<br>
	<br>
	<div class="container col-md-6 border rounded p-5">
		<div class="bg-dark col-md-12 text-light rounded">
			<h3>Adicione um Viltian</h3>
		</div>
		<br>
		<form action="./viltian" method="GET">
			<input type="hidden" name="command" value="ADD" />
			<div class="form-row">
				<div class="form-group col">
					<label for="formGroupName">Nome</label> <input type="text"
						class="form-control" name="nome" placeholder="John">
				</div>
				<div class="form-group col">
					<label for="formGroupLastName">Sobrenome</label> <input type="text"
						class="form-control" name="sobrenome" placeholder="Doe">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col">
					<label for="formGroupEmail">Email</label> <input type="email"
						class="form-control" name="email"
						placeholder="john.doe@vilt-group.com">
				</div>
			</div>
			<br>
			<button class="btn btn-dark btn-lg" type="submit">Salvar</button>
			<br> <br> <a href="viltian">De volta a lista</a>
		</form>
	</div>
</body>
</html>