<!-- czk -->
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>城市-添加</title>
		<link rel="stylesheet" type="text/css" href="CSS/style_admin.css">
	</head>

	<body>
		<form name="form1" action="AddUsersServlet" method="post">
			<table cellspacing="1" cellpadding="4" width="100%"
				class="tableborder" id="table3">

				<input type="hidden" name="action" value="save" />
				<tr>
					<td colspan="12" class="header">
						城市-添加
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						省&nbsp;份：
					</td>
					<td class="altbg2" colspan="11">
						<input type="text" name="province" size="34">
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						城&nbsp;市：
					</td>
					<td class="altbg2" colspan="11">
						<input type="password" name="city_name" size="34">
					</td>
				</tr>
				<tr>
					<td class="altbg1"> 
					<br></td>
					<td class="altbg2" colspan="11">
						<input type="submit" value="提交" name="B1">
						<input type="reset" value="重置" name="B2">
					</td>
				</tr>


				<tr>
					<td class="altbg1">
					<br></td>
					<td class="altbg2" colspan="11">
						&nbsp;&nbsp;&nbsp;
					</td>
				</tr>

			</table>
		</form>
	</body>

</html>
