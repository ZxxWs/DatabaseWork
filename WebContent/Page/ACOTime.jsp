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
		            <th>客人身份证号</th>
		            <th>房号</th>
		            <th>入住时间</th>
		            <th>开房时长</th>
		            <th>截止时间</th>    
		        	<th>退房</th> 
		        	<th>续房</th> 
		        	<th></th> 
		        </tr>
	        </thead>
	        
			<s:iterator value="ACOTimeList" >
	        	<tr>
	        	
	        	   <td><s:property value="CID"/></td>
	                <td><s:property value="Gno"/></td>
	                <td><s:property value="Gno1"/></td>
	                <td><s:property value="Rno"/></td>
	                <td><s:property value="InTime.getMonth()+1"/>月<s:property value="InTime.getDate()"/>日 <s:property value="InTime.getHours()"/>:<s:property value="InTime.getMinutes()"/></td>
	                
	                <s:if test="AllTime<24">
	                	<td><s:property value="AllTime"/>小时</td>
	                </s:if>
	                <s:else>
	               	 	<td><s:property value="AllTime/24"/>天</td>
	                </s:else>
	         
	                <td><s:property value="OutTime.getMonth()+1"/>月<s:property value="OutTime.getDate()"/>日 <s:property value="OutTime.getHours()"/>:<s:property value="OutTime.getMinutes()"/></td>
	             	<td>
	             		<input class="btn"  type="button" value="退房" onclick="OutTime('<s:property value="CID"/>')">
	            		<input class="btn" name="edit" type="button" value="续房" onclick="AddTime('<s:property value="CID"/>','<s:property value="AllTime"/>')">
	            		
	             	</td>
	             </tr>
	        
	        </s:iterator>	
    	</table>
    	

    	<form id="AOTimeActionO" action="AOTimeActionO" method="post" target="_parent">
	        <!-- 退房的传参-->
	        <input type="hidden" name="CID" id="CID" value="null">
    	</form>


		<form id="AOTimeActionA" action="AOTimeActionA" method="post" target="_parent">
	        <!-- 续房的传参-->
	        
	        <input type="hidden" name="CID" id="CIDA" value="null">
	        <input type="hidden" name="AddTime" id="AddTime" value="null">
    	</form>
    	
    	
    	<script type="text/javascript">

    	var  c='<s:property value="Cond"/>';
    	if(c==1){
    		alert("退房成功")
       	}else if(c==-1){
			alert("退房失败")
        }else if(c==-2){
        	alert("续房失败")
        }else if(c==2){//如果续房成功就弹出交款界面

        	var AddMoney='<s:property value="AddMoney"/>'
        	open ('/SJK/Page/ACO/AddTime.jsp?AddMoney='+AddMoney, '续房成功' , 'height=400, width=700, top=300, left=500, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=n o, status=no') //这句要写成一行
    		
        }

    	
		//三种按钮点击后的逻辑
			function OutTime(CID){//退房
				var SureOut=confirm("确定退房")
				if(SureOut==true){
					document.getElementById("CID").value=CID;
	            	document.getElementById("AOTimeActionO").submit();
				}
			}

			function AddTime(CID,AllTime){//退房
				var SureAdd
				var inPut
				if(AllTime<24){
					inPut=prompt("请输入续房时间（单位：小时）","");
					if(inPut!=null){
						SureAdd=parseInt(inPut);
					}
				}else{
					inPut=prompt("请输入续房时间（单位：天）", "");
					SureAdd=parseInt(inPut)*24;
				}
				if(inPut!=null){
					document.getElementById("CIDA").value=CID;
					document.getElementById("AddTime").value=SureAdd;
	            	document.getElementById("AOTimeActionA").submit();
				}
	    	}

			
			

    	</script>
    
</body>
</html>