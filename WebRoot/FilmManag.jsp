<!--涂伟-->
<%@ page language="java" import="java.util.*,model.Film" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FilmManag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%ArrayList<Film> alf=new ArrayList<Film>();
    alf=(ArrayList)request.getAttribute("film_list");
    
    Film film=new Film();
    %>
    <table>
    <tr>
       <td>电影id </td>
       <td>电影名称 </td>
       <td>电影类型 </td>
       <td>电影导演 </td>
       <td>电影介绍 </td>
      </tr> 
    <% 
    for(Film fm:alf)
    {%>
      <tr>
       <td><%=fm.getFilm_id()   %></td>
       <td><%=fm.getFilm_name() %></td>
       <td><%=fm.getFilm_type_id() %></td>
       <td><%=fm.getFilm_director() %></td>
       <td><%=fm.getFilm_introduction() %></td>
      </tr> 
      <%
      }
       %>
    </table>
  <body>  
  </body>
</html>
