<!-- 赖喜彬 -->

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>万达影城-注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href='http//fonts.googleapis.com/css?family=Exo+2'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery1.min.js"></script>
<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>
	$(document).ready(function() {
		$(".megamenu").megamenu();
	});
</script>
<script src="js/jquery.easydropdown.js"></script>

</head>

<body>
	<div class="header-top">
		<div class="wrap">
			<div class="header-top-left">
				<div class="box">
				</div>
				<div class="box1">
					<select tabindex="4" class="dropdown">
						<option value="" class="label" value="">个人中心 </option>
						<option value="1">个人中心</option>
						<option value="2">注销</option>
					</select>
				</div>
				<div class="clear"></div>
			</div>
			<div class="cssmenu">
				<ul>
					<li class="active"><a href="login.jsp">登录</a></li> |
					<li><a href="register">注册</a></li> |
					<li><a href="checkout.html">帮助</a></li> |
				</ul>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div class="header-bottom">
		<div class="wrap">
			<div class="header-bottom-left">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="menu">
					<ul class="megamenu skyblue">
						<li class="active grid"><a href="index.jsp">首页</a></li>
						<li><a class="color4" href="#">即将上映</a>
							<div class="megapanel">
								<div class="row">
									<div class="col1">
										<div class="h_nav">
											<h4>Contact Lenses</h4>
											<ul>
												<li><a href="womens.jsp">Daily-wear soft lenses</a></li>
												<li><a href="womens.jsp">Extended-wear</a></li>
												<li><a href="womens.jsp">Lorem ipsum </a></li>
												<li><a href="womens.jsp">Planned replacement</a></li>
											</ul>
										</div>
									</div>
									<div class="col1">
										<div class="h_nav">
											<h4>Sun Glasses</h4>
											<ul>
												<li><a href="womens.jsp">Heart-Shaped</a></li>
												<li><a href="womens.jsp">Square-Shaped</a></li>
												<li><a href="womens.jsp">Round-Shaped</a></li>
												<li><a href="womens.jsp">Oval-Shaped</a></li>
											</ul>
										</div>
									</div>
									<div class="col1">
										<div class="h_nav">
											<h4>Eye Glasses</h4>
											<ul>
												<li><a href="womens.jsp">Anti Reflective</a></li>
												<li><a href="womens.jsp">Aspheric</a></li>
												<li><a href="womens.jsp">Bifocal</a></li>
												<li><a href="womens.jsp">Hi-index</a></li>
												<li><a href="womens.jsp">Progressive</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div></li>
						<li><a class="color5" href="#">观影月历</a>
							<div class="megapanel">
								<div class="col1">
									<div class="h_nav">
										<h4>Contact Lenses</h4>
										<ul>
											<li><a href="mens.html">Daily-wear soft lenses</a></li>
											<li><a href="mens.html">Extended-wear</a></li>
											<li><a href="mens.html">Lorem ipsum </a></li>
											<li><a href="mens.html">Planned replacement</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Sun Glasses</h4>
										<ul>
											<li><a href="mens.html">Heart-Shaped</a></li>
											<li><a href="mens.html">Square-Shaped</a></li>
											<li><a href="mens.html">Round-Shaped</a></li>
											<li><a href="mens.html">Oval-Shaped</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Eye Glasses</h4>
										<ul>
											<li><a href="mens.html">Anti Reflective</a></li>
											<li><a href="mens.html">Aspheric</a></li>
											<li><a href="mens.html">Bifocal</a></li>
											<li><a href="mens.html">Hi-index</a></li>
											<li><a href="mens.html">Progressive</a></li>
										</ul>
									</div>
								</div>
							</div></li>
					</ul>
				</div>
			</div>
			<div class="header-bottom-right">
				<div class="search">
					<input type="text" name="s" class="textbox" value="Search"
						onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = 'Search';}"> <input
						type="submit" value="Subscribe" id="submit" name="submit">
					<div id="response"></div>
				</div>
				<div class="tag-list">
					<ul class="icon1 sub-icon1 profile_img">
						<li><a class="active-icon c1" href="#"> </a>
							<ul class="sub-icon1 list">
								<li><h3>sed diam nonummy</h3> <a href=""></a></li>
								<li><p>
										Lorem ipsum dolor sit amet, consectetuer <a href="">adipiscing
											elit, sed diam</a>
									</p></li>
							</ul></li>
					</ul>
					<ul class="icon1 sub-icon1 profile_img">
						<li><a class="active-icon c2" href="#"> </a>
							<ul class="sub-icon1 list">
								<li><h3>No Products</h3> <a href=""></a></li>
								<li><p>
										Lorem ipsum dolor sit amet, consectetuer <a href="">adipiscing
											elit, sed diam</a>
									</p></li>
							</ul></li>
					</ul>
					<ul class="last">
						<li><a href="#">Cart(0)</a></li>
					</ul>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div class="register_account">
		<div class="wrap">
			<h4 class="title">Create an Account</h4>
			<form action="doRegister.jsp" method="post">
				<div class="col_1_of_2 span_1_of_2">
					<div>
						<input type="text" name="user_name" value="用户名"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = '用户名';}">
					</div>
					<div>
						<input type="text" name="user_truename" value="真实姓名"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = '真实姓名';}">
					</div>
					<div>
						<input type="text" name="user_mail" value="E-Mail"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'E-Mail';}">
					</div>
					<div>
						<input type="text" name="user_passwd" value="密码"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = '密码';}">
					</div>
				</div>
				<div class="col_1_of_2 span_1_of_2">
					<div>
						<input type="text" name="user_address" value="地址"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = '地址';}">
					</div>
					<div>
						<select id="country" name="user_sex"
							onchange="change_country(this.value)" class="frm-field required">
							<option value="null">选择性别</option>
							<option value="AX">男</option>
							<option value="AF">女</option>
						</select>
					</div>
					<div>
						<input type="date" name="user_birth" onfocus="this.value = '';"
							class='dateInput'>
					</div>
					<div></div>
					<input type="text" class="number" name="user_phone" value="电话号码"
						onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = '电话号码';}">
				</div>
				<button class="grey">Submit</button>
				<p class="terms">
					By clicking 'Create Account' you agree to the <a href="#">Terms
						&amp; Conditions</a>.
				</p>
				<div class="clear"></div>
			</form>
		</div>
	</div>
	<div class="footer">
		<div class="footer-top">
			<div class="wrap">
				<div class="section group example">
					<div class="col_1_of_2 span_1_of_2">
						<ul class="f-list">
							<li><img src="images/2.png"><span class="f-text">Free
									Shipping on orders over $ 100</span>
								<div class="clear"></div></li>
						</ul>
					</div>
					<div class="col_1_of_2 span_1_of_2">
						<ul class="f-list">
							<li><img src="images/3.png"><span class="f-text">Call
									us! toll free-222-555-6666 </span>
								<div class="clear"></div></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="footer-middle">
			<div class="wrap">
				<div class="section group example">
					<div class="col_1_of_f_1 span_1_of_f_1">
						<div class="section group example">
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>Facebook</h3>
								<script>
									(function(d, s, id) {
										var js, fjs = d.getElementsByTagName(s)[0];
										if (d.getElementById(id))
											return;
										js = d.createElement(s);
										js.id = id;
										js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
										fjs.parentNode.insertBefore(js, fjs);
									}(document, 'script', 'facebook-jssdk'));
								</script>
								<div class="like_box">
									<div class="fb-like-box" data-href="http//www.zjf88.com/"
										data-colorscheme="light" data-show-faces="true"
										data-header="true" data-stream="false" data-show-border="true"></div>
								</div>
							</div>
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>From Twitter</h3>
								<div class="recent-tweet">
									<div class="recent-tweet-icon">
										<span> </span>
									</div>
									<div class="recent-tweet-info">
										<p>
											Ds which don't look even slightly believable. If you are <a
												href="#">going to use nibh euismod</a> tincidunt ut laoreet
											adipisicing
										</p>
									</div>
									<div class="clear"></div>
								</div>
								<div class="recent-tweet">
									<div class="recent-tweet-icon">
										<span> </span>
									</div>
									<div class="recent-tweet-info">
										<p>
											Ds which don't look even slightly believable. If you are <a
												href="#">going to use nibh euismod</a> tincidunt ut laoreet
											adipisicing
										</p>
									</div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</div>
					<div class="col_1_of_f_1 span_1_of_f_1">
						<div class="section group example">
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>Information</h3>
								
							</div>
							<div class="col_1_of_f_2 span_1_of_f_2">
								<h3>Contact us</h3>
								<div class="company_address">
									<p>500 Lorem Ipsum Dolor Sit,</p>
									<p>22-56-2-9 Sit Amet, Lorem,</p>
									<p>USA</p>
									<p>Phone:(00) 222 666 444</p>
									<p>Fax: (000) 000 00 00 0</p>
									<p>
										Email: <span>mail[at]leoshop.com</span>
									</p>

								</div>
								<div class="social-media">
									<ul>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Google"><a href="#" target="_blank">
											</a></span></li>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Linked in"><a href="#" target="_blank">
											</a> </span></li>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Rss"><a href="#" target="_blank"> </a></span></li>
										<li><span class="simptip-position-bottom simptip-movable"
											data-tooltip="Facebook"><a href="#" target="_blank">
											</a></span></li>
									</ul>
								</div>
							</div>
							<div class="clear"></div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="wrap">
				<div class="copy">
					<p>
						Copyright &copy; 2014.Company name All rights reserved.<a
							target="_blank" href="http//www.zjf88.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
					</p>
				</div>
				<div class="f-list2">
					<ul>
						<li class="active"><a href="about.html">About Us</a></li> |
						<li><a href="delivery.html">Delivery & Returns</a></li> |
						<li><a href="delivery.html">Terms & Conditions</a></li> |
						<li><a href="contact.html">Contact Us</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<div style="display:none">
		<script src='http//v7.cnzz.com/stat.php?id=155540&web_id=155540'
			language='JavaScript' charset='gb2312'></script>
	</div>
	<br>
</body>
</html>
