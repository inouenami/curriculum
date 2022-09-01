<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@ page import="bean.Employee"%>
<!DOCTYPE html>
<html>
<%
 // 問① getAttributeに適切な引数をセットして、EmployeeControllerから渡されたBeanを取得する。
 Employee employee = (Employee) request.getAttribute("Employee");
%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="search" method="post">
<input type="text" name="name">
<input type="submit" value="送信">
</form>

<%
 if (employee != null) {
 %>
<table border="1">
 <tr>
 <th>社員名</th>
 <td><%=employee.getName()%></td>
 </tr>
 <tr>
 <th>ID</th>
 <td><%=employee.getId()%></td>
 </tr>
 </table>
<%
 }
 %>
</body>
</html>