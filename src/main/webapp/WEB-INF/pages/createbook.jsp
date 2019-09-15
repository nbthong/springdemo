<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<<<<<< HEAD
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
=======
>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create book</title>
</head>
<body>
	<jsp:include page="header.jsp" />
<<<<<<< HEAD
	<h2 style="text-align:center; color:blue;">CREATE BOOK MODEL</h2>
	
	<form:form method="POST" action="${pageContext.request.contextPath}/book/create" modelAttribute="book">
         <table border="0">
            <tr>
               <td>Name</td>
               <td><form:input type="text" path="name"/></td>
            </tr>
            <tr>
               <td>Author</td>
               <td><form:input type="text" path="author"/></td>
            </tr>
            <tr>
               <td>Publisher</td>
               <td><form:input type="text" path="publisher"/></td>
            </tr>
             <tr>
               <td>Price</td>
               <td><form:input type="number" path="price"/></td>
=======
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
>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041
            </tr>
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
               </td>
            </tr>
         </table>
<<<<<<< HEAD
      </form:form>
=======
      </form>
>>>>>>> 929d530593738d401ced38dd8f607c8d1c063041
</body>
</html>