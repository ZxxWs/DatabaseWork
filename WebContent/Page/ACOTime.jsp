<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
<title>换、续、退房</title>
</head>
<!-- 换房、续房、退房界面 -->
<body>
<iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp" noresize="noresize"></iframe>


<br>

       <table id="ShowTable" border="1" cellspacing="0" cellpadding="0">
	       <thead>
		        <tr>
		            <th>流水号</th>
		            <th>客人身份证号</th>
		            <th>房号</th>
		            <th>入住时间</th>
		            <th>开房时长</th>
		            <th>截止时间</th>
		            <th>操作</th>
		            
		        </tr>
	        </thead>
	        
			<s:iterator value="ACOTimeList" >
	        	<tr>
	                <td><s:property value="CID"/></td>
	                <td><s:property value="Gno"/></td>
	                <td><s:property value="Rno"/></td>
	                <td><s:property value="InTime.getMonth()+1"/>月<s:property value="InTime.getDate()"/>日 <s:property value="InTime.getHours()"/>:<s:property value="InTime.getMinutes()"/></td>
	                <td><s:property value="AllTime"/></td>
	                <td><s:property value="OutTime.getMonth()+1"/>月<s:property value="OutTime.getDate()"/>日 <s:property value="OutTime.getHours()"/>:<s:property value="OutTime.getMinutes()"/></td>
	              
	                <td><input class="btn" name="edit" type="button" value="" onclick=""></td>
		        </tr>
	        
	        </s:iterator>	
	        	
	        
	       
    	</table>
    	
    	
    
</body>
</html>