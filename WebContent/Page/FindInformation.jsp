<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
<style type="text/css">
.content {
	position: absolute;
	/*绝对定位*/
	top: 50%;
	left: 0;
	margin-top: -200px;
	overflow: hidden;
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
	background-color: #ecbcd0;
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

#g1 {
  border: 1px solid #000;
font-size:25px;
background-color:#ecbcd0;
	margin-left: 200px;
	width: 400px;
	position: absolute;
	top: 350px;
	right: 900px;
}
table th{
background:#8de9cd;
border：1px solid #8de9cd; 
}
#g2 {
  border: 1px solid #000;
font-size:20px;
background-color:#ecbcd0;
	margin-left: 200px;
	width: 500px;
	position: absolute;
	top: 150px;
	right: 300px;
}
#g3 {
  border: 1px solid #000;
font-size:20px;
background-color:#ecbcd0;;

	margin-left: 200px;
	width: 500px;
	position: absolute;
	top: 350px;
	right: 300px;
}
</style>
<title>信息查询</title>
</head>
<!-- 信息查询页面 -->
<body id="body">

	<iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp"
		noresize="noresize"></iframe>
	<div class="content">
		<div class="main">
			<!--查询表单 -->
			<s:form action="FindInformationAction">
				<s:select list="#{0:'选择查询方式',1:'通过身份证号查询',2:'查询房间使用记录'}"
					name="FindMethod"></s:select>

				<s:textfield value="输入" name="FindNum"></s:textfield>
				<s:hidden value="2" name="Page"></s:hidden>
				<!-- 用于页面重定向的 -->
				<s:submit value="查询" />
				<!-- 默认type="input" -->

			</s:form>
		</div>
	</div>
	<!-- 查询是否成功 -->
	<s:if test="Tag==false">
		<script type="text/javascript">
			alert("查询失败，请检查输入是否有误")
		</script>
	</s:if>

	<s:else>
		<!-- 查询成功 -->
		<s:if test="FindMethod==0">
			<script type="text/javascript">
				alert("请选择查询方式")
			</script>

		</s:if>

		<s:elseif test="FindMethod==1">
			<!-- 通过身份证号查询的展示 -->


			<table border="1" id="g1">
				<caption>顾客信息</caption>
				<tr>
					<th>姓名：</th>
					<th>性别：</th>
					<th>身份证号：</th>
					<th>电话：</th>
				</tr>
				<tr>
					<td><s:property value="GuestList.get(0).Gname" /></td>
					<td><s:property value="GuestList.get(0).Gsex" /></td>
					<td><s:property value="GuestList.get(0).Gno" /></td>
					<td><s:property value="GuestList.get(0).Gtel" /></td>
				</tr>
			</table>



			<table border="1" id="g2">
				<caption>开房记录</caption>
				<!-- 房记录表  这里稍微有点问题：只会显示这个人的开房信息，如果是两个人的话就显示不出来-->
				<tr>
					<th>流水号</th>
					<th>房号</th>
					<th>开房日期</th>
					<th>开房时长</th>
					<th>退房时间</th>
				</tr>
				<s:iterator value="CheckInList">
					<tr>
						<td><s:property value="CID" /></td>
						<td><s:property value="Rno" /></td>
						<td><s:property value="InTime.getMonth()+1" />月<s:property
								value="InTime.getDate()" />日 <s:property
								value="InTime.getHours()" />:<s:property
								value="InTime.getMinutes()" /></td>
						<s:if test="AllTime<24">
							<td><s:property value="AllTime" />小时</td>
						</s:if>
						<s:if test="AllTime>=24">
							<td><s:property value="AllTime/24" />天</td>
						</s:if>
						<s:if test="OutTime==null">
							<th>入住中</th>
						</s:if>
						<s:if test="OutTime!=null">
							<td><s:property value="OutTime.getMonth()+1" />月<s:property
									value="OutTime.getDate()" />日 <s:property
									value="OutTime.getHours()" />:<s:property
									value="OutTime.getMinutes()" /></td>
						</s:if>
					</tr>
				</s:iterator>
			</table>
		</s:elseif>

		<s:elseif test="FindMethod==2">
			<!-- 通过房间号查询的信息展示 -->
			<table border="1" id="g1">
				<caption>房间信息</caption>
				<!-- 在这里进行表格的格式控制 -->
				<tr>
					<th>房间号：</th>
					<th>类别：</th>
					<th>价格：</th>
					<th>状态</th>
					<th>有人</th>
					<th>负责人工号</th>
				</tr>
				<tr>
					<td><s:property value="RoomList.get(0).Rno" /></td>
					<td><s:property value="RoomList.get(0).Rno" /></td>
					<td><s:property value="RoomList.get(0).Rtype" /></td>

					<s:if
						test="RoomList.get(0).Rtype=='单人间'||RoomList.get(0).Rtype=='双人间'">
						<td><s:property value="RoomList.get(0).Rprice" />元/天</td>
					</s:if>
					<s:else>
						<td><s:property value="RoomList.get(0).Rprice" />元/小时</td>
					</s:else>
					<s:if test="RoomList.get(0).Rcondition==0">
							<td>空房</td>
						</s:if>
						<s:else>
							<td>有人</td>
						</s:else>
					
				<td><s:property value="RoomList.get(0).Pno"/> </td>
				</tr>
			</table>

			<table border="1" id="g3">
				<caption>房记录表</caption>
				<tr>
					<th>流水号</th>
					<th>房号</th>
					<th>开房日期</th>
					<th>开房时长</th>
					<th>退房时间</th>
				</tr>
				<s:iterator value="CheckInList">
					<tr>
						<td><s:property value="CID" /></td>
						<td><s:property value="Rno" /></td>
						<td><s:property value="InTime.getMonth()+1" />月<s:property
								value="InTime.getDate()" />日 <s:property
								value="InTime.getHours()" />:<s:property
								value="InTime.getMinutes()" /></td>
						<s:if test="AllTime<24">
							<td><s:property value="AllTime" />小时</td>
						</s:if>
						<s:if test="AllTime>=24">
							<td><s:property value="AllTime/24" />天</td>
						</s:if>
						<s:if test="OutTime==null">
							<th>入住中</th>
						</s:if>
						<s:if test="OutTime!=null">
							<td><s:property value="OutTime.getMonth()+1" />月<s:property
									value="OutTime.getDate()" />日 <s:property
									value="OutTime.getHours()" />:<s:property
									value="OutTime.getMinutes()" /></td>
						</s:if>
					</tr>
				</s:iterator>
			</table>


		</s:elseif>
	</s:else>


</body>
</html>