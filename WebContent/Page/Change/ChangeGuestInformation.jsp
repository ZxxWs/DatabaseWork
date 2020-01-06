<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改顾客信息</title>
</head>
<body>
	
    <form action="ChangeGuestInformation_Show">
    	输入房间号：<input type="text" name="FindNo">
        <input type="submit" value="查询"/>
    </form>
	
	<table border="1" ><!-- 房记录表  -->
						
		<tr>
			<th>顾客姓名</th>
			<th>身份证号</th>
			<th>性别</th>
			<th>电话</th>
			<th>修改</th>
		</tr>
		<s:iterator value="ShowGuestList" >
        	<tr>
                <td><s:property value="Gname"/></td>
                <td><s:property value="Gno"/></td>
                <td><s:property value="Gsex"/></td>
                <td><s:property value="Gtel"/></td>
                <td><input type="button" value="修改信息" onclick="Change('<s:property value="Rno"/>','<s:property value="Rtype"/>','<s:property value="Rprice"/>','<s:property value="Rcondition"/>','<s:property value="Pno"/>')"></td>
	        </tr>
        </s:iterator>
	</table>

	
	<script type="text/javascript">
		var  c='<s:property value="IsSuccess"/>';
		if(c==1){
			alert("修改房间信息成功") 		
			window.close('/SJK/Page/Change/ChangeGuest.jsp')
	   	}else if(c==-1){
			alert("修改房间信息失败")
			window.close('/SJK/Page/Change/ChangeGuest.jsp')
	    }
		
		 function Change(Rno,Rtype,Rprice,Rcondition,Pno){
			open ('/SJK/Page/Change/ChangeGuest.jsp?Rno='+Rno+'&Rtype='+Rtype+'&Rprice='+Rprice+'&Rcondition='+Rcondition+'&Pno='+Pno, '修改信息' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
		 }
		

	</script>
	
	
</body>
</html>
























