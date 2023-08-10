<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
    <%@page import="com.adda.app.Bean.Employee"%>
    <%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<!DOCTYPE html>
<html>
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
					<a href="addEmp.jsp">ADD EMPLOYEE</a>
				</li>
				<li>
					<a href="./EmpController?action=VIEWEMP">VIEW STUDENT</a>
				</li>
			</p>
		</td>
		<td class="contentarea">
		<%List<Employee> list=(ArrayList)request.getAttribute("viewAllEmployee");
		%>
			<table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th class="th-sm">Name

      </th>
      <th class="th-sm">Salary

      </th>
      <th class="th-sm">Department

      </th>
      <th class="th-sm">Action

     
      
    </tr>
  </thead>
  <tbody>
  <%
  for (Employee item : list) { %>
    <tr>
      <td><%=item.getE_name() %></td>
      <td><%=item.getE_sal() %></td>
      <td><%=item.getE_depart() %></td>
     
      <td><a onclick="return confirm('are you sure update details')"class="edit" href="./EmpController?action=UPDATEEMP&eid=<%=item.getE_id()%>">EDIT</a><a class="delete" onclick="return confirm('are you sure details details')" href="./EmpController?action=DELETEEMP&eid=<%=item.getE_id()%>">DELETE</a></td>
    </tr>
    <%
    }%>
   
</table>
		</td>
	</tr>
	<tr class="footer">
		<td class="footertab" colspan="2"></td>
	</tr>
</table>
</body>

</html>