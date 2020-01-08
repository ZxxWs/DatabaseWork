<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/SJK/Page/Css/Css4.css" type="text/css" rel="stylesheet" />
<title>添加房间</title>
<style>
.content {
	background-color: pink;
	position: absolute;
	/*绝对定位*/
	top: 50%;
	left: 0;
	width: 100%;
	height: 540px;
	margin-top: -300px;
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
	padding: 10px;
	width: 100px;
	border-radius: 30px;
	font-size: 15px;
	font-weight: 100;
	text-align: center;
}

form input:hover {
	background-color: pink;
}

form button {
	background-color: yellow;
	border-radius: 10px;
	border: 0;
	height: 18px;
	width: 200px;
	padding: 5px 5px;
}

form button:hover {
	background-color: chartreuse;
}

select {
	appearance: none; //
	-webkit-appearance: none; //
	padding-right: 14px; //
	width: 20px;
	height: 25px;
	border: 1px solid #ccc;
	font-size: 15px;
	background-color: yellow;
	color: black;
}
</style>
</head>
<body id="body">

	<div class="content">
		<div class="main">

			<form action="ChangeRoomInformation" id="ChangeRoomFrom"
				target="_blank">
				房间号<input type="text" name="NewRno" /><br> 房间类型<select
					name="Rtype" id="RtypeSelect">
					<option value="单人间">单人间</option>
					<option value="双人间">双人间</option>
					<option value="单人钟点房">单人钟点房</option>
					<option value="双人钟点房">双人钟点房</option>
				</select><br> 房间价格<input type="text" name="Rprice" /><br> 房间状态：<select
					name="Rcondition" id="RconditionSelect">
					<option value="0">空房</option>
					<option value="1">有人</option>
				</select> <br> 管理员工号：<input type="text" name="Pno" /><br> <input
					type="hidden" name="Crud" value='A' /> <input type="submit"
					value="确认添加" /> <br>
			</form>
		</div>
	</div>
</body>
</html>