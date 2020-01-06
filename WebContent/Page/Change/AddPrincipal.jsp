<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加员工</title>
</head>
<body>

	<form action="ChangePrincipalInformation" id="ChangePrincipalFrom" target="_blank">
                 员工号<input type="text" name="NewPno" /><br>
                 员工姓名：<input type="text" name="Pname" /><br>
        <input type="hidden" name="Crud" value='A'/>
        <input type="submit" value="确认添加"/> <br>
    </form>

</body>
</html>