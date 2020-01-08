<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <link href="/SJK/Page/Css/login.css" type="text/css" rel="stylesheet" />


<title>登陆</title>
 <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }
        
        body {
            color: white;
        }
        
        .content {
            background-color: pink;
            position: absolute;
            /*绝对定位*/
            top: 50%;
            left: 0;
            width: 100%;
            height: 400px;
            margin-top: -200px;
            overflow: hidden;
        }
        
        .main {
            text-align: center;
            max-width: 600px;
            height: 400px;
            padding: 100px 0px;
            margin: 0 auto;
        }
        
        .main h1 {
            font-family: "华文行楷";
            font-size: 65px;
            font-weight: 2px;
        }
        
        form {
            padding: 20px 0;
        }
        
        form input {
            border: 1px solid white;
            display: block;
            margin: 0px auto 10px auto;
            /*上 右  下 左*/
            padding: 10px;
            width: 220px;
            border-radius: 30px;
            font-size: 18px;
            font-weight: 300;
            text-align: center;
        }
        
        form input:hover {
            background-color: pink;
        }
        
        form button {
            background-color: yellow;
            border-radius: 10px;
            border: 0;
            height: 30px;
            width: 50px;
            padding: 5px 10px;
        }
        
        form button:hover {
            background-color: red;
        }
    </style>
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