<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>

<title>Blog Template · Bootstrap</title>

<jsp:include page="head-content.jsp" />

</head>

<body>

	<div class="container">

		<jsp:include page="header.jsp" />

		<jsp:include page="navbar.jsp" />

		<jsp:include page="card-main.jsp" />

		<jsp:include page="card-sub.jsp" />

	</div>

	<main role="main" class="container"> <jsp:include
		page="main-content.jsp" /> </main>

	<footer class="blog-footer">

		<jsp:include page="footer-content.jsp" />

	</footer>

</body>
</html>