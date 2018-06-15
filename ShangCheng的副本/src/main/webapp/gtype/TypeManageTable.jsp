<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<%
	try{
		Class.forName("com.mysql.jdbc.Driver");
	}catch(Exception e){
		out.print(e);
	}
	String url = "jdbc:mysql://127.0.0.1:3306/商城后台管理系统";
	String user = "root";
	String psw = "123456";
	Connection con = DriverManager.getConnection(url,user,psw);

	String sql = "select * from gtype";
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
%>
<center>
	<table border="1" width="80%" height="90%">
				<tr>
					<td align="center"><%out.print("类别编号"); %>
					<td align="center"><%out.print("类别名称"); %>
					<td align="center"><%out.print("操作1"); %>
					<td align="center"><%out.print("操作2"); %>
				</tr>
				<%while(rs.next()){%>
				<tr>
					<td align="center"><%String typeid = rs.getString(1);out.print(rs.getString(1)); %></td>
					<td align="center"><%out.print(rs.getString(2)); %></td>
					<td align="center"><a href="update.jsp">修改</a></td>
					<td align="center"><a href="TypeDelete.jsp?typeid=<%=typeid%>">删除</a></td>
				</tr>
				<%}%>
			</table>
</center>
<%
	rs.close();
	stmt.close();
	con.close();
%>
</body>
</html>