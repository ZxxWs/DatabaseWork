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
		String Gno=request.getParameter("Gno");
		String Gname=request.getParameter("Gname");
		String Gtel=request.getParameter("Gtel");
	%>

	<!-- 修改员工信息 -->
	<form action="ChangeGuestInformation" id="ChangeGuestFrom" target="_blank">
                 顾客姓名<input type="text" name="Gname" value='<%=Gname%>'/><br>
                 顾客身份证号<input type="text" name="NewGno" value='<%=Gno%>'/><br>
                 顾客手机号：<input type="text" name="Gtel" value='<%=Gtel%>'/><br>
        <input type="hidden" name="OldGno" value='<%=Gno%>'/>
        <input type="button" value="确认修改" onclick="ChangeGuest()" /><br>
    </form>
		
	



	<script type="text/javascript">

		function ChangeGuest(){
			var SureChange=confirm("确定修改房间信息？")
			if(SureChange==true){
				var form = document.getElementById('ChangeGuestFrom');
		     	form.submit();
			}
		}
	
	</script>

</body>
</html>




















