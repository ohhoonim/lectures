<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.ohhoonim.vo.DeptVo" %>
<%
	String contextRoot = request.getContextPath();
	List<DeptVo> deptList = (List<DeptVo>)request.getAttribute("deptList");
	Map<String, String> rtnParams = (Map<String, String>)request.getAttribute("rtnParams");
		
	String empno   ="";
	String ename   ="";
	String sal     ="";
	String manager ="";
	String deptno  ="";
	String hiredate="";
	String age     ="";
	String comm    ="";
	if (rtnParams != null) {
		empno   = rtnParams.get("empno");
		ename   = rtnParams.get("ename");
		sal     = rtnParams.get("sal");
		manager = rtnParams.get("manager");
		deptno  = rtnParams.get("deptno");
		hiredate= rtnParams.get("hiredate");
		age     = rtnParams.get("age");
		comm    = rtnParams.get("comm");
		
	}
%>
<html>
	<head>
		<title>추가</title>
	</head>
	<body>
		<h1>추가</h1>
		<hr>		 
				
		<form action="<%=contextRoot%>/board/boardAdd.do" name="frm" method="post">
			*empno : <input name="empno" type="text" value="<%=empno%>"><br>
			*ename : <input name="ename" type="text" value="<%=ename%>"><br>
			sal :    <input name="sal" type="text" value="<%=sal%>"><br>
			manager : <input name="manager" type="text" value="<%=manager%>"><br>
			
			
			deptno : <select name="deptno">
						<%
							for(DeptVo dept: deptList) {
						%>
						<option value="<%=dept.getDeptno()%>"><%=dept.getDname()%></option>
						<%
							}
						%>
					 </select>
			<br>
			hiredate : <input name="hiredate" type="text" value="<%=hiredate%>"><br>
			*age :<input name="age" type="text" value="<%=age%>"><br>
			comm : <input name="comm" type="text" value="<%=comm%>"><br>
			<input type="submit" value="직원추가">
		</form>
		
	</body>
</html>