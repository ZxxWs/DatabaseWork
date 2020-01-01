<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
 
<title>入住</title>
</head>
<body>
   <iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp" noresize="noresize"></iframe>
    <!-- frameBorder=0 -->
    
        <table id="ShowTable" border="1" cellspacing="0" cellpadding="0">
	       <thead>
		        <tr>
		            <th>房号</th>
		            <th>类型</th>
		            <th>价格</th>
		            <th>负责人</th>
		            <th>开房</th>
		        </tr>
	        </thead>
	        
	        <tbody>
	        	
	        	
	        
        		<c:forEach items="${RoomList}" var="a" varStatus="status">
           	 		<tr>
		                <td>${a}</td>
		                <td>${a.Rtype}</td>
		               	<td>${a[Rprice]}</td>
		                <td>${a[Pno]}</td>
		                
		                <td><input class="btn" name="edit" type="button" value="入住" onclick=""></td>
		            </tr>
        		</c:forEach>
        	
        	</tbody>
    	</table>
    	
    	${RoomList}
    	
    
   
    

</body>
</html>