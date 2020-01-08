<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link href="/SJK/Page/Css/Css4.css" type="text/css" rel="stylesheet" />
<title>添加员工</title>
<style>
.content {
	background-color: pink;
	position: absolute;
	/*绝对定位*/
	top: 50%;
	left: 0;
	width: 100%;
	height: 400px;
	margin-top: -200px;
	overflow: hidden;
}

.main {
	text-align: center;
	max-width: 300px;
	height: 400px;
	padding: 100px 0px;
	margin: 0 auto;
}

.main h1 {
	font-family: "黑体";
	font-size: 65px;
	font-weight: 2px;
}

form {
	padding: 20px 0;
}

form input {
	border: 1px solid white;
	display: block;
	margin: 0px auto 10px auto;
	/*上 右  下 左*/
	padding: 10px ;
	width: 220px;
	border-radius: 30px;
	font-size: 18px;
	font-weight: 300;
	text-align: center;
}

form input:hover {
	background-color: pink;
}

form button {
	background-color: yellow;
	border-radius: 10px;
	border: 0;
	height: 30px;
	width: 50px;
	padding: 5px 10px;
}

form button:hover {
	background-color: chartreuse;
}

select {
	appearance: none; //
	-webkit-appearance: none; //
	padding-right: 14px; //
	width: 200px;
	height: 50px;
	border: 2px solid #ccc;
            font-size: 20px;
            background-color: yellow;
            color: black;
}
</style>
</head>
<body id="body">
	<iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp"
		noresize="noresize"></iframe>

	<div class="content">
		<div class="main">
	<form action="ChangePrincipalInformation" id="ChangePrincipalFrom" target="_blank">
                 员工号<input type="text" name="NewPno" /><br>
                 员工姓名：<input type="text" name="Pname" /><br>
        <input type="hidden" name="Crud" value='A'/>
        <input type="submit" value="确认添加"/> <br>
    </form>
</div>
</div>
</body>
</html>