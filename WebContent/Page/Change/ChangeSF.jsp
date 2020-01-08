<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

请关闭此页面


</body>
<script type="text/javascript">
		var c = '<s:property value="IsSuccess"/>';
		if (c == 1) {
			alert("修改员工信息成功")
		} else if (c == -1) {
			alert("修改员工信息失败")
		} else if (c == -2) {
			alert("删除失败")
		} else if (c == 2) {
			alert("删除成功")
		} else if (c == -3) {
			alert("添加失败")
		} else if (c == 3) {
			alert("添加成功")
		}

	
	</script>



</html>