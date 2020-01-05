<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>换房</title>
</head>
<body>
换房界面


	
	<s:if test="IsEmpty">
		没有可更换的房间
	</s:if>
	<s:else>
		<table id="ShowTable" border="1" cellspacing="0" cellpadding="0">
	       <thead>
		        <tr>
		            <th>房号</th>
		            <th>类型</th>
		            <th>价格</th>
		            <th>负责人</th>
		            <th>换房</th>
		        </tr>
	        </thead>
	        <s:iterator value="CanRoomList" >
	        	<tr>
	                <td><s:property value="Rno"/></td>
	                <td><s:property value="Rtype"/></td>
	                <td><s:property value="Rprice"/></td>
	                <td><s:property value="Pno"/></td>
	                <td><input class="btn" name="edit" type="button" value="换房" onclick="ChangeTime('<s:property value="Rno"/>')"></td>
		        </tr>
	        </s:iterator>
    	</table>
	</s:else>
	
	<form id="AOTimeActionC" action="AOTimeActionC" method="post" >
	
	        <!-- 换房提交的传参-->
	        
	        <input type="hidden" name="CID" id="CID" value='<s:property value="CID"/>'>
	        <input type="hidden" name="OldRno" id="OldRno" value='<s:property value="OldRno"/>'>
	        <input type="hidden" name="NewRno" id="NewRno" value="null">
	         <input type="hidden" name="Page"  value="1">
    </form>
	
	
	
	
	<script type="text/javascript">
		function ChangeTime(NewRno){
			document.getElementById("NewRno").value=NewRno;
        	document.getElementById("AOTimeActionC").submit();
	 	}
	
	</script>


</body>
</html>