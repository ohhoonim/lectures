<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.ohhoonim.vo.EmpVo" %>
<%@ page import="com.ohhoonim.common.util.Utils" %>
<%
	String contextRoot = request.getContextPath();
	List<EmpVo> list = (List<EmpVo>)request.getAttribute("list");
%>
<html>
	<head>
		<title>목록</title>
	</head>
	<body>
		<h1>목록</h1>
		<hr>
		
		<a href="<%=contextRoot%>/board/boardAddView.do">추가 화면 이동</a>
		<hr>
		<table>
			<tr>
				<th>EMPNO</th>
				<th>ENAME</th>
				<th>SAL</th>
				<th>MANAGER</th>
				<th>DEPTNO</th>
				<th>HIREDATE</th>
				<th>AGE</th>
				<th>COMM</th>
			</tr>
			<%
			for(int i = 0; i < list.size(); i++) {
				EmpVo vo = list.get(i);
			%>
			<tr>
				<td><a href="<%=contextRoot%>/board/boardDetail.do?empno=<%=vo.getEmpno() %>"><%=vo.getEmpno() %></a></td>
				<td><%=Utils.toEmptyBlank(vo.getEname()) %></td>
				<td><%=Utils.toEmptyBlank(vo.getSal()) %></td>
				<td><%=Utils.toEmptyBlank(vo.getManager()) %></td>
				<td><%=Utils.toEmptyBlank(vo.getDeptno()) %></td>
				<td><%=Utils.dateFommatter(vo.getHiredate()) %></td>
				<td><%=Utils.toEmptyBlank(vo.getAge()) %></td>
				<td><%=Utils.customNum(vo.getComm(), "#,##0") %></td>
			</tr>
			<%
			}
			%>
		</table>		
		
	</body>
</html>












