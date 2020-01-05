<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改酒店房间信息</title>
</head>
<body>
	
    <form action="ChangeRoomInformation_Show">
    	输入房间号：<input type="text" name="FindNo">
        <input type="submit" value="查询"/>
    </form>
	
	
	
	
	
	<table border="1" ><!-- 房记录表  这里稍微有点问题：只会显示这个人的开房信息，如果是两个人的话就显示不出来-->
						
		<tr>
			<th>房间号</th>
			<th>类型</th>
			<th>价格</th>
			<th>状态</th>
			<th>负责人工号</th>
			<th>修改</th>
		</tr>
		<s:iterator value="ShowRoomList" >
        	<tr>
                <td><s:property value="Rno"/></td>
                <td><s:property value="Rtype"/></td>
                <s:if test="Rtype=='单人间'||Rtype=='双人间'">
                	<td><s:property value="Rprice"/>/天</td>
                </s:if>
                <s:else>
                	<td><s:property value="Rprice"/>/小时</td>
                </s:else>
                <s:if test="Rcondition==0">
                	<td>空房</td>
                </s:if>
                <s:else>
                	<td>有人</td>
                </s:else>
                <td><s:property value="Pno"/></td>
                <td><input class="btn" name="edit" type="button" value="修改信息" onclick="Change('<s:property value="Rno"/>','<s:property value="Rtype"/>','<s:property value="Rprice"/>','<s:property value="Rcondition"/>',<s:property value="Pno"/>)"></td>
	        </tr>
        </s:iterator>
	</table>



	<script type="text/javascript">
	 function Change(Rno,Rtype,Rprice,Rcondition,Pno){
		open ('/SJK/Page/Change/ChangeRoom.jsp?Rno='+Rno+'&Rtype='+Rtype+'&Rprice='+Rprice+'&Rcondition='+Rcondition+'&Pno='+Pno, '修改信息' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
	 }
	 function Add(){
			open ('/SJK/Page/Change/AddRoom.jsp', '增添房间' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
	 }
	 function Del(){
			//open ('/SJK/Page/Change/AddOrDelRoom.jsp', '删除房间' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
	 }

	</script>
	
	
</body>
</html>
























