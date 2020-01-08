<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/SJK/Page/Css/Css4.css" type="text/css" rel="stylesheet" />
<title>修改酒店员工信息</title>
</head>
<body id="body">

	<form action="ChangePrincipalInformation_Show">
		输入员工号：<input type="text" name="FindNo"> <input type="submit"
			value="查询" />
	</form>

	<form id="ADPrincipal" action="ChangePrincipalInformation">
		<input type="button" value="添加员工" onclick="Add()" /> <input
			type="hidden" name="OldPno" id="OldPno" /> <input type="hidden"
			name="Crud" id="Crud"> <input type="button" value="删除员工"
			onclick="Del()" />
	</form>
	<div class="table_div">
		<div class="center_center">
			<div class="table_content">
				<table cellspacing="0px" cellpadding="0px">
					<thead>
						<tr>
							<th>员工工号</th>
							<th>员工姓名</th>
							<th>修改</th>
						</tr>
					</thead>
					<tbody>
						
							<s:iterator value="ShowPrincipalList" >
				        	<tr>
				                <td><s:property value="Pno"/></td>
				                <td><s:property value="Pname"/></td>
				                <td><input  type="button" value="修改信息" onclick="Change('<s:property value="Pno"/>','<s:property value="Pname"/>')"></td>
					        </tr>
				       		 </s:iterator>

					</tbody>
				</table>
			</div>
		</div>
	</div>


	<script type="text/javascript">

		function Change(Pno, Pname) {
			open(
					'/SJK/Page/Change/ChangePrincipal.jsp?Pno=' + Pno
							+ '&Pname=' + Pname,
					'修改信息',
					'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
		}
		function Add() {
			open(
					'/SJK/Page/Change/AddPrincipal.jsp',
					'增添员工',
					'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
		}
		function Del() {
			var inPut
			inPut = prompt("请输入需要删除的员工号码", "");
			if (inPut != null) {
				document.getElementById("OldPno").value = inPut;
				document.getElementById("Crud").value = "D";
				var Sure = confirm("确定删除")
				if (Sure == true) {
					document.getElementById("ADPrincipal").submit();
				}
			}
		}
	</script>


</body>
</html>
























