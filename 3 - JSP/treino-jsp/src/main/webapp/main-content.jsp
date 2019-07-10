<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row">

	<div class="col-md-8 blog-main">
		
		<jsp:include page="main-blogposts.jsp" />

	</div>

	<aside class="col-md-4 blog-sidebar">
		
		<jsp:include page="main-aside.jsp" />
		
	</aside>

</div>