<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <link href="/SJK/Page/Css/Css2.css" type="text/css" rel="stylesheet" />
<title>信息查询</title>
</head>
<!-- 信息查询页面 -->
<body>
<iframe id="ShowPag" name="ShowPag" src="/SJK/Page/Menu.jsp" noresize="noresize"></iframe>
  


		

		<s:form action="FindAction"><!-- submit标签必须放在form标签下才会显示并起作用 -->
			
			<s:select list="#{0:'选择查询方式',1:'通过身份证号查询',2:'查询房间使用记录'}" name="SeletMothod"></s:select>

			<s:textfield value="输入"></s:textfield>
		
		    <s:submit value="查询"/><!-- 默认type="input" -->
		    
		</s:form>

	

</body>
</html>