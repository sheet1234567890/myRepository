<%@page import="com.adda.app.Bean.User" %>
<%@page import="com.adda.app.Bean.Contect" %>
<%@page import="com.adda.app.Bean.Group" %>
   <%@page import="java.util.*"%>
  <!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Group Contect View</title>
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
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
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
    .form-control {
    border: 1px solid #b2b4b8;
    font-family: "ubuntu-regular", sans-serif;
    font-size: 0.8125rem;
    /* background-color:rgb(228, 228, 231); */
}
.dataTables_wrapper .dataTables_filter input {
    border: 1px solid #aaa;
    border-radius: 3px;
    padding: 0px;
    background-color: transparent;
    margin-left: 3px;
}
.dataTables_wrapper .dataTables_filter input {
    border: 1px solid #aaa;
    border-radius: 3px;
    /* padding: 0px; */
    background-color: transparent;
    margin-left: 3px;
    border: none;
    padding-left: 15px;
}
/* modal */
.modal-confirm {		
	color: #636363;
	/* width: 400px; */
}
.modal-confirm .modal-content {
	padding: 20px;
	border-radius: 5px;
	border: none;
	text-align: center;
	font-size: 14px;
}
.modal-confirm .modal-header {
	border-bottom: none;   
	position: relative;
}
.modal-confirm h4 {
	text-align: center;
	font-size: 26px;
	margin: 30px 0 -10px;
}
.modal-confirm .close {
	position: absolute;
	top: -5px;
	right: -2px;
}
.modal-confirm .modal-body {
	color: #999;
}
.modal-confirm .modal-footer {
	border: none;
	text-align: center;		
	border-radius: 5px;
	font-size: 13px;
	
}
.modal-confirm .modal-footer a {
	color: #999;
}		
.modal-confirm .icon-box {
	width: 80px;
	height: 80px;
	margin: 0 auto;
	border-radius: 50%;
	z-index: 9;
	text-align: center;
	border: 3px solid #f15e5e;
}
.modal-confirm .icon-box i {
	color: #f15e5e;
	font-size: 46px;
	display: inline-block;
	margin-top: 13px;
}
.modal-confirm .btn, .modal-confirm .btn:active {
	color: #fff;
	border-radius: 4px;
	background: #60c7c1;
	text-decoration: none;
	transition: all 0.4s;
	line-height: normal;
	min-width: 120px;
	border: none;
	min-height: 40px;
	border-radius: 3px;
	margin: 0 5px;
}
.modal-confirm .btn-secondary {
	background: #c1c1c1;
}
.modal-confirm .btn-secondary:hover, .modal-confirm .btn-secondary:focus {
	background: #a8a8a8;
}
.modal-confirm .btn-danger {
	background: #f15e5e;
}
.modal-confirm .btn-danger:hover, .modal-confirm .btn-danger:focus {
	background: #ee3535;
}
.trigger-btn {
	display: inline-block;
	margin:10px auto;
}
.col-form-label {
  
    padding-bottom:1rem;
  
}
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
h4.card-title {
    text-align: center;
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
/* toggle */
.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

.switch input {
  opacity: 0;
  width: 0;
  height: 0;
}

.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: 0.4s;
  transition: 0.4s;
}
img.clogo {
    width: 33px;
}
.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: 0.4s;
  transition: 0.4s;
}

input:checked + .slider {
  background-color: #2196f3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196f3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
}
.btn-sm {
    padding: 9px 15px;
    font-size: .875rem;
    line-height: 1.5;
    border-radius: 0.2rem;
}
.navbar .navbar-menu-wrapper .search-field .input-group input {
    font-size: 1.5rem;
    padding: 0.5rem;
}
p#delete {
    text-align: end;
}
  </style>
  <body>
  <%User user = (User)request.getAttribute("user"); %>
   <%List<Contect> list=(ArrayList)request.getAttribute("conlist");
		%>
		<%List<Group>glist=(ArrayList)request.getAttribute("glist"); %>
		<%Group group=(Group)request.getAttribute("group"); %>
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
             <!--    </ul>
              </div>
            </li> -->
            <li class="nav-item">
              <a class="nav-link" data-bs-toggle="collapse" href="#ui-basic2" aria-expanded="false" aria-controls="ui-basic2">
                <span class="menu-title"><i class="fa fa-th-large" style="font-size:20px"></i>&nbsp;View Group</span>
                <i class="menu-arrow"></i>
              </a>
              <div class="collapse" id="ui-basic2">
                <ul class="nav flex-column sub-menu">
                  <%for(Group g:glist) 
                   {
                   %>
                   <li class ="nav-item"><a class="nav-link" href="./PhoneBookController?Action=GETGROUP&gid=<%=g.getgId()%>"><%=g.getgName() %></a></li>
                   
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
                  <div class="logo">
                    <h4 class="card-title"><%=group.getgName() %> </h4>
                    <a id="fav">
                    <%if(group.getgIsfav())
                          { %>
                          <a class="fav" onclick="return confirm('are you sure you fav contect')" href="./PhoneBookController?Action=GROUPFAV&gisfav=<%=group.getgIsfav()%>&gid=<%=group.getgId()%>"><img class="clogo" src="./pages/login/fav.png"></a>
                      
                          <%}
                    else
                    {%>
                     <a class="fav" onclick="return confirm('are you sure you fav contect')" href="./PhoneBookController?Action=GROUPFAV&gisfav=<%=group.getgIsfav()%>&gid=<%=group.getgId()%>"><img class="clogo" src="./pages/login/unfav.png"></a>
                      
                    <%} %>
                       </a>
                   <a href="./PhoneBookController?Action=GETALLCONTECTFORGROUP&gid=<%=group.getgId()%>" ><img class="clogo" src="./pages/login/conadd.jpg" ></a>
                 <a id="delete" href="./PhoneBookController?Action=DELETEGROUP&gid=<%=group.getgId()%>"><img class="clogo" src="./pages/login/del.jpg" ></a>
                  <a id="delete" class="fa fa-edit" href="./PhoneBookController?Action=GROUPEDIT&gid=<%=group.getgId()%>">Edit </a>  
                 <!-- <h6 id="fav"><img class="clogo" src="./pages/login/fav.png" ></h6> -->
                  <!--  <p id="fevorite">favorite group <a ></a></p> -->
                  </div>
                  </div>
                  
                 </div>
               </div>
              </div>
         
      
         
    
              <div class="col-12 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <div style="overflow-x:auto;">
                      <table id="example" class="display hover" style="width:100%;height: 230px;" border="1">
                        <thead>
                            <tr>
                               <!--  <th>S.NO</th> -->
                                <th> Name</th>
                                <th> Email</th>
                                <th>Mobaile</th>
                                <th>Address</th>
                              <!--   <th>Favorite Contect</th> -->
                                 <th>Action</th> 
                            </tr>
                        </thead><br>
                         <tbody id="showData">
                          <% 
                          for(Contect l:list){ %>
                          <tr>
                          <td><%=l.getcName() %></td>
                          <td><%=l.getcEmail() %></td>
                          <td><%=l.getcMobile() %></td>
                          <td><%=l.getcAddress() %></td>
                         <%--  <td><%if(l.getcIsfav())
                          { %>
                          <a class="fav" onclick="return confirm('are you sure you fav contect')" href="./PhoneBookController?Action=GCONTECTFAVORAITE&cid=<%=l.getcId() %>&conisfav=<%=l.getcIsfav() %>&gid=<%=group.getgId() %>" ><img class="clogo" src="./pages/login/fav.png"></a>
                      
                          <%}
                          else
                          { %>
                          <a class="fav" onclick="return confirm('are you sure unfav contect')" href="./PhoneBookController?Action=GCONTECTFAVORAITE&cid=<%=l.getcId() %>&conisfav=<%=l.getcIsfav() %>&gid=<%=group.getgId() %>" ><img class="clogo" src="./pages/login/unfav.png"></a>
                          <%} %>
                          
                          </td> --%>
                           <%-- <td><a class="edit" onclick="return confirm('are you sure update details')" href="./PhoneBookController?Action=GTOEDITCONTECT&cid=<%=l.getcId()%>">EDIT </a> --%>
                        <td>  <a class="delete" onclick="return confirm('are you sure delete details')" href="./PhoneBookController?Action=GDELETECONTECT&cid=<%=l.getcId()%>&gid=<%=group.getgId() %>" ><img class="clogo" src="./pages/login/del.jpg" ></a>   
                          </td>
                                                                                                         
                          </tr>
                          <%
                          }%>
                      </tbody>
                 
                    </table><br>
                  </div>
                  </div>
                </div>

                <!-- delete modal -->
                <div id="myModal" class="modal fade">
                  <div class="modal-dialog modal-confirm">
                    <div class="modal-content">
                      <div class="modal-header flex-column">
                        <div class="icon-box">
                          <i class="material-icons">&#xE5CD;</i>
                        </div>						
                        <h4 class="modal-title w-100">Are you sure?</h4>	
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      </div>
                      <div class="modal-body">
                        <p>Do you really want to delete these records? This process cannot be undone.</p>
                      </div>
                      <div class="modal-footer justify-content-center">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                        <button type="button" class="btn btn-danger">Delete</button>
                      </div>
                    </div>
                  </div>
                </div>   
                <!-- edit modal -->
                <div id="myModal1" class="modal fade">
                  <div class="modal-dialog modal-confirm">
                    <div class="modal-content">
                      <div class="modal-header flex-column">
                        <form>
                         
                          <div class="form-group row">
                            <h3 style="text-align:center;padding-bottom:1rem;
                            font-size: 1.5rem;">Edit Plan</h3>
                            <label for="inputnumber" class="col-sm-4 col-form-label"  autofocus style="text-align: justify;">S.NO:</label>
                            <div class="col-sm-8">
                              <input type="number" class="form-control" id="inputnumber" placeholder="123456">
                            </div>
                            <label for="inputtext" class="col-sm-4 col-form-label" style="text-align: justify;"> Plan Name</label>
                            <div class="col-sm-8">
                              <input type="text" class="form-control" id="inputext" placeholder="SNAP">
                            </div>
                            <label for="inputnumber" class="col-sm-4 col-form-label" style="text-align: justify;">Plan Start</label>
                            <div class="col-sm-8">
                              <input type="number" class="form-control" id="inputnumber" placeholder="20/09/2021">
                            </div>
                            <label for="inputnumber" class="col-sm-4 col-form-label" style="text-align: justify;">Plan End</label>
                            <div class="col-sm-8">
                              <input type="number" class="form-control" id="inputnumber" placeholder="09/12/2022">
                            </div>
                            <label for="inputtext" class="col-sm-4 col-form-label" style="text-align: justify;">Plan Cetegory</label>
                            <div class="col-sm-8">
                              <input type="text" class="form-control" id="inputtext" placeholder="Food">
                            </div>
                          </div>

                        </form>
                      <div class="modal-footer justify-content-center">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                        <button type="button" class="btn btn-danger">Delete</button>
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
              <!-- <div class="col-12 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Education Details</h4>
                  </div>
                </div>
              </div> -->
            </div>
          </div>
          <!-- content-wrapper ends -->
          <!-- partial:../../partials/_footer.html -->
          <!-- <footer class="footer">
            <div class="container-fluid d-flex justify-content-between">
              <span class="text-muted d-block text-center text-sm-start d-sm-inline-block">Copyright © bootstrapdash.com 2021</span>
              <span class="float-none float-sm-end mt-1 mt-sm-0 text-end"> Free <a href="https://www.bootstrapdash.com/bootstrap-admin-template/" target="_blank">Bootstrap admin template</a> from Bootstrapdash.com</span>
            </div>
          </footer> -->
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
            
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script>
/* $(document).ready(function(){
    showData();
}); */
    
</script>
<script>
  /* $(document).ready(function() {
    $('#example').DataTable();
} );
 */
/* function showData(){
        var html = '';
      if ($.fn.DataTable.isDataTable('#example')){
         // destroy table
          $('#example').DataTable().destroy();
      }
        //  create tr td 
        Object.keys(data).forEach(function(key) {
            html += '<tr>'; 
            html += '<td>'+data[key].ID+'</td>';
            html += '<td>'+data[key].Nama+'</td>';
            html += '<td>'+data[key].Start+'</td>'; 
            html += '<td>'+data[key].End+'</td>'; 
            html += '<td>'+data[key].Category+'</td>'; 
            html += '<td>'+data[key].Edit+'<button href="#myModal1"  data-toggle="modal" class="btn btn-success btn-sm " type="button" data-toggle="tooltip" data-placement="top" title="Edit"><i class="fa fa-edit"></i></button></td>';  
            html += '<td>'+data[key].Delete+'<button href="#myModal"  data-toggle="modal" class="btn btn-danger btn-sm " type="button" data-toggle="tooltip" data-placement="top" title="Delete"><i class="fa fa-trash"></i></button> </td>'; 
            html += '<td>'+data[key].Action+'<label class="switch"><input type="checkbox" checked><span class="slider round"></span></label>'; 
            html += '</tr>';
        });
        $('#showData').html(html);
        // create table
        $("#example").dataTable();
    } */

/* var data = [
      {
            'ID':1,
            'Nama' : 'SNAP',
            'Start' : '20-09-2021',
            'End' : '20-12-2021',
            'Category' : 'Food',
            'Edit' : '',
            'Delete' : '',
            'Action' : '',
        },
        {
          'ID':2,
            'Nama' : 'ccap',
            'Start' : '20-09-2021',
            'End' : '20-12-2021',
            'Category' : 'Child Care',
            'Edit' : '',
            'Delete' : '',
            'Action' : '',
        },
        {
          'ID':3,
            'Nama' : 'NJW',
            'Start' : '20-09-2021',
            'End' : '20-12-2021',
            'Category' : 'UnEmployment',
            'Edit' : '',
            'Delete' : '',
            'Action' : '',
        }
    ]; */
</script>
    <!-- endinject -->
  </body>
</html>