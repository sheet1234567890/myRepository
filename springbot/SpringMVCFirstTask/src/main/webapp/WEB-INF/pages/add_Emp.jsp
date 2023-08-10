<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>

<body>
        <h2>EMPLOYEE RAGISTRATION FORM</h2>
        <form class="frm"  method="POST" action="/Add" >
        
        
       <div> NAME:<input type="text" name="emap_name"/></div><br>
         <div>SALARY:<input type="text" name="emp_sal"/></div><br>
           <div>PASSWORD:<input type="text" name="emp_pwd"/></div><br>
          <div>DEPARTMENT: <select name="emp_dept">
					<option value="DEV">DEV</option>
					<option value="QA">CS</option>
					<option value="IT">IT</option>
					<option value="CIVIL">CIVIL</option>
				  </select></div><br>
		  <div> ADDRESS: <textarea name="emp_adddress"></textarea></div>
			
			 <button type="submit" >SAVE</button>
        </form>
        <a href="/">GO TO HOME PAGE</a>
</body>
</html>