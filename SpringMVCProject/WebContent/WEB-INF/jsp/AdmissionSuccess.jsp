<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Congradulations!!!!!! You submitted form succesfully.</h1>
	<!--  <h3>${msg}</h3>  -->
	
	<h3>${headerMsg}</h3>
	
	<P>Details Submitted are : </P>
	<table>
		<thead>
			<td>User Name</td>
			<td>User Hobby</td>
			<td>User Mobile</td>
			<td>User City</td>
			<td>User Country</td>
			
		</thead>
		<tr>
			<td>${studentData.userName}</td>
			<td>${studentData.userHobby}</td>
			<td>${studentData.mobileNumber}</td>
			<td>${studentData.userAddress.userCity}</td>
			<td>${studentData.userAddress.userCountry}</td>
		</tr>
	</table>
	
	<a href="/FirstSpringMVCProject">Click to go Back</a>
</body>
</html>