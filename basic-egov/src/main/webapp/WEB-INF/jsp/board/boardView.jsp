<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String contextRoot = request.getContextPath();
%>
<html>
	<head>
		<title>상세보기</title>
	</head>
	<body>
		<h1>상세보기</h1>
		<hr>
		<a href="<%=contextRoot%>/board/boardRemove.do">삭제</a><br/>
		<a href="<%=contextRoot%>/board/boardModifyView.do">수정화면이동</a>
		
	</body>
</html>