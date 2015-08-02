<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*,java.util.*,model.Film, javax.servlet.http.HttpSession; " errorPage="" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="images/skin.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #EEF2FB;
}
-->
</style>
<body>
<form type="submit" method="post" action="/FilmManagServlet">
   影片查询<input name="input"/>
   <select name="typeSelect">
     <option name="type" value="fname">按名称查询</option>
     <option name="type" value="ftype">按类型查询</option>
     <option name="type" value="fyears">按年份查询</option>
  </select>
  <button type="submit">查询</button>
  <br/>
  </form>
  <%ArrayList<Film> list=new ArrayList<Film>();
   list= (ArrayList)session.getAttribute("film_list");
  %>
  <table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
       <td>电影id </td>
       <td>电影名称 </td>
       <td>电影类型 </td>
       <td>电影导演 </td>
       <td>电影介绍 </td>
      </tr> 
    <%  
    for(Film fm:list)
    {
    %>
      <tr>
       <td><%=fm.getFilm_id() %></td>
       <td><%=fm.getFilm_name() %></td>
       <td><%=fm.getFilm_type_id() %></td>
       <td><%=fm.getFilm_director() %></td>
       <td><%=fm.getFilm_introduction() %></td>
      </tr> 
      <%
      }
      %>
  </table> 

</body>
</html>
