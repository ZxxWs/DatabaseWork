<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
 
<title>入住</title>
</head>
<body id="body">
   <iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp" noresize="noresize"></iframe>
    <!-- frameBorder=0 -->
    <div class="table_div">
        <div class="center_center">
            <div class="table_content">
                <table cellspacing="0px" cellpadding="0px">
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
                        <tr>
                           <s:iterator value="RoomList" >
	        	<tr>
	                <td><s:property value="Rno"/></td>
	                <td><s:property value="Rtype"/></td>
	                <td><s:property value="Rprice"/></td>
	                <td><s:property value="Pno"/></td>
	                
	                <td><input class="btn" name="edit" type="button" value="入住" onclick="InPutCheckIn('<s:property value="Rno"/>','<s:property value="Rtype"/>','<s:property value="Rprice"/>')"></td>
		        </tr>
	        </s:iterator>

                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>	
	       
    
      <script>
  
        function InPutCheckIn(Rno,Rtype,Rprice){
			if(Rtype=="单人间"){
				open ('/SJK/Page/CheckInPut/CheckInInPut.jsp?Rno='+Rno+'&Rprice='+Rprice, '客户信息登记' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
			}else if(Rtype=="双人间"){
				open ('/SJK/Page/CheckInPut/CheckInInPut2.jsp?Rno='+Rno+'&Rprice='+Rprice, '客户信息登记' , 'height=400, width=700, top=300, left=500,  toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
			}else if(Rtype=="单人钟点房"){
				open ('/SJK/Page/CheckInPut/CheckInInPut3.jsp?Rno='+Rno+'&Rprice='+Rprice, '客户信息登记' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
			}else{
				open ('/SJK/Page/CheckInPut/CheckInInPut4.jsp?Rno='+Rno+'&Rprice='+Rprice, '客户信息登记' , 'height=400, width=700, top=300, left=500,  toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
			}
     	   }
    </script>
    

</body>
</html>