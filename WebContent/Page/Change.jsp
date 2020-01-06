<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
<title>信息修改</title>
</head>
<body>
<iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp" noresize="noresize"></iframe>
  
    <form action="ChangeRoomInformation_Show">
        <input type="submit" value="修改房间信息"/>
    </form>

 	<form action="ChangePrincipalInformation_Show">
        <input type="submit" value="修改员工信息"/>
    </form>
    
	<form action="ChangeGuestInformation_Show">
        <input type="submit" value="修改顾客信息"/>
    </form>


</body>
</html>