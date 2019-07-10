<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="nav-scroller py-1 mb-2">
	<nav class="nav d-flex justify-content-between">
		<c:forEach var="navbar" items="${navbar}">
			<a class="p-2 text-muted" href="#">${navbar.text}</a>
		</c:forEach>

	</nav>
</div>