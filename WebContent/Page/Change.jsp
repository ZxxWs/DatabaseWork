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
        
        <form  action="ChangePassWordInformation" id="ChangePassWordInformation">
        	<input type="button" value="修改密码" onclick="Change()">
        	<input type="hidden" name="Pass" id="Pass">
        </form>
        
    </div>



	<script type="text/javascript">

		var c="<s:property value="IsSuccess"/>"
		if(c==1){
			alert("修改成功")
		}else if(c==-1){
			alert("修改失败")
		}
		
	
		function Change() {
		    var Pass
		    Pass = prompt("请输入修改后的密码", "");
		    if (Pass != null) {
		        var Pass1
		        Pass1 = prompt("请确认修改后的密码", "");
		
		        if (Pass == Pass1) {
		            var Sure = confirm("确定修改")
		            if (Sure == true) {
		                document.getElementById("Pass").value = Pass;
		                document.getElementById("ChangePassWordInformation").submit();
		            }
		        } else {
		            alert("两次的密码不一样")
		        }
		    }
		}
		
	</script>

</body>
</html>