<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = " java.util.* , model.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<body>
<% 
ArrayList<Item> searchTeacherList = (ArrayList)request.getAttribute("SEARCHTEACHERLIST");
%>
<table border="1" align="center">
<tr>
	<td>강사코드</td>
	<td>강사명</td>
	<td>강의명</td>
	<td>수강료</td>
	<td>강사자격취득일</td>
</tr>
<%
 for( Item s : searchTeacherList){
%>
	<tr>
	<td><%=s.getTeacher_code() %></td>
	<td><%=s.getTeacher_name() %></td>
	<td><%=s.getClass_name() %></td>
	<td><%=s.getClass_priceS() %></td>
	<td><%=s.getTeach_resist_date() %></td>
	</tr>
<%
 }
%>
</table>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>