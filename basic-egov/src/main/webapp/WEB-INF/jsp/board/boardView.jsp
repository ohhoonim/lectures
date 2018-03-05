<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.ohhoonim.vo.EmpVo"%>
<%
	String contextRoot = request.getContextPath();
	EmpVo empvo = (EmpVo)request.getAttribute("empvo");
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
		<hr>
		empno : <%=empvo.getEmpno() %><br>
		Ename : <%=empvo.getEname() %><br>
		Sal : <%=empvo.getSal() %><br>
		Manager : <%=empvo.getManager() %><br>
		Deptno : <%=empvo.getDeptno() %><br>
		Hiredate : <%=empvo.getHiredate() %><br>
		Age : <%=empvo.getAge() %><br>
		Comm : <%=empvo.getComm() %><br>
		
		
	</body>
</html>