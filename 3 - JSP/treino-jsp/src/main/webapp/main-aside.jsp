<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="p-4 mb-3 bg-light rounded">
	<h4 class="font-italic">${asideArticle.title}</h4>
	<p class="mb-0">${asideArticle.text}</p>
</div>

<div class="p-4">
	<h4 class="font-italic">Archives</h4>
	<ol class="list-unstyled mb-0">
		<c:forEach var="asideArchive" items="${asideArchive}">
			<li><a href="#">${asideArchive.text}</a></li>
		</c:forEach>
	</ol>
</div>

<div class="p-4">
	<h4 class="font-italic">Elsewhere</h4>
	<ol class="list-unstyled">
		<li><a href="#">GitHub</a></li>
		<li><a href="#">Twitter</a></li>
		<li><a href="#">Facebook</a></li>
	</ol>
</div>