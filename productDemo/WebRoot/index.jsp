<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title></title>
	<style type="text/css">
table {
	margin: 10px auto;
	border-collapse: collapse;
}

a{
	font-weight: bold;
	position: relative;
	left: 77px;
}

/*a{
	text-decoration: none;
	color: black;	
}*/

/*a:hover{
color:red; transition:0.2s; 	
}*/

th {
	border: 1px solid black;
	width: 200px;
	height: 50px;
}

td {
	text-align: center;	
	border: 1px solid black;
	width: 200px;
	height: 50px;
}
</style>
</head>
<body>	
  <form action="getAll" method="post">
  <table >	
		<tr >
			<th colspan="7"><h1>产品列表</h1></th>
		</tr> 
			<a href="add.jsp">新增</a>
		<tr>			
			<th>产品名称</th>
			<th>产品描述</th>	
			<th>类别</th>
			<th>状态</th>
			<th>操作</th>
		</tr>
		    <c:forEach items="${list}" var ="p">
		     <tr>		
			 					 
			  <td>${p.productname}</td>
			  <td>${p.getDescs()}</td>	
			  <td>${p.getCatagory().getName()}</td>	
			  <td>${p.getCatagory().getExplain()}</td>						 
	<td><a href="delete?id=${p.id}">删除</a></td>	
			  </tr>     
		    </c:forEach>	
	</table>
  </form>			
   <a href="getAll?pageindex=1">首页</a>
   <a href="getAll?pageindex=${pageindex-1}">上一页</a>
   <a href="getAll?pageindex=${pageindex+1}">下一页</a>
   <a href="getAll?pageindex=${countpage}">末尾</a>
	</body>
</html>
