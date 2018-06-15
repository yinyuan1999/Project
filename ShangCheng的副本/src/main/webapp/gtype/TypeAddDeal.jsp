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

<%
	String thetypeid = request.getParameter("typeid");
	int typeid = Integer.valueOf(thetypeid);
	String typename = request.getParameter("typename");

	try{
		Class.forName("com.mysql.jdbc.Driver");
	}catch(Exception e){
		out.print(e);
	}
	String url = "jdbc:mysql://127.0.0.1:3306/商城后台管理系统";
	String user = "root";
	String psw = "123456";
	Connection con = DriverManager.getConnection(url,user,psw);
	PreparedStatement pstmt = null;
	
	try{
		String sql = "insert into gtype values(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, typeid);
		pstmt.setString(2, typename);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
		response.sendRedirect("TypeManageTable.jsp");
	}catch(SQLException e){
        out.println("删除用户信息失败,请返回重新添加");
      }
%>
	
</body>
</html>