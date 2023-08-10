<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
					<a href="addEmp.jsp">ADD STUDENT</a>
				</li>
				<li>
					<a href="./EmpController?action=VIEWEMP">VIEW STUDENT</a>
				</li>
			</p>
		</td>
		<td class="contentarea">
			<div class="formdiv">
				<form action="./EmpController" method="POST">
					<table class="formtab">
						<tr>
							<td colspan="2" class="reg">
								<marquee class = "mar">Employee Registration Form</marquee>
							</td>
						</tr>
						<tr>
							<td>
								<label>Employee Name</label>
							</td>
							<td>
								<input type="text" name="ename" required>
							</td>
						</tr>
						<tr>
							<td>
								<label>Student Salary</label>
							</td>
							<td>
								<input type="text" name="esal" required>
							</td>
						</tr>
						<tr>
							<td>
								<label>Student Department</label>
							</td>
							<td>
								<input type="text" name="edepartment" required>
							</td>
						</tr>
						
						<tr>
							<td colspan="2" class="submit">
								<input type="hidden" name="action" value="ADDEMP">
								<input type="submit" name="add" value="SUBMIT">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</td>
	</tr>
	<tr class="footer">
		<td class="footertab" colspan="2"></td>
	</tr>
</table>
</body>
</html>