<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User center system</title>
</head>
<body>

	<%@include file="../shared/head.jsp"%>
	<br />
	<form action="login" name="login" method="post">

		<%-- <%String gender=request.getParameter("address"); %> --%>


		<%-- <c:forEach items="${map.booklist}" var="node">
 		Book Name:<c:out value="${node}">
			</c:out>
		</c:forEach> --%>
		 
  
		<select name="gender" value="${map.user.gender}">
			<option value="1" <c:if test='${map.user.gender== 1}'>selected</c:if>  >Male</option>
			<option value="2"  <c:if test="${map.user.gender==2}" >selected="selected"</c:if>  >  Female</option>
			<option value="3" <c:if test="${map.user.gender==3}" >selected="selected"</c:if>   >Other</option>
		</select> 
		${map.user.firstName} ${map.user.lastName} ${map.user.loginName }<BR>
		${map.user.address } <BR>
		<TABLE>
			<TR>
				<TD>User Name:</TD>
				<TD><input type="text" name="loginName" /></TD>
			</TR>
			<TR>
				<TD>Password:</TD>
				<TD><input type="password" /></TD>
			</TR>
			<TR>
				<TD></TD>
				<TD><input type="submit" value="Sign In"></TD>
			</TR>
		</TABLE>

	</form>

</body>
</html>