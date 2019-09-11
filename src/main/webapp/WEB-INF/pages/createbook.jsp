<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create book</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h2 style="text-align:center; color:blue;">CREATE BOOK</h2>
	
	<form method="POST" action="${pageContext.request.contextPath}/book/create">
         <table border="0">
            <tr>
               <td>Name</td>
               <td><input type="text" name="name"/></td>
            </tr>
            <tr>
               <td>Author</td>
               <td><input type="text" name="author"/></td>
            </tr>
            <tr>
               <td>Publisher</td>
               <td><input type="text" name="publisher"/></td>
            </tr>
             <tr>
               <td>Price</td>
               <td><input type="number" name="price"/></td>
            </tr>
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
               </td>
            </tr>
         </table>
      </form>
</body>
</html>