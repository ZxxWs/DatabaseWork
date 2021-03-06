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
		//获取需要Crud的房间的信息
		String Crud = request.getParameter("Crud");
		String Rno = request.getParameter("Rno");
		String Rtype = request.getParameter("Rtype");
		String Rprice = request.getParameter("Rprice");
		String Rcondition = request.getParameter("Rcondition");
		String Pno = request.getParameter("Pno");
	%>
	<div class="content">
		<div class="main">
			<!-- 修改房间信息 -->
			<form action="ChangeRoomInformation" id="ChangeRoomFrom"
				>
				房间号<input type="text" name="NewRno" value='<%=Rno%>' /><br>
				房间类型<select name="Rtype" id="RtypeSelect">
					<option value="单人间">单人间</option>
					<option value="双人间">双人间</option>
					<option value="单人钟点房">单人钟点房</option>
					<option value="双人钟点房">双人钟点房</option>
				</select><br> 房间价格<input type="text" name="Rprice" value='<%=Rprice%>' /><br>
				房间状态：<select name="Rcondition" id="RconditionSelect">
					<option value="0">空房</option>
					<option value="1">有人</option>
				</select> <br> 管理员工号：<input type="text" name="Pno" value='<%=Pno%>' /><br>
				<input type="hidden" name="OldRno" value='<%=Rno%>' /> <input
					type="hidden" name="Crud" value='C' /> <input type="button"
					value="确认修改" onclick="ChangeRoom()" /><br>
			</form>


			<!-- 删除此房间 -->
			<form action="ChangeRoomInformation" id="DelRoomFrom">
				<input type="hidden" name="Crud" value='D' /><br> <input
					type="hidden" name="OldRno" value='<%=Rno%>' /><br> <input
					type="button" value="删除此房间" onclick="DelRoom()" /><br>
			</form>
		</div>
	</div>



	<script type="text/javascript">

		var varRtype='<%=Rtype%>'//控制下拉列表的默认选项
		if(varRtype=="单人间"){
			document.getElementById("RtypeSelect").selectedIndex = "0";
		}
		else if(varRtype=="双人间"){
			document.getElementById("RtypeSelect").selectedIndex = "1";
		}
		if(varRtype=="单人钟点房"){
			document.getElementById("RtypeSelect").selectedIndex = "2";
		}
		if(varRtype=="双人钟点房"){
			document.getElementById("RtypeSelect").selectedIndex = "3";
		}
		document.getElementById("RconditionSelect").selectedIndex = "<%=Rcondition%>";

		function ChangeRoom() {
			var SureChange = confirm("确定修改房间信息？")
			if (SureChange == true) {
				var form = document.getElementById('ChangeRoomFrom');
				form.submit();
				//window.close();
			}

		}

		function DelRoom() {
			var SureDel = confirm("确定删除房间信息")
			if (SureDel == true) {
				var form = document.getElementById('DelRoomFrom');
				form.submit();
			}
		}
	</script>

</body>
</html>




















