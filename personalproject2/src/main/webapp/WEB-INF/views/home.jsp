<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<jsp:include page="../include/head.jsp"/>
	<title>Home</title>
</head>
<body>
<div class="container">
	<header id="hd" class="container is-fullhd">
		<jsp:include page="../include/hd.jsp"/>
	</header>
	<main class="contents">
	
	</main>
	<footer>
		<jsp:include page="../include/ft.jsp"/>
	</footer>
</div>


<h1>
	Hello world!  
</h1>

<h1>ediya - test테이블</h1>

<P>  The time on the server is ${serverTime}. </P>
<c:forEach var="dto" items="${test }">
	<p>${dto.no }</p>
	<p>${dto.description }</p>
</c:forEach>

<h1>ediya - board테이블</h1>

<c:forEach var="dto" items="${board }">
	<p>${dto.bno }</p>
	<p>${dto.title }</p>
	<p>${dto.content }</p>
	<p>${dto.author }</p>
	<p>${dto.vcnt }</p>
	<p>${dto.resdate }</p>
</c:forEach>
</body>
</html>
