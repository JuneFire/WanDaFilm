<%@ page language="java" import="java.util.*"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Welcome to WanDaFilm!</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <%
      //读取ie里面保存的cookie信息
    Cookie[] cookies =request.getCookies();
    String userName = "";
    String userPwd = "";
    if(cookies!=null) 
    for(Cookie ck:cookies){
    	if(ck.getName().equals("username")){
    		userName = ck.getValue();
    	}
    	if(ck.getName().equals("userpwd")){
    		userPwd = ck.getValue();
    	 
    }
    }
       %>
     
     <form method="get" action="LoginServlet">
     登录:<br/>
   用户名<input name="username" type="text"  value="<%=userName%>"/>
   密码<input name="userpwd" type="password"  value="<%=userPwd%>"/>
     
    
     用户登录<input type="radio" name="logintype" value="0" checked/>
     管理员登录<input type="radio" name="logintype" value="1"/>
    
     <button type="submit">Login</button>
     <input type="checkbox" name="chkRemember" value="y">记住我
     <%
     String cusername;
     String cuesrpwd;
     if(request.getParameter("chkRemember")==null)
     {
     Cookie cookie = new Cookie("username",userName);    
   	 cookie.setMaxAge(0);//将时间设置为0，cookie就会马上失效
   	 response.addCookie(cookie);
     }
     else{
Cookie cookie1=new Cookie("username",request.getParameter("username")); 
Cookie cookie2=new Cookie("userpwd",request.getParameter("userpwd"));
cookie1.setMaxAge(10);   //存活期为10秒
cookie2.setMaxAge(10);
response.addCookie(cookie1);
response.addCookie(cookie2);  }
%>
     
     </form>
  </body>
</html>
