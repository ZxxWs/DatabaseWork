<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/SJK/Page/Css/Css4.css" type="text/css" rel="stylesheet" />
<title>修改信息</title>
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
	<%
				//获取需要Crud的员工的信息
				String Gno = request.getParameter("Gno");
				String Gname = request.getParameter("Gname");
				String Gtel = request.getParameter("Gtel");
			%>

	<div class="content">
		<div class="main">
			<!-- 修改员工信息 -->
			<form action="ChangeGuestInformation" id="ChangeGuestFrom"
				>
				顾客姓名<input type="text" name="Gname" value='<%=Gname%>' /><br>
				顾客身份证号<input type="text" name="NewGno" value='<%=Gno%>' /><br>
				顾客手机号：<input type="text" name="Gtel" value='<%=Gtel%>' /><br>
				<input type="hidden" name="OldGno" value='<%=Gno%>' /> <input
					type="button" value="确认修改" onclick="ChangeGuest()" /><br>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function ChangeGuest() {
			var SureChange = confirm("确定修改房间信息？")
			if (SureChange == true) {
				var form = document.getElementById('ChangeGuestFrom');
				form.submit();
			}
		}
	</script>

</body>
</html>




















