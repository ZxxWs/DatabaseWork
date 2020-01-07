<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <link href="/SJK/Page/Css/login.css" type="text/css" rel="stylesheet" />


<title>登陆</title>
</head>
<body>
  <div class="content" >
        <div class="main">
            <h1>欢迎进入金源大酒店</h1>
            <form name="Login" action="login" method="POST">
                <input type="Password" name="Password" placeholder="请输入密码">
                <button type="submit">登&nbsp;&nbsp;录</button>
            </form>
        </div>
    </div>
    
    
    <script type="text/javascript">
		if("<s:property value="Cond"/>"==1){
			alert("登陆失败，请检查密码。")
		}

    </script>
    
    
</body>
</html>