<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
        <p> ...............Welcome..........</p>
        <p>
       ID:${obj.userId}</br>
       NAME:${obj.userName}</br>
       ROLE:${obj.userRole}</br>
         FULL DATA:${obj}</br>
        </p>
        <table border=1>
        <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>ROLE</th>
        
        </tr>
        <c:forEach var="ob" items="${listobj}">
        
        <tr>
        <td>${ob.userId}</td>
         <td>${ob.userName}</td>
          <td>${ob.userRole}</td>
        </tr>
        
        
        </c:forEach>
   
        </table>
   
</body>
</html>