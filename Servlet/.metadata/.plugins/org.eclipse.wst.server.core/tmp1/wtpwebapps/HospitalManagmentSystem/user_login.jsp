<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User_Login</title>
<%@include file="Component/allcss.jsp"%>
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
						<p class="fs-4 text-center">USER LOGIN</p>

						<form action="#" method="post">
							<div class="mb-3">
								<lable class="form-lable">Email Address</lable>
								<input required name="email" type="email" class="form-control">
							</div>
							<div class="mb-3">
								<lable class="form-lable">Password</lable>
								<input required name="email" type="password"
									class="form-control">
							</div>
							<button type="submit" class="btn bg-success text-white col-md-12">LOGIN</button>
						</form>
						<br>Don't have an Account ?<a href="signup.jsp" class="text-decoration-none">Create One</a>
						
					</div>
				</div>
			</div>

		</div>

	</div>


</body>
</html>