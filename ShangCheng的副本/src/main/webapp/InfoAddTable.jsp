<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品类别信息添加</title>
</head>
<body>
<br><br><br><br>
	<center>
		<form action="InfoAddDeal.jsp">
			<table border="1">
				<tr>
					<td>编号</td>
					<td>商品名称</td>
					<td>商品类别id</td>
					<td>商品价格</td>
					<td>商品库存</td>
					<td>操作</td>
				</tr>
				<tr>
					<td><input type="text" name="id"></td>
					<td><input type="text" name="name"></td>
					<td><input type="text" name="typeid"></td>
					<td><input type="text" name="price"></td>
					<td><input type="text" name="store"></td>
					<td><input type="submit" value="添加" name="submit"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>