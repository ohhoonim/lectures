<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String contextRoot = request.getContextPath();
%>
<html>
	<head>
		<title>목록</title>
	</head>
	<body>
		<h1>목록</h1>
		<hr>
		<a href="<%=contextRoot%>/board/boardDetail.do">상세보기 화면 이동</a><br/> 
		<a href="<%=contextRoot%>/board/boardAddView.do">추가 화면 이동</a>
		
		
	</body>
</html>