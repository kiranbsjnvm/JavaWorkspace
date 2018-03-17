<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Student Admission Form</h1>
	
	<h3>${headerMsg}</h3>
	
	<form:errors path="studentData.*" />
	
	<form action="/FirstSpringMVCProject/submitAdmissionForm.html" method="post">
		<p>
			User Name : <input type="text" name="userName"/>
		</p>
		<p>
			Hobby: <input type="text" name="userHobby"/>
		</p>
		<p>
			City: <input type="text" name="userAddress.userCity"/>
		</p>
		<p>
			Country: <input type="text" name="userAddress.userCountry"/>
		</p>
		<p>
			Mobile Number: <input type="text" name="mobileNumber"/>
		</p>
		
		<p>
			User Skills: 
			<select name="userSkills" multiple>
				<option value="Java">Java</option>
				<option value="C++">C++</option>
				<option value="C">C</option>
				<option value="C#">C#</option>
			</select>
		</p>
		
		
		<input type="submit" value="Submit"/>
	</form>
	
</body>
</html>