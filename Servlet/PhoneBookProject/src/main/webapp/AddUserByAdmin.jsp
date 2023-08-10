<%@page import="com.adda.app.Bean.User" %>
<%@page import="com.adda.app.Bean.Group" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>USER</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="./assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="./assets/vendors/css/vendor.bundle.base.css">
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
    background: -webkit-gradient(linear, left top, right top, from(#da8cff), to(#9a55ff));
    background: linear-gradient(to right, #6073e3, #6073e3);
    border: 0;
    -webkit-transition: opacity 0.3s ease;
    transition: opacity 0.3s ease;
}
.auth .brand-logo {
    margin-bottom: 2rem;
    display: flex;
    justify-content: center;
}
.error {
    color: red;
    font-size: 10px;
    padding-left: 16px;
}

  </style>
<%--   <body>
  <%User u = (User)request.getAttribute("user"); %>
   
  
                <form class="pt-3" action="./PhoneBookController" method="post">
                  <div class="form-group">
                    <input type="text" class="form-control form-control-lg" id="exampleInputName" name="Name" placeholder="Enter Name " required>
                    
                  </div>
                  <div class="form-group">
                    <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" name="Email" placeholder="Enter Email Id" required>
                  </div>
                   <div class="form-group">
                    <input type="text" class="form-control form-control-lg" id="exampleInputAddress" name="Address" placeholder="Enter Address " required>
                  </div>
                   <div class="form-group">
                    <input type="number" class="form-control form-control-lg" id="exampleInputMobaile" name="Mobile" placeholder="Enter Mobaile"  pattern=" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
                  </div>
                  <div class="form-group">
                    <input type="password" class="form-control form-control-lg" id="exampleInputPassword" name="Password" placeholder="Enter Password" required>
                  </div>
                   <div class="form-group">
                    <input type="hidden" class="form-control form-control-lg" id="exampleInputRole" name="Role" placeholder="Enter Role" value="user">
                  </div>
                  <div class="mt-3">
                    <button class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn" >SIGN IN</a>
                  </div>
                  <div><input type ="hidden" value="ADDUSERBYADMIN" Class="formController" name ="Action"> </div>
                  <div class="my-2 d-flex justify-content-center align-items-center">
                    <!-- <div class="form-check">
                      <label class="form-check-label text-muted">
                        <input type="checkbox" class="form-check-input"> Keep me signed in </label>
                    </div> -->
                  
               <a href="forget.html" class="auth-link" style="color: #6073e3;margin-top:3rem;font-weight:200;font-size:1rem;text-align: center;">Forgot password?</a>
              
                  </div>
                 <div>
                 
                 <a href="Login.jsp">LOGINUP</a>
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
    <!-- endinject --> --%>
    <body>
     <body>
    <div class="container-scroller">
      <div class="container-fluid page-body-wrapper full-page-wrapper">
        <div class="content-wrapper d-flex align-items-center auth">
          <div class="row flex-grow">
            <div class="col-lg-4 mx-auto">
              <div class="auth-form-light text-left p-5">
                <div class="brand-logo">
                  <img src="./assets/images/logo2.png" style="width:50%;height:50%;">
                </div>
               <%User u = (User)request.getAttribute("user"); %>
                <form class="pt-3" action="./PhoneBookController" method="post">
                  <div class="form-group">
                    <input type="text" class="form-control form-control-lg" id="exampleInputName" name="Name" placeholder="Enter Name " required>
                    <span id="nameError" class="error"></span>
                  </div>
                  <div class="form-group">
                    <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" name="Email" placeholder="Enter Email Id" required  >
                      <%if(request.getAttribute("msg")!=null) {%>
										<p class="error"><%=request.getAttribute("msg") %></p>
										<%} %>  
                  </div>
                   <div class="form-group">
                    <input type="text" class="form-control form-control-lg" id="exampleInputAddress" name="Address" placeholder="Enter Address " placeholder="Enter your Address" required>
                  </div>
                   <div class="form-group">
                    <input type="number" class="form-control form-control-lg" id="exampleInputMobaile" name="Mobile" placeholder="Enter Mobaile" required>
                    <span id ="mobileError" class="error"></span>
                  </div>
                  <div class="form-group">
                    <input type="password" class="form-control form-control-lg" id="exampleInputPassword" name="Password" placeholder="Enter Password" required>
                    <span id="passError" class="error"></span>
                  </div>
                   <div class="form-group">
                    <input type="hidden" class="form-control form-control-lg" id="exampleInputRole" name="Role" placeholder="Enter Role" value="user">
                  </div>
                  <!-- <div class="mt-3">
                    <button class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn" >SIGN IN</a></button>
                      
                           
                  </div>
                  <div><input type ="hidden" value="ADDUSER" Class="formController" name ="Action"> </div>
                  <div class="my-2 d-flex justify-content-center align-items-center">
                    <div class="form-check">
                      <label class="form-check-label text-muted">
                        <input type="checkbox" class="form-check-input"> Keep me signed in </label>
                    </div>  <a href="Login.jsp">LOGINUP</a>
                  
               <a href="forget.html" class="auth-link" style="color: #6073e3;margin-top:3rem;font-weight:200;font-size:1rem;text-align: center;">Forgot password?</a>
              
                  </div>
                 <div> -->
                 
                 
                 
                 
                 <div class="mt-3">
									<input type="hidden" value="ADDUSERBYADMIN" Class="formController"
										name="Action">
									<button
										class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn"  onclick="return validation()"   
									>SIGN IN</button>
										
								</div>
                 
                 <div>
                 
                 
                 <a href="Login.jsp">LOGINUP</a>
                </div>
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

  <script>
  function validation(){
	    var mobile = document.getElementById("exampleInputMobaile");
	    var mobileError = document.getElementById("mobileError");
	    
	    var name = document.getElementById("exampleInputName");
	    var nameError = document.getElementById("nameError");
	    
	    var pass = document.getElementById("exampleInputPassword");
	    var passError=document.getElementById("passError");
	    
	    var temp=true;
	    if(!validateMobile(mobile.value))	
		{
			mobileError.innerText="Invalid mobile number";
			temp=false;
		}
		else
		{
			mobileError.innerText="";
		}
		if(name.value.length<3)
		{
			nameError.innerText="Atleast 3 char required ";
			temp=false;
		}
		else
		{
			nameError.innerText=""
		}
		if(pass.value.length<4)
		{
			passError.innerText="Atleast 4 char required ";
			temp=false;
		}
		else
		{
			passError.innerText=""
		}
		
		return temp;

	    }
	    function validateMobile(mobileNumber)
	    {
	    	var regm = /^(1\s?)?(\(\d{3}\)|\d{3})[\s\-]?\d{3}[\s\-]?\d{4}$/;
	    	var regmob = new RegExp(regm);
	    	if(regmob.test(mobileNumber))
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }
	   
 
  
  </script>
  </body>
  
  
</html>