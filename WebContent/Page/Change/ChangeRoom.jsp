<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改信息</title>
</head>
<body>

	<%//获取需要Crud的房间的信息
		String Crud=request.getParameter("Crud");
		String Rno=request.getParameter("Rno");
		String Rtype=request.getParameter("Rtype");
		String Rprice=request.getParameter("Rprice");
		String Rcondition=request.getParameter("Rcondition");
		String Pno=request.getParameter("Pno");
		
		int IntTpye;
		if(Rtype.equals("单人间")){
			IntTpye=0;
		}else if(Rtype.equals("双人间")){
			IntTpye=1;
		}else if(Rtype.equals("单人钟点房")){
			IntTpye=2;
		}else{
			IntTpye=3;
		}
		request.setAttribute("Crud",Crud);
		request.setAttribute("Rno",Rno);
		request.setAttribute("Rtype",Rtype);
		request.setAttribute("Rprice",IntTpye);
		request.setAttribute("Rcondition",Rcondition);
		request.setAttribute("Pno",Pno);
	%>

	<!-- 修改房间信息 -->
	<s:form action="ChangeRoomInformation"><!-- 修改信息表单 -->
		<s:textarea name="NewRno" value="%{#request.Rno}"></s:textarea>
		<s:textarea name="Rprice" value="%{#request.Rprice}"></s:textarea>
		<s:select list="#{0:'单人间',1:'双人间',2:'单人钟点房',3:'双人钟点房'}" name="Rtype" value="%{#request.Rtype}"></s:select>
		<s:select list="#{0:'空房',1:'房间有人'}" name="Rcondition" value="%{#request.Rcondition}"></s:select>
		<s:hidden name="OldRno" value="%{#request.Rno}"></s:hidden>
		<s:hidden name="Crud" value="C"></s:hidden><!-- 用于标记是Crud中的哪个 -->
	    <s:submit value="确认修改"/><!-- 默认type="input" -->
	</s:form>
		
		
		
		
	<!-- 删除此房间 -->
	 <form action="ChangeRoomInformation" id="DelRoom">
        <input type="hidden" name="Crud" value='D'/><br>
        <input type="hidden" name="OldRno" value='<%=request.getParameter("Rno")%>'/><br>
        <input type="button" value="删除此房间" onclick="DelRoom()" /><br>
	 </form>




	<script type="text/javascript">
	  function DelRoom() {
		  var SureDel=confirm("确定删除房间信息")
			if(SureOut==true){
				 var form = document.getElementById('DelRoom');
			     form.submit();
			}
	  }
	</script>

</body>
</html>




















