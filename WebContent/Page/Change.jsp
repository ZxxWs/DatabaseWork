<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
<title>信息修改</title>
    <style>
        form input {
            background-color: #afa9e7;
            border-radius: 10px;
            border: 0;
            height: 50px;
            width: 400px;
            padding: 5px 10px;
            margin-left: 50px;
            margin-top: 50px;
            font-size: 25px;
            color: white;
        }
        
        form input:hover {
            background-color: rgb(225, 236, 126);
        }
    </style>
</head>
<body id="body">
    <iframe id="ShowPag" name="ShowPag" src="Menu.jsp" noresize="noresize"></iframe>

    <div class="ddd">
        <form action="ChangeRoomInformation_Show">
            <input type="submit" value="修&nbsp;改&nbsp;房&nbsp;间&nbsp;信&nbsp;息"></input>
        </form>

        <form action="ChangePrincipalInformation_Show">
            <input type="submit" value="修&nbsp;改&nbsp;员&nbsp;工&nbsp;信&nbsp;息"></input>
        </form>

        <form action="ChangeGuestInformation_Show">
            <input type="submit" value="修&nbsp;改&nbsp;顾&nbsp;客&nbsp;信&nbsp;息"></input>
        </form>
    </div>


</body>
</html>