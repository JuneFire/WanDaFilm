<!-- czk -->
<%@ page language="java" import="java.util.*,model.FilmType,dao.FilmDao,model.Film" pageEncoding="utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FilmControl.jsp' starting page</title>
    
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
    <h1>jinrule showFilms</h1>
    <%
    	Film f = (Film)request.getAttribute("film");
    	List<FilmType> ftList  = (List<FilmType>)request.getAttribute("ftList");
     %>
    	<form action="Admin/FilmServlet?operType=save" method="post">
    	电影编号：<input type="text" name="film_id" readonly="true" value="<%=f.getFilm_id() %>">
    	电影类型:<select name="type_id">
    		<%
    			for(FilmType ft:ftList){
    		 %>
    		 <option value="<%=ft.getType_id()%>" 
    		 <%if(f.getFilmType().getType_id()==ft.getType_id()){ %>
    		  selected<%}%>>
    		 <%=ft.getType_name() %>
    		 </option>
    		 <%
    		 }
    		  %>
    	</select>
    	电影标题:<input type="text" name="title" value="<%=f.getFilm_name()%>"> <!-- name -->
    	<br>
    	电影介绍:<textarea rows="10" cols="50" name="contents" ><%=f.getFilm_introduction() %></textarea>
    	 <input type="submit"  value="提交">
    	</form>
    	<h1>showFilms.jsp</h1>
	</body>
</html>
