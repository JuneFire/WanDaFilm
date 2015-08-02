<!--涂伟-->
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Management</title>

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
	<form method="get" action="AdminManagServlet">
		<select>
			<option name="manag" value="yp">影片管理</option>
			<option name="manag" value="cs">城市管理</option>
			<option name="manag" value="yc">影城管理</option>
			<option name="manag" value="yt">影厅管理</option>
			<option name="manag" value="fwgg">服务公告管理</option>
			<option name="manag" value="yh">用户管理</option>
			<option name="manag" value="gly">管理员管理</option>
			<option name="manag" value="gr">个人资料管理</option>
			<option name="manag" value="dd">订单管理</option>
		</select>
	</form>

</body>
</html>
