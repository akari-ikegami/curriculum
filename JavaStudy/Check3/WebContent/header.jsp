<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
</head>
<body>

<header>

<div class="wrapper">
	<label><div class="header">login</div>
		<div class="date">
			<% Date date = new Date();
      		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      		String formatDate = sdf.format(date);
  		 out.print(formatDate); %>
		</div>
	</label>
	
</div>


</header>

<!-- </body>
</html> -->