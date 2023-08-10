<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="Component/AllCss.jsp" %>
<style type="text/css">

.back-img{
background: url("image/phone.jpg");
width:100%;
height:80vh;
background-repeat: no-repeat;
background-size: center;

}

</style>
</head>
<body>
<%@include file="Component/navbar.jsp" %>
  <div class="Container back-img text-center ">
  <h1>WELCOME TO PHONEBOOK APP</h1>
  </div>
    <%@include file="Component/footer.jsp" %>
</body>
</html>