<!-- 赖喜彬 -->

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="dao.UserDao"%>
<%@page import="model.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	UserDao ad = new UserDao();

	String uName = request.getParameter("user_name");
	String uPasswd = request.getParameter("user_passwd");
	String uPhone = request.getParameter("user_phone");
	int uSex;
	if (request.getParameter("user_sex") == "AX") {
		uSex = 1;
	} else
		uSex = 0;
	String uBirth = request.getParameter("user_birth");
	String uTName = request.getParameter("user_truename");
	String uMain = request.getParameter("user_mail");
	String uAddress = request.getParameter("user_address");
	Date uBirth2;
	int uPhone2;

	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	uBirth2 = format.parse(uBirth);
	uPhone2 = Integer.parseInt(uPhone);

	User us = new User();

	us.setUser_name(uName);
	us.setUser_passwd(uPasswd);
	us.setUser_phone(uPhone2);
	us.setUser_truename(uTName);
	us.setUser_sex(uSex);
	us.setUser_birth(uBirth2);
	us.setUser_mail(uMain);
	us.setUser_address(uAddress);

	ad.registerUser(us);
	session.setAttribute(uName, uPasswd);//将登录状态信息放入session
	response.setHeader("refresh", "2,URL=index.jsp");
%>添加成功
</br>
<a href="index.jsp">2秒后自动跳转，或点此跳转</a>
