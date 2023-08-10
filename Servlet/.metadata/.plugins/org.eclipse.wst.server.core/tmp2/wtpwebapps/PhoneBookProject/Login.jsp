


<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>LOGIN PAGE</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="./assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="./assets/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<!-- endinject -->
<!-- Layout styles -->
<link rel="stylesheet" href="./assets/css/style.css">
<!-- End layout styles -->
<link rel="shortcut icon" href="./assets/images/favicon.ico" />
</head>
<style>
.auth .auth-form-light {
	background: #ffffff;
	border-radius: 10px;
}

.auth form .auth-form-btn {
	height: 50px;
	width: 100%;
	line-height: 1.5;
}

.btn-gradient-primary {
	background: -webkit-gradient(linear, left top, right top, from(#da8cff),
		to(#9a55ff));
	background: linear-gradient(to right, #6073e3, #6073e3);
	border: 0;
	-webkit-transition: opacity 0.3s ease;
	transition: opacity 0.3s ease;
}
p.error {
    color: red;
    border: 2px solid dotted;
    border: dotted;
    width: 215px;
}

.auth .brand-logo {
	margin-bottom: 2rem;
	display: flex;
	justify-content: center;
}
</style>
<body>


	<div class="container-scroller">
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth">
				<div class="row flex-grow">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left p-5">
							<div class="brand-logo">
								<img src="./assets/images/logo2.png"
									style="width: 50%; height: 50%;">
							</div>

							<form class="pt-3" action="./PhoneBookController" method="post">
								<div class="form-group">
									<input type="email" class="form-control form-control-lg"
										id="exampleInputEmail1" name="Email"
										placeholder="Enter Email Id">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-lg"
										id="exampleInputPassword1" name="Password"
										placeholder="Enter Password">
								</div>
								<div class="mt-3">
									<input type="hidden" value="LOGIN" Class="formController"
										name="Action">
									<button
										class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn"
										href="./PhoneBookController">SIGN IN</button>
										<%if(request.getAttribute("msg")!=null) {%>
										
									 	<p class="error"><%=request.getAttribute("msg") %></p> 
										<%} %>
								</div>
								<div class="my-2 d-flex justify-content-center align-items-center">
									<!-- <div class="form-check">
                      <label class="form-check-label text-muted">
                        <input type="checkbox" class="form-check-input"> Keep me signed in </label>
                    </div> -->     
                        
                                
									<a href="Usersignup.jsp " >Create new Account</a><a
										href="forget.html" class="auth-link"
										style="color: #6073e3; margin-top: 3rem; font-weight: 200; font-size: 1rem; text-align: center;">Forgot
										password?</a>

								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="../../assets/vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="../../assets/js/off-canvas.js"></script>
	<script src="../../assets/js/hoverable-collapse.js"></script>
	<script src="../../assets/js/misc.js"></script>
	<!-- endinject -->
</body>
</html>
