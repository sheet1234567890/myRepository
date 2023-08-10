<%@page import="com.adda.app.Bean.User" %>
<%@page import="com.adda.app.Bean.Group" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>USER PROFILE UPDATE</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="./assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="./assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <!-- End Plugin css for this page -->
    <!-- inject:css -->
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="./assets/css/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="./assets/images/favicon.ico" />
    <link rel="shortcut icon" href="assets/images/favicon.ico" />
    
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
     <!-- modal -->
     <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
     <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
     <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
     <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  </head>
<style>
  /* password change */
.mainDiv {
    display: flex;
    min-height: 100%;
    align-items: center;
    justify-content: center;
    background-color: #f9f9f9;
    font-family: 'Open Sans', sans-serif;
  }
 .cardStyle {
  width: 381px;
    border-color: white;
    /* background: #fff; */
    /* padding: 36px 0; */
    border-radius: 4px;
    margin: 30px 0;
    box-shadow: 0px 0 2px 0 rgba(0,0,0,0.25);
  }
#signupLogo {
  max-height: 100px;
  margin: auto;
  display: flex;
  flex-direction: column;
}
.formTitle{
  font-weight: 600;
  margin-top: 20px;
  color: #2F2D3B;
  text-align: center;
}
.inputLabel {
  font-size: 12px;
  color: #555;
  margin-bottom: 6px;
  margin-top: 24px;
}
  .inputDiv {
    width: 70%;
    display: flex;
    flex-direction: column;
    margin: auto;
  }
input {
  height: 40px;
  font-size: 16px;
  border-radius: 4px;
  border: none;
  border: solid 1px #ccc;
  padding: 0 11px;
}
input:disabled {
  cursor: not-allowed;
  border: solid 1px #eee;
}
.buttonWrapper {
  margin-top: 40px;
}
  .submitButton {
    width: 70%;
    height: 40px;
    margin: auto;
    display: block;
    color: #fff;
    background-color: #065492;
    border-color: #065492;
    text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.12);
    box-shadow: 0 2px 0 rgba(0, 0, 0, 0.035);
    border-radius: 4px;
    font-size: 14px;
    cursor: pointer;
  }
.submitButton:disabled,
button[disabled] {
  border: 1px solid #cccccc;
  background-color: #cccccc;
  color: #666666;
}

#loader {
  position: absolute;
  z-index: 1;
  margin: -2px 0 0 10px;
  border: 4px solid #f3f3f3;
  border-radius: 50%;
  border-top: 4px solid #666666;
  width: 14px;
  height: 14px;
  -webkit-animation: spin 2s linear infinite;
  animation: spin 2s linear infinite;
}

@keyframes spin {
    0% { transform: rotate(0deg); }
    100% { transform: rotate(360deg); }
}
.inputLabel{
  text-align: initial;
}
.navbar .navbar-menu-wrapper .search-field .input-group input {
    font-size: 1.5rem;
    padding: 0.5rem;
}
</style>
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
  </style>
  <style>
    body {
        background:lavender;
    }
    
    .form-control:focus {
        box-shadow: none;
        border-color: #BA68C8
    }
    
    .profile-button {
        background: rgb(99, 39, 120);
        box-shadow: none;
        border: none
    }
    
    .profile-button:hover {
        background: #682773
    }
    
    .profile-button:focus {
        background: #682773;
        box-shadow: none
    }
    
    .profile-button:active {
        background: #682773;
        box-shadow: none
    }
    .error {
    color: red;
    font-size: 10px;
    padding-left: 16px;
}
    .back:hover {
        color: #682773;
        cursor: pointer
    }
    
    .labels {
        font-size: 11px
    }
    
    .add-experience:hover {
        background: #BA68C8;
        color: #fff;
        cursor: pointer;
        border: solid 1px #BA68C8
    }
    .profile-pic {
        border-radius: 50%;
        height: 181px;
        width: 181px;
        background-size: cover;
        background-position: center;
        background-blend-mode: multiply;
        vertical-align: middle;
        text-align: center;
        color: transparent;
        transition: all .3s ease;
        text-decoration: none;
        cursor: pointer;
        background-color: lavender;
    }
    
    .profile-pic:hover {
        background-color: rgba(0,0,0,.5);
        z-index: 10000;
        color: #fff;
        transition: all .3s ease;
        text-decoration: none;
    }
    
    .profile-pic span {
        display: inline-block;
        /* padding-top: 4.5em; */
        padding-bottom: 4.5em;
    }
    
    form input[type="file"] {
              display: none;
              cursor: pointer;
     }
     .page-title {
    color: #343a40;
    font-size: 2.125rem;
    margin-bottom: 0;
}
@media only screen and (max-width: 400px) {
    .content-wrapper {
    background: #f2edf3;
    padding:0px;
    width: 100%;
    -webkit-box-flex: 1;
    -ms-flex-positive: 1;
    flex-grow: 1;
}
}
  
    </style>
  <body>
  <%User user = (User)request.getAttribute("user"); %>
    <%ArrayList<Group> glist = (ArrayList<Group>)request.getAttribute("glist"); %> 
    <div class="container-scroller">
      <!-- partial:../../partials/_navbar.html -->
      <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
        <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
          <a class="navbar-brand brand-logo" href=" # "><img src="./assets/images/logo2.png" alt="logo" aspect-ratio=167/419 style="height:66px;width:172px;"></a>
          <a class="navbar-brand brand-logo-mini" href="#  "><img src="./assets/images/logo-mini.svg" alt="logo" /></a>
        </div>
        <div class="navbar-menu-wrapper d-flex align-items-stretch">
          <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
            <span class="mdi mdi-menu"></span>
          </button>
          <div class="search-field d-none d-md-block">
            <form class="d-flex align-items-center h-100" action="#">
              <div class="input-group">
                <div class="input-group-prepend bg-transparent">
                  <i class="input-group-text border-0 mdi mdi-magnify"></i>
                </div>
                <input type="text" class="form-control bg-transparent border-0" placeholder="Search projects">
              </div>
            </form>
          </div>
          <ul class="navbar-nav navbar-nav-right">
            <li class="nav-item nav-profile dropdown">
              <a class="nav-link dropdown-toggle" id="profileDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                <div class="nav-profile-img">
                  <img src="./assets/images/faces/face1.jpg" alt="image">
                  <span class="availability-status online"></span>
                </div>
                <div class="nav-profile-text">
                  <p class="mb-1 text-black"><%=user.getuName() %></p>
                </div>
              </a>
              <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">
                <a class="dropdown-item" href="./PhoneBookController?Action=GETUSER" style="color: #2F2D3B;">
                  <i class="fa fa-user-circle-o me-2" style="color:rgb(88, 124, 241)"></i>Profile</a>
                  <a class="dropdown-item"  href="#myModal2"  data-toggle="modal" style="color: #2F2D3B;">
                    <i class="fa fa-lock me-2" style="color:rgb(96, 129, 236)"></i> Password Change</a>
                    <a class="dropdown-item"  href="./PhoneBookController?Action=USERDELETE"  style="color: #2F2D3B;" >
                    <i class="fa fa-lock me-2" style="color:rgb(96, 129, 236)"></i> Delete Account</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="./PhoneBookController?Action=LOGOUT" style="color: #2F2D3B;">
                  <i class="mdi mdi-logout me-2" style="color:rgb(96, 129, 236)"></i> Logout </a>
              </div>
            </li>
            
          </ul>
          <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
            <span class="mdi mdi-menu"></span>
          </button>
        </div>
      </nav>
      <!-- partial -->
       <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_sidebar.html -->
        <nav class="sidebar sidebar-offcanvas" id="sidebar">
          <ul class="nav">
         
            <li class="nav-item">
              
              <a class="nav-link" href="./PhoneBookController?Action=DESBOARD1">
                
                <span class="menu-title"><i class="fa fa-dashboard" style="font-size:20px;"></i>&nbsp;Dashboard</span>
              
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" data-bs-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                <span class="menu-title"> <i class="fa fa-tablet" style="font-size:20px"></i>&nbsp;Application Registration</span>
                <i class="menu-arrow"></i>
              
              </a>
              <div class="collapse" id="ui-basic">
                <ul class="nav flex-column sub-menu">
                  <li class="nav-item"> <a class="nav-link" href="./PhoneBookController?Action=TOCREATCONTECT">Create no</a></li>
                  <li class="nav-item"> <a class="nav-link" href="./PhoneBookController?Action=TOVIEWCONTECT">View no</a></li>
                    <li class="nav-item"> <a class="nav-link" href="./PhoneBookController?Action=TOCREATEGROUP">Create group</a></li> 
                </ul>
              </div>
            </li>
           <!--  <li class="nav-item">
              <a class="nav-link" data-bs-toggle="collapse" href="#ui-basic1" aria-expanded="false" aria-controls="ui-basic1">
                <span class="menu-title">  <i class="	fa fa-line-chart" style="font-size:20px"></i>&nbsp;MY GROUP</span>
                <i class="menu-arrow"></i>
              </a>
              <div class="collapse" id="ui-basic1">
                <ul class="nav flex-column sub-menu">
                  <li class="nav-item"> <a class="nav-link" href="./PhoneBookController?Action=TOCREATEGROUP">Create group</a></li> -->
                  <!-- <li class="nav-item"> <a class="nav-link" href="pages/ui-features/plan.html">Plan Selection</a></li>
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/income.html">Income Details</a></li>
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/education.html">Education Details</a></li>
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/kids.html">Kids Details</a></li>
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/summary.html">Summary Screen</a></li> -->
              <!--   </ul>
              </div>
            </li> -->
            <li class="nav-item">
              <a class="nav-link" data-bs-toggle="collapse" href="#ui-basic2" aria-expanded="false" aria-controls="ui-basic2">
                <span class="menu-title"><i class="fa fa-th-large" style="font-size:20px"></i>&nbsp;View Group</span>
                <i class="menu-arrow"></i>
              </a>
              <div class="collapse" id="ui-basic2">
                <ul class="nav flex-column sub-menu">
                  <%for(Group group:glist) 
                   {
                   %>
                   <li class ="nav-item"><a class="nav-link" href="./PhoneBookController?Action=GETGROUP&gid=<%=group.getgId()%>"><%=group.getgName() %></a></li>
                   
                   <%} %>
                </ul>
              </div>
            </li>
           
         <%if(user.getuRole().equals("admin")) {%>
               
            <li class="nav-item">
              <a class="nav-link" data-bs-toggle="collapse" href="#general-pages" aria-expanded="false" aria-controls="general-pages">
                <span class="menu-title"><i class="fa fa-bars" style="font-size:20px"></i>&nbsp;Total User:-   <%= request.getAttribute("count") %></span> </a></li>
                <!-- <i class="menu-arrow"></i>
               -->
             <!--  </a> -->
             <!--  <div class="collapse" id="general-pages">
                <ul class="nav flex-column sub-menu">
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/viewnotic.html">Correspondence</a></li>
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/viewnotic.html">Pending Notices</a></li>
                  <li class="nav-item"> <a class="nav-link" href="pages/ui-features/viewnotic.html">History Notices</a></li>
                 
                </ul>
              </div> -->
          <!--   </li> -->
            <!--
          
            <li class="nav-item">
              <a class="nav-link" href="pages/ui-features/insurance.html">
                <span class="menu-title">  <i class="fas fa-award" style="font-size:20px"></i> &nbsp;Benifit Issuance</span>
              
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="pages/ui-features/reports.html">
                <span class="menu-title"> <i class="fa fa-edit" style="font-size:20px"></i>&nbsp;Reports</span>
              
              </a>
            </li> -->
             
            <li class="nav-item">
              <a class="nav-link" data-bs-toggle="collapse" href="#ui" aria-expanded="false" aria-controls="ui-basic">
                <span class="menu-title"> <i class="fa fa-edit" style="font-size:20px"></i>&nbsp;Admin</span>
                <i class="menu-arrow"></i>
              
              </a>
              <div class="collapse" id="ui">
                <ul class="nav flex-column sub-menu">
                  <li class="nav-item"> <a class="nav-link" href="./PhoneBookController?Action=AUBYADMIN">Create Account</a></li>
                  <li class="nav-item"> <a class="nav-link" href="./PhoneBookController?Action=TOVACCOUNTBYADMIN">View Account</a></li>
                </ul>
              </div>
            </li>
              <%} %>
          </ul>
        </nav>
        <!-- partial -->
        <div class="main-panel">
          <div class="content-wrapper">
          
            <div class="row">
              <div class="col-12 grid-margin stretch-card">
                <div class="page-header">
                    <h3 class="page-title">
                        <i class="fa fa-user-circle-o me-2" style="color:rgb(88, 124, 241)"></i>Profile</a>
                    </h3>
                    <nav aria-label="breadcrumb">
                      <ul class="breadcrumb">
                        <li class="breadcrumb-item active" aria-current="page">
                        
                        </li>
                      </ul>
                    </nav>
                  </div>
              </div>
          </div>
            <div class="container-scroller">
                <div class="container-fluid page-body-wrapper full-page-wrapper">
                  <div class="content-wrapper d-flex align-items-center auth">
                    <div class="row flex-grow">
                      <div class="col-12 mx-auto">
                        <div class="auth-form-light text-left p-5">
                          <form action="upload.php" method="post" enctype="multipart/form-data" style="display: flex;justify-content: center;">
                              <label for="fileToUpload">
                                 
                            <div class="profile-pic" style="background-image: url('../login/download.png')">
                                <span class="glyphicon glyphicon-camera"></span>
                                <span>Change Image</span>
                            </div>
                            </label>
                            <input type="File" name="fileToUpload" id="fileToUpload">
                          </form><br>
                          <h4 class="text-center">Profile Settings</h4>
                          <form class="pt-3" action="./PhoneBookController">
                              <div class="row mt-2">
                                  <div class="col-md-6"><label class="labels">Name</label><input type="text"  name="Name"  id="cname"  class="form-control"  value='<%=user.getuName()%>'   >
                                  <span id="nameError" class="error"></span>
                                  </div>

                                  <div class="col-md-6"><label class="labels">Address</label><input type="text"   name="Address"  class="form-control"  value='<%=user.getuAddress()%>'  ></div>
                              </div>
                              <div class="row mt-2">
                                <div class="col-md-6"><label class="labels">Mobile Number</label><input type="number" name="Mobile" id="moNo" class="form-control" value='<%=user.getuMobile() %>'   required>
                                <span id="mobileError" class="error"></span>
                                </div>
                                <div class="col-md-6"><label class="labels">Gmail</label><input type="gmail" name="Email" class="form-control" value='<%=user.getuEmail() %>'   required></div>
                                 <%if(request.getAttribute("msg")!=null){ %>
                              <h1><%=request.getAttribute("msg") %></h1>
                              <%} %>
                            </div>
                           <div>
                          <input type="hidden" name="Role" class="form-control"  <%if(user.getuRole().equals("admin")){ %>' value="admin"<%} %> >
                             <input type="hidden" name="Role" class="form-control"  <%if(user.getuRole().equals("user")){ %>' value="user"<%} %> >
                           </div>
                            <div class="mt-3">
                            <input type="hidden"  value="UPDATEPROFILE" name="Action">
                           
                              <div class="mt-5 text-center"><button class="btn btn-primary profile-button" onclick="return validation()" >Save Profile</button></div>
                              <%-- <%if(request.getAttribute("msg")!=null){ %>
                              <h1><%=request.getAttribute("msg") %></h1>
                              <%} %> --%>
                            </div>
                            <div class="my-2 d-flex justify-content-center align-items-center">
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
          </div>
            <!-- password change -->
            <div id="myModal2" class="modal fade">
              <div class="modal-dialog modal-confirm">
                <div class="modal-content">
            
                                
                    <div class="mainDiv">
                      <div class="cardStyle">
                        <form action="./PhoneBookController?Action=CHANGEPASSWORD" method="post" name="signupForm" id="signupForm">
                          
                          <img src="" id="signupLogo"/>
                          
                          <h4 class="formTitle">
                            Login to your account
                          </h4>
                          <div class="inputDiv">
                            <label class="inputLabel" for="password">Current Password</label>
                            <input type="password" id="password" name="oldpassword" required>
                          </div>
                            
                        <div class="inputDiv">
                          <label class="inputLabel" for="password">New Password</label>
                          <input type="password" id="password" name="newpassword" required>
                        </div>
                          
                        <div class="inputDiv">
                          <label class="inputLabel" for="confirmPassword">Confirm New Password</label>
                          <input type="password" id="confirmPassword" name="confirmPassword">
                        </div>
                        
                        <div class="buttonWrapper">
                          <button type="submit" id="submitButton" onclick="validateSignupForm()" class="submitButton pure-button pure-button-primary">
                            <span>Continue</span>
                          
                          </button>
                        </div>
                          
                      </form>
                      </div>
                  
                </div>
              </div>
            </div> 
            </div>
          <!-- content-wrapper ends -->
          <!-- partial:../../partials/_footer.html -->
         
          <!-- partial -->
        </div>
        <!-- main-panel ends -->
      </div>
      <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    <!-- plugins:js -->
    <script src="./assets/vendors/js/vendor.bundle.base.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="./assets/js/off-canvas.js"></script>
    <script src="./assets/js/hoverable-collapse.js"></script>
    <script src="./assets/js/misc.js"></script>
    <script>
    function validation(){
        var mobile = document.getElementById("moNo");
        var mobileError = document.getElementById("mobileError");
        
        var name = document.getElementById("cname");
        var nameError = document.getElementById("nameError");
        
       alert(mobile);
        
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
    <!-- endinject -->
  </body>
</html>