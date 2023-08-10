<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home Page</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
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
		        
		<td class="contentarea"></td>
	</tr>
	<tr class="footer">
	
		<td class="footertab" colspan="2"></td>
	</tr>
</table>
</body>
</html>