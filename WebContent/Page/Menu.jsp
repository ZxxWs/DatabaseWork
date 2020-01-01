<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客房管理系统</title>
   <link href="/SJK/Page/Css/Css.css" type="text/css" rel="stylesheet" />
    <!-- CSS样式控制 -->
 
</head>
<body>

	<div id="ShowMenu">
	       <ul id=menu>
	           <li><a href="#" id="1" > 入住登记</a> </li>
	           <li><a href="#" id="2"> 换、退、续房</a> </li>
	           <li><a href="#" id="3"> 信息查询</a> </li>
	           <li><a href="#" id="4"> 信息修改</a></li>
	           <li><a href="#" id="5"> 退出</a> </li>
	       </ul>
	</div>

 	<form id="SelectPage" action="SelectPage"  target="ShowPage">
        <!-- 隐藏表单用于传参-->
        <input type="hidden" name="Page" id="Page" value="null">
    </form>
   
  
	<script>
        OnClickLi();

        // 菜单选择函数，根据点击的菜单来显示页面
        function OnClickLi() {

            var oli = document.getElementsByTagName("li");
            for (var i = 0; i < oli.length; i++) {
                
                oli[0].onclick = function() {
                	document.getElementById("Page").value="0";
                	document.getElementById("SelectPage").submit();
                };
                oli[1].onclick = function() {
                	document.getElementById("Page").value="1";
                	document.getElementById("SelectPage").submit();
                };
                oli[2].onclick = function() {
                	document.getElementById("Page").value="2";
                	document.getElementById("SelectPage").submit();
                };
                oli[3].onclick = function() {
                	document.getElementById("Page").value="3";
                	document.getElementById("SelectPage").submit();
                };
                oli[4].onclick = function() {
                	document.getElementById("Page").value="4";
                	document.getElementById("SelectPage").submit();
                };
                
            }
        }
    </script>

</body>
</html>