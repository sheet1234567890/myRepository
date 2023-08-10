
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
    <%@page import="com.dollop.app.bean.Student"%>
    <%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org/">>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home Page</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	
</script>
</head>
<body>
<table class="maintab">
	<tr class="header">
		<td class="headetab" colspan="2">
			<img class="clogo" src="./images/logo.png" alt="c-logo">
		</td>
	</tr>
	<tr class="middle">
		<td class="leftsidebar">
			<p class="navbar">
				<li>
					<a href="addstudent.jsp">ADD STUDENT</a>
				</li>
				<li>
					<!-- <a href="./StudentController?action=VIEWSTUDENTS">VIEW STUDENT</a> -->
					<a href="./StudentController?action=PAGINATION&page=1">listEmp</a>
				</li>
			</p>
		</td>
		<td class="contentarea">
		<%-- <%List<Student> list=(ArrayList)request.getAttribute("viewAllStudents");
		%> --%>
		 <%List<Student> list=(ArrayList)request.getAttribute("list");
		%> 
		
			<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th class="th-sm">Name

      </th>
      <th class="th-sm">Email

      </th>
      <th class="th-sm">Mobile

      </th>
      <th class="th-sm">Address

      </th>
       <th class="th-sm">Action

      </th>
      
    </tr>
  </thead>
  <tbody>
  <%
  for (Student item : list) { %>
    <tr>
      <td><%=item.getSname()%></td>
      <td><%=item.getSemail()%></td>
      <td><%=item.getSmobile()%></td>
      <td><%=item.getSaddress()%></td>
      <td><a onclick="return confirm('are you sure update details')"class="edit" href="./StudentController?action=UPDATESTUDENT&id=<%=item.getSid()%>">EDIT</a><a class="delete" href="./StudentController?action=DELETESTUDENT&id=<%=item.getSid()%>">DELETE</a></td>
    </tr>
    
    <%
    }%>
  
</table>
Total Rows:<%=request.getAttribute("totalrow") %>
Total Page:<%=request.getAttribute("totalpage") %>
NEXT:<%=request.getAttribute("page") %>

<!--  <a  href="./StudentController?action=PAGINATION&page=2">2</a>..............................................
  <a  href="./StudentController?action=PAGINATION&page=3">3</a>*********************************************** -->
		</td>
	</tr>
	<tr class="footer">
		<td class="footertab" colspan="2"></td>
	</tr>
</table>
</body>

</html>