<!--  赖喜彬-->

<%@page import="dao.UserDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% 
	UserDao ad=new UserDao();
	String uName = request.getParameter("username");
	String uPasswd = request.getParameter("password");											
	if(ad.doLogin(uName,uPasswd)){
		session.setAttribute(uName,uPasswd);//将登录状态信息放入session
		response.setHeader("refresh", "2,URL=index.jsp");
		%>
登陆成功，欢迎
<%out.print("uName");
		%></br>
<a href="index.jsp">2秒后自动跳转，或点此跳转</a>
<% 
	}
	else {
		%>
用户名或密码错误，请重新登陆
</br>
<a href="login.jsp">3秒后自动跳转，或点此跳转</a>
<%
		response.setHeader("refresh", "3,URL=login.jsp");
	}
%>

