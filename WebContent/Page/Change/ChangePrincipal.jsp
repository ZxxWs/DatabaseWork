<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改信息</title>
</head>
<body>


	<%//获取需要Crud的员工的信息
		String Crud=request.getParameter("Crud");//这个好像没用到
		String Pno=request.getParameter("Pno");
		String Pname=request.getParameter("Pname");
	%>

	<!-- 修改员工信息 -->
	<form action="ChangePrincipalInformation" id="ChangePrincipalFrom" target="_blank">
                 员工工号<input type="text" name="NewPno" value='<%=Pno%>'/><br>
                 员工姓名：<input type="text" name="Pname" value='<%=Pname%>'/><br>
        <input type="hidden" name="OldPno" value='<%=Pno%>'/>
        <input type="hidden" name="Crud" value='C'/>
        <input type="button" value="确认修改" onclick="ChangePrincipal()" /><br>
    </form>
		
		
	<!-- 删除此员工 -->
	 <form action="ChangePrincipalInformation" id="DelPrincipalFrom">
        <input type="hidden" name="Crud" value='D'/><br>
        <input type="hidden" name="OldPno" value='<%=Pno%>'/><br>
        <input type="button" value="删除此员工" onclick="DelPrincipal()" /><br>
	 </form>


	<script type="text/javascript">


		function ChangePrincipal(){
			var SureChange=confirm("确定修改员工信息？")
			if(SureChange==true){
				var form = document.getElementById('ChangePrincipalFrom');
		     	form.submit();
			}
			
		}
	
	  	function DelPrincipal() {
		  	var SureDel=confirm("确定删除员工信息")
				if(SureDel==true){
					var form = document.getElementById("DelPrincipalFrom");
			     	form.submit();
			}
	  	}
	</script>

</body>
</html>




















