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
					<a href="addstudent.jsp">ADD STUDENT</a>
				</li>
				<li>
				<!-- 	<a href="./StudentController?action=VIEWSTUDENTS">VIEW STUDENT</a> -->
				<a href="./StudentController?action=PAGINATION&page=1">listEmp</a>
				</li>
			</p>
		</td>
		<td class="contentarea">
			<div class="formdiv">
				<form action="./StudentController" method="POST">
					<table class="formtab">
						<tr>
							<td colspan="2" class="reg">
								Student Registration Form
							</td>
						</tr>
						<tr>
							<td>
								<label>Student Name</label>
							</td>
							<td>
								<input type="text" name="sname" required>
							</td>
						</tr>
						<tr>
							<td>
								<label>Student Email</label>
							</td>
							<td>
								<input type="email" name="semail" required>
							</td>
						</tr>
						<tr>
							<td>
								<label>Student Mobile</label>
							</td>
							<td>
								<input type="text" name="smobile" required>
							</td>
						</tr>
						<tr>
							<td>
								<label>Student Address</label>
							</td>
							<td>
								<input type="text" name="saddress" required>
							</td>
						</tr>
						<tr>
							<td colspan="2" class="submit">
							    <input type="hidden" name="page" value="1">
								<input type="hidden" name="action" value="ADDSTUDENT">
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