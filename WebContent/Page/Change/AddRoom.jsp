<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加房间</title>
</head>
<body>

	

	<form action="ChangeRoomInformation" id="ChangeRoomFrom" target="_blank">
                 房间号<input type="text" name="NewRno" /><br>
                 房间类型<select name="Rtype" id="RtypeSelect" >
			<option value="单人间">单人间</option>
			<option value="双人间">双人间</option>
			<option value="单人钟点房">单人钟点房</option>
			<option value="双人钟点房">双人钟点房</option>
		</select><br>
                 房间价格<input type="text" name="Rprice" /><br>
                 房间状态：<select name="Rcondition" id="RconditionSelect">
			<option value="0">空房</option>
			<option value="1">有人</option>
		</select>	<br>
                 管理员工号：<input type="text" name="Pno" /><br>
        <input type="hidden" name="Crud" value='A'/>
        <input type="submit" value="确认添加"/> <br>
    </form>

</body>
</html>