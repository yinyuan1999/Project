<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品类别管理</title>
</head>
<body>
	<center>
		<table align="center" border="1px"  width="100%" height="100%">
			<tr>
				<th colspan="10" height="100" align="center" title="00" style="font-size:50px;color:#082E54;">商城后台管理系统</th>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;"><a href="TypeManage.jsp">商品类别管理</a></td>
				<td colspan="9" rowspan="5" align="center">
					
				<center>
					<table border="1" width="80%" height="90%">
						<tr>
							<td align="center"><%out.print("类别编号"); %>
							<td align="center"><%out.print("类别名称"); %>
							<td align="center"><%out.print("操作1"); %>
							<td align="center"><%out.print("操作2"); %>
						</tr>
						
						<tr>
							<td align="center" >${gtype.typeid }</td>
							<td align="center" >${gtype.typename }</td>
							<td align="center"><a href="update.jsp">修改</a></td>
							<td align="center"><a href="TypeDelete.jsp?typeid=${gtype.typeid }">删除</a></td>
						</tr>
					</table>
				</center>
				

				
				</td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;"><a href="TypeAdd.jsp">商品类别添加</a></td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;"><a href="InfoManage.jsp">商品信息管理</a></td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;"><a href="InfoAdd.jsp">商品信息添加</a></td>
			</tr>
			<tr>
				<td colspan="1" width="120" height="80" align="center" style="font-size:18px;"><a href="AdminLogin.jsp">系统退出</a></td>
			</tr>
		</table>
	</center>
</body>
</html>