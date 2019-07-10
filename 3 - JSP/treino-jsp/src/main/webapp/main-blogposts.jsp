<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3 class="pb-4 mb-4 font-italic border-bottom">From the Firehouse</h3>

<div class="blog-post">
	<c:forEach var="blogspot" items="${blogspot}">
		<h2 class="blog-post-title">${blogspot.title}</h2>
		<p class="blog-post-meta">
			${blogspot.date} by <a href="#">${blogspot.author}</a>
		</p>

		<p>${blogspot.introduction}</p>
		<hr>
		${blogspot.text}
	</c:forEach>

</div>

<nav class="blog-pagination">
	<a class="btn btn-outline-primary" href="#">Older</a> <a
		class="btn btn-outline-secondary disabled" href="#" tabindex="-1"
		aria-disabled="true">Newer</a>
</nav>