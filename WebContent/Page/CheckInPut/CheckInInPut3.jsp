<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link href="/SJK/Page/Css/Css4.css" type="text/css" rel="stylesheet" />
  <link href="/SJK/Page/Css/CheckInPut.css" type="text/css" rel="stylesheet" />
 
<title>输入入住信息</title>
</head>
<!-- 单人钟点房 -->
<body class="body">
输入入住信息


	<%
		String Rno=request.getParameter("Rno");
		String Rprice=request.getParameter("Rprice");
	%>
	

 	<form action="CheckInAction">
	        顾客姓名<input type="text" name="Gname" />
	        顾客身份证号<input type="text" name="Gno" />
	        顾客手机号<input type="text" name="Gtel" />
		<select name="AllTime">
			<option value="1">1小时</option>
			<option value="2">2小时</option>
			<option value="3">3小时</option>
			<option value="4">4小时</option>
			<option value="5">5小时</option>
			<option value="6">6小时</option>
			<option value="7">7小时</option>
			<option value="8">8小时</option>
			<option value="9">9小时</option>
			<option value="10">10小时</option>
		</select>
        <input type="hidden" name="Rno" value="<%=Rno%>" />
        <input type="hidden" name="Rprice" value="<%=Rprice%>" />
        <input type="hidden" name="Rtype" value="3" />
        <input type="hidden" name="Page" value="1" />
        <input type="submit" value="入住" />
    </form>


</body>



</html>