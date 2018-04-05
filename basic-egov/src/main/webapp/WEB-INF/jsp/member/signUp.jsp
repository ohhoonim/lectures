<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>

<!doctype html>    
<html>
<head>
	<meta charset="utf-8">
	<title>회원가입</title>
	<link rel="stylesheet" href="./css/w3.css">
	
</head>
<body>
<h1>회원가입</h1>
<hr>
	<a href="<%=contextRoot %>/memberInfo.do?memberId=mem03" >회원정보보기</a>
<hr>
<form name="frm" action="<%=contextRoot %>/signUpProcess.do" method="post">
	
	memberId<input type="text" name="memberId" id="memberId" value=""/>
	<br>memberTp<input type="text" name="memberTp" id="memberTp" value=""/>
	<br>pwd<input type="text" name="pwd" id="pwd" value=""/>
	<br>contact<input type="text" name="contact" id="contact" value=""/>
	<br>remainPnt<input type="text" name="remainPnt" id="remainPnt" value=""/>
	<br>remainPrchPnt<input type="text" name="remainPrchPnt" id="remainPrchPnt" value=""/>
	<br>chainIdx<input type="text" name="chainIdx" id="chainIdx" value=""/>	
	<br>	
	<input type="submit" value="회원가입">
	
</form>
</body>
</html>





