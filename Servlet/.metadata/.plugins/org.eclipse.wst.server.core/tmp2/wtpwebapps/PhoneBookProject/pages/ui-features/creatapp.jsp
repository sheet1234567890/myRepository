
<%@page import="com.adda.app.Bean.User" %>
<%@page import ="com.adda.app.Bean.Group" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title> Admin</title>
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
  
  .error {
    color: red;
    font-size: 10px;
    padding-left: 16px;
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
  <body>
  <%User user=(User)request.getAttribute("user"); %>
   <%ArrayList<Group> glist = (ArrayList<Group>)request.getAttribute("glist"); %> 
    <div class="container-scroller">
      <!-- partial:../../partials/_navbar.html -->
      <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
        <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
          <a class="navbar-brand brand-logo" href="#"><img src="./assets/images/logo2.png" alt="logo" aspect-ratio=167/419 style="height:66px;width:172px;"></a>
          <a class="navbar-brand brand-logo-mini" href="#"><img src="./assets/images/logo-mini.svg" alt="logo" /></a>
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
                  <p class="mb-1 text-black"><%=user.getuName()%></p>
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
            <!-- <li class="nav-item d-none d-lg-block full-screen-link">
              <a class="nav-link">
                <i class="mdi mdi-fullscreen" id="fullscreen-button"></i>
              </a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                <i class="mdi mdi-email-outline"></i>
                <span class="count-symbol bg-warning"></span>
              </a>
              <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="messageDropdown">
                <h6 class="p-3 mb-0">Messages</h6>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item">
                  <div class="preview-thumbnail">
                    <img src="./assets/images/faces/face4.jpg" alt="image" class="profile-pic">
                  </div>
                  <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 class="preview-subject ellipsis mb-1 font-weight-normal">Mark send you a message</h6>
                    <p class="text-gray mb-0"> 1 Minutes ago </p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item">
                  <div class="preview-thumbnail">
                    <img src="./assets/images/faces/face2.jpg" alt="image" class="profile-pic">
                  </div>
                  <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 class="preview-subject ellipsis mb-1 font-weight-normal">Cregh send you a message</h6>
                    <p class="text-gray mb-0"> 15 Minutes ago </p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item">
                  <div class="preview-thumbnail">
                    <img src="./assets/images/faces/face3.jpg" alt="image" class="profile-pic">
                  </div>
                  <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 class="preview-subject ellipsis mb-1 font-weight-normal">Profile picture updated</h6>
                    <p class="text-gray mb-0"> 18 Minutes ago </p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
                <h6 class="p-3 mb-0 text-center">4 new messages</h6>
              </div>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link count-indicator dropdown-toggle" id="notificationDropdown" href="#" data-bs-toggle="dropdown">
                <i class="mdi mdi-bell-outline"></i>
                <span class="count-symbol bg-danger"></span>
              </a>
              <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
                <h6 class="p-3 mb-0">Notifications</h6>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item">
                  <div class="preview-thumbnail">
                    <div class="preview-icon bg-success">
                      <i class="mdi mdi-calendar"></i>
                    </div>
                  </div>
                  <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 class="preview-subject font-weight-normal mb-1">Event today</h6>
                    <p class="text-gray ellipsis mb-0"> Just a reminder that you have an event today </p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item">
                  <div class="preview-thumbnail">
                    <div class="preview-icon bg-warning">
                      <i class="mdi mdi-settings"></i>
                    </div>
                  </div>
                  <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 class="preview-subject font-weight-normal mb-1">Settings</h6>
                    <p class="text-gray ellipsis mb-0"> Update dashboard </p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item">
                  <div class="preview-thumbnail">
                    <div class="preview-icon bg-info">
                      <i class="mdi mdi-link-variant"></i>
                    </div>
                  </div>
                  <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 class="preview-subject font-weight-normal mb-1">Launch Admin</h6>
                    <p class="text-gray ellipsis mb-0"> New admin wow! </p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
                <h6 class="p-3 mb-0 text-center">See all notifications</h6>
              </div>
            </li>
            <li class="nav-item nav-logout d-none d-lg-block">
              <a class="nav-link" href="#">
                <i class="mdi mdi-power"></i>
              </a>
            </li>
            <li class="nav-item nav-settings d-none d-lg-block">
              <a class="nav-link" href="#">
                <i class="mdi mdi-format-line-spacing"></i>
              </a>
            </li> -->
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
            <!-- <li class="nav-item">
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
               <!--  </ul>
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
        <div class="main-panel">
          <div class="content-wrapper">
            <!-- <div class="page-header">
              <h3 class="page-title"> Buttons </h3>
              <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="#">UI Elements</a></li>
                  <li class="breadcrumb-item active" aria-current="page">Buttons</li>
                </ol>
              </nav>
            </div> -->
            <div class="row">
              <div class="col-12 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Create Contect</h4>
                 </div>
               </div>
              </div>
         
      
         
    
              <div class="col-12 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <form action="./PhoneBookController">
                      <div class="form-group">
                        <br>
                        <div class="row">
                          <div class="col">
                            <label for="name">Full Name</label>
                        
                            <input type="text" class="form-control" id="cname" placeholder="Enter name" name="Name" required>
                            <span id="nameError" class="error"></span>
                          </div>
                          <div class="col">
                            <label for="name">Email ID</label>
                            <input type="text" class="form-control" id="email" placeholder="Enter email" name="Email" required>
                           <br>
                          
                          </div>
                        </div>
                      <br>
                      <div class="row">
                        <div class="col">
                          <label for="phone">Mobile Number</label>
                          <input type="text" class="form-control" id="moNo" placeholder="Enter no" name="Phone"  required >
                          <span id="mobileError" class="error"></span>
                        </div>
                         <div class="col">
                        <!--  <form>
                            <fieldset>
                              <legend style="font-size:1rem;">Gender</legend>
                              <div style="margin-top:2rem;">
                                <input type="radio" id="contactChoice3" name="contact" value="mail" />
                                <label for="contactChoice3">Mail</label>
                                &nbsp; &nbsp;
                                <input type="radio" id="contactChoice3" name="contact" value="female" />
                                <label for="contactChoice3">Female</label>
                              </div>
                              </fieldset>
                          </form>
                       </div>
                      </div> -->
                   
                       <label for="address">Address</label>
                          <input type="type" class="form-control" id="address" placeholder="Address" name="Address" required>
                        </div>
                    
                      <br>
                     <!--  <div class="row">
                        <div class="col">
                          <form action="/action_page.php">
                            <label for="birthday">DOB</label>
                            <input type="date" class="form-control" id="birthday" placeholder="yyyy-mm-dd" name="birthday">
                         </form>
                        </div>
                        <div class="col">
                          <label for="phone">SSN</label>
                          <input type="number" class="form-control" id="number" placeholder="123456" name="number">
                         <br>
                        
                        </div>
                      </div>
 -->               
                    </div>
                   <input type ="hidden" value="ADDCONTECT" Class="formController" name ="Action"> 
                <!--     <button type="submit" class="btn btn-default" style="background-color: rgb(118, 118, 240);color: #fff;border-radius:5px;font-size:16px;">submit</button>  -->
                    <input type="submit" class="btn btn-primary" onclick="return validation()"></input>
										
                  <!--  <input type = "button" value="submit"> -->
                    </form>
                  </div>
                </div>
              </div>
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