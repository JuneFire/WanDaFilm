<!-- czk -->
<%@ page language="java" import="java.util.*,model.Film,dao.FilmDao" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ListFilms.jsp' starting page</title>
    
	 <meta http-equiv="Content-Language" content="zh-cn">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
		<table width="560px">
			<tr>
				<td>电影id</td>
				<td>电影名称</td>
				<td>电影类型</td>
			</tr>
			<%
				
				List<Film> fs =(ArrayList<Film>)request.getAttribute("list");
				if(fs!=null){
				for(Film f:fs){
			%>
			<tr>
				<td><%=f.getFilm_id() %></td>
				<td><%=f.getFilm_name() %></td>
				<td><%=f.getFilmType().getType_name()%></td>
				<td><a href="Admin/FilmServlet?operType=edit&film_id=<%= f.getFilm_id() %>">修改</a></td>
				<td><a href="FilmServlet?operType=delete&film_id=<%= f.getFilm_id() %>">删除</td>
			</tr>
			<%
				}
			}
			 %>
			
		</table>
		这是ListFilm.jsp</br>
	</body>
</html>
