<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
	        
	        	
	        	
	        <s:iterator value="RoomList" >
	        	<tr>
	                <td><s:property value="Rno"/></td>
	                <td><s:property value="Rtype"/></td>
	                <td><s:property value="Rprice"/></td>
	                <td><s:property value="Pno"/></td>
	                
	                <td><input class="btn" name="edit" type="button" value="入住" onclick="InPutCheckIn(<s:property value="Rno"/>)"></td>
		        </tr>
	        
	        </s:iterator>	
	        
    	</table>
    
      <script>
        // alert("我叫：");  
        function InPutCheckIn(Rno){

        	open ('/SJK/Page/CheckInInPut.jsp?Rno='+Rno, '客户信息登记' , 'height=400, width=700, top=0, left=0, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行

     	   }
    </script>
    

</body>
</html>