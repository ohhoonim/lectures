<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.ohhoonim.vo.MemberVo" %>
<%
	MemberVo vo = (MemberVo)request.getAttribute("memberVo");
%>
<!doctype html>    
<html>
<head>
	<meta charset="utf-8">
	<title>회원정보</title>
	<link rel="stylesheet" href="./css/w3.css">
	
</head>
<body>
<h1>회원정보</h1>
<hr> 
 memberId: <%=vo.getMemberId() %>
<br> memberTp: <%=vo.getMemberTp() %>
<br> pwd: <%=vo.getPwd() %>
<br> contact: <%=vo.getContact() %>
<br> remainPnt: <%=vo.getRemainPnt() %>
<br> remainPrchPnt: <%=vo.getRemainPrchPnt() %>
<br> chainIdx: <%=vo.getChainIdx() %>
</body>
</html>





