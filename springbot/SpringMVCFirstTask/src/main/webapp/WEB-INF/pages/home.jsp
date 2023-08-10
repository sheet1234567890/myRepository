<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>
	<p>WelCome My First Crud Operation</p>
	<button><a href="/saveEmployee" >ADD STUDENT</a></button>
	<table border=1>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>PASSWORD</th>
			<th>DEPARTMENT</th>
			<th>ADDRESS</th>
		<th>ACTION</th>
		</tr>
		<c:forEach var="ob" items="${Emplist}">
			<tr>
				<td>${ob.emp_id}</td>
				<td>${ob.emap_name}</td>
				<td>${ob.emp_sal}</td>
				<td>${ob.emp_pwd}</td>
				<td>${ob.emp_dept}</td>
				<td>${ob.emp_adddress}</td>
				<td><a href="/edit/${ob.emp_id }">EDIT</a>|<a href="/delete/${ob.emp_id}">DELETE</a></td>
			</tr>
		</c:forEach>
		<h1>
		 <%
		 String msg = (String)session.getAttribute("msg");
		 if(msg!=null)
		 {
			 out.println(msg);
			 session.removeAttribute("msg");
		 }
		 else{
			 out.println(" ");
		 }
		 %></br>
		
		</h1>
	</table>
	
</body>
</html>