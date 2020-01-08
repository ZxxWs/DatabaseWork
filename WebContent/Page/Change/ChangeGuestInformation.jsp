<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/SJK/Page/Css/Css4.css" type="text/css" rel="stylesheet" />
<title>修改顾客信息</title>
</head>
<body id="body">
	<form action="ChangeGuestInformation_Show">
		输入顾客身份证号：<input type="text" name="FindNo"> <input
			type="submit" value="查询" />
	</form>
	<!-- 房记录表  -->
	<div class="table_div">
		<div class="center_center">
			<div class="table_content">
				<table cellspacing="0px" cellpadding="0px">
					<thead>
						<tr>
							<th>顾客姓名</th>
							<th>身份证号</th>
							<th>性别</th>
							<th>电话</th>
							<th>修改</th>
						</tr>
					</thead>
					<tbody>
					
						
						<s:iterator value="ShowGuestList" >
				        	<tr>
				                <td><s:property value="Gname"/></td>
				                <td><s:property value="Gno"/></td>
				                <td><s:property value="Gsex"/></td>
				                <td><s:property value="Gtel"/></td>
				                <td><input type="button" value="修改信息" onclick="Change('<s:property value="Gno"/>','<s:property value="Gname"/>','<s:property value="Gtel"/>')"></td>
					        </tr>
				        </s:iterator>
						
						
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<script type="text/javascript">
	
		function Change(Gno, Gname, Gtel) {
			open(
					'/SJK/Page/Change/ChangeGuest.jsp?Gno=' + Gno + '&Gname='
							+ Gname + '&Gtel=' + Gtel,
					'修改信息',
					'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
		}
	</script>


</body>
</html>
























