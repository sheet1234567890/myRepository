<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER RAGISTRATION</title>
<%@include file="Component/allcss.jsp" %>
<style type="text/css">
.paint-card
{
   box-shadow:0 0 10px 0 rgba(0,0,0,0.5)
}
</style>
</head>
<body>
<%@include file="Component/navbar.jsp"%>
<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">USER RAGISTRATION</p>

						<form action="./HospitalController" method="post">
						<div class="mb-3">
								<lable class="form-lable">Full Name</lable>
								<input required name="name" type="text" class="form-control">
							</div>
							<div class="mb-3">
								<lable class="form-lable">Email Address</lable>
								<input required name="email" type="email" class="form-control">
							</div>
							<div class="mb-3">
								<lable class="form-lable">Password</lable>
								<input required name="password" type="password"
									class="form-control">
							</div>
							<input type = "hidden" name="Action" value="ADDUSER">
							<button type="submit" class="btn bg-success text-white col-md-12">Ragister</button>
						</form>
					</div>
				</div>
			</div>

		</div>

	</div>

</body>
</html>