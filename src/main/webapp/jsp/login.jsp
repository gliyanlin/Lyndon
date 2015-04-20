<%@ include file="include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8" />

<title>用户登陆</title>
<%@include file="include/header.html"%>
<style type="text/css">
@IMPORT url("../css/style-login.css");
</style>
</head>

<body>
	<c:if test="${not empty param.error }">
		<font color="red"> Login error. <br /> Reason:
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</font>
	</c:if>
	<div id="demo-top-bar">
		<div id="demo-bar-inside">
			<h2 id="demo-bar-badge">
				<a href="/">CSS-Tricks Example</a>
			</h2>
			<div id="demo-bar-buttons"></div>

		</div>

	</div>
	<form id="login-form"
		action="<c:url value="/j_spring_security_check"/>" method="post">
		<fieldset>

			<legend>Log in</legend>

			<label for="login">Email</label> <input type="email"
				name="user_email" />
			<div class="clear"></div>

			<label for="password">Password</label> <input type="password"
				name="password" />
			<div class="clear"></div>

			<label for="remember_me" style="padding: 0;">Remember me?</label> <input
				type="checkbox" style="position: relative; top: 3px; margin: 0;"
				name="_spring_security_remember_me" />
			<div class="clear"></div>

			<br /> <input type="submit" style="margin: -20px 0 0 287px;"
				class="button" name="commit" value="Login" /> <input type="reset"
				value="Reset">
		</fieldset>
	</form>

	<style type="text/css" style="display: none !important;">
* {
	margin: 0;
	padding: 0;
}

body {
	overflow-x: hidden;
}

#demo-top-bar {
	text-align: left;
	background: #222;
	position: relative;
	zoom: 1;
	width: 100% !important;
	z-index: 6000;
	padding: 20px 0 20px;
}

#demo-bar-inside {
	width: 960px;
	margin: 0 auto;
	position: relative;
	overflow: hidden;
}

#demo-bar-buttons {
	padding-top: 10px;
	float: right;
}

#demo-bar-buttons a {
	font-size: 12px;
	margin-left: 20px;
	color: white;
	margin: 2px 0;
	text-decoration: none;
	font: 14px "Lucida Grande", Sans-Serif !important;
}

#demo-bar-buttons a:hover, #demo-bar-buttons a:focus {
	text-decoration: underline;
}

#demo-bar-badge {
	display: inline-block;
	width: 302px;
	padding: 0 !important;
	margin: 0 !important;
	background-color: transparent !important;
}

#demo-bar-badge a {
	display: block;
	width: 100%;
	height: 38px;
	border-radius: 0;
	bottom: auto;
	margin: 0;
	background: url(../images/examples-logo.png) no-repeat;
	background-size: 100%;
	overflow: hidden;
	text-indent: -9999px;
}

#demo-bar-badge:before, #demo-bar-badge:after {
	display: none !important;
}
</style>
</body>

</html>