<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加房间</title>
</head>
<body>

	<s:form action="ChangeRoomInformation"><!-- 添加房间表单 -->
		<s:textarea name="NewRno" ></s:textarea>
		<s:textarea name="Rprice" ></s:textarea>
		<s:select list="#{0:'单人间',1:'双人间',2:'单人钟点房',3:'双人钟点房'}" name="Rtype" ></s:select>
		<s:select list="#{0:'空房',1:'房间有人'}" name="Rcondition"></s:select>
		<s:hidden name="Crud" value="A"></s:hidden><!-- 用于标记是Crud中的哪个 -->
	    <s:submit value="确认修改"/><!-- 默认type="input" -->
	</s:form>


</body>
</html>