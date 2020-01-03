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
  		
			<!-- 查询是否成功 -->
			<s:if test="Tag==false">			
				<script type="text/javascript">
					alert("查询失败，请检查输入是否有误")
				</script>
			</s:if>
			
			<s:else><!-- 查询成功 -->
				<s:if test="FindMethod==0">
					<script type="text/javascript">
						alert("请选择查询方式")
					</script>
				
				</s:if>
				
				<s:elseif test="FindMethod==2">
					顾客信息：
					
					开房记录：
				</s:elseif>

				<s:elseif test="FindMethod==2">
					房间信息：
					
					使用记录：
				</s:elseif>
			</s:else>
		
		<!--查询表单 -->
		<s:form action="FindInformationAction">
			
			<s:select list="#{0:'选择查询方式',1:'通过身份证号查询',2:'查询房间使用记录'}" name="FindMethod"></s:select>

			<s:textfield value="输入" name="FindNum"></s:textfield>
			<s:hidden value="2" name="Page"></s:hidden><!-- 用于页面重定向的 -->
		    <s:submit value="查询"/><!-- 默认type="input" -->
		    
		</s:form>

		

</body>
</html>