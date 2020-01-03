<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>输入入住信息</title>
<!-- 单人间输入界面 -->
</head>
<body>
输入入住信息



	<%
		String Rno=request.getParameter("Rno");
		String Rprice=request.getParameter("Rprice");
		request.setAttribute("Rno",Rno);
		request.setAttribute("Rprice",Rprice);
	%>


	<s:form action="CheckInAction"><!-- 入住信息表单 -->
	
		<s:textarea name="Gname" value="姓名："></s:textarea>
		<s:textarea name="Gno" value="身份证号"></s:textarea>
		<s:textarea name="Gtel" value="电话："></s:textarea>
		<s:select  name="AllTime" list="#{1:'1天',2:'2天',3:'3天',4:'4天',5:'5天',6:'6天',7:'7天',8:'8天',9:'9天' }"></s:select>
		
		<s:hidden name="Rno" value="%{#request.Rno}"></s:hidden>
		<s:hidden name="Rprice" value="%{#request.Rprice}"></s:hidden>
		<s:hidden name="Rtype" value="1"></s:hidden>

	    <s:submit value="入住"/><!-- 默认type="input" -->
	    
	</s:form>

</body>

<script>
	var Rno=<%=request.getParameter("Rno")%>
</script>

</html>