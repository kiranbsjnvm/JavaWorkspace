<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Hello from test jsp</h3>

<%!
//this is method defination tag
public int add(int a, int b){
	return a+b;
}

%>

<%
//this is simple script tag
//this block is java code block

int i=3;
int j = 4;
int k;

k = i+j;

out.println("Value of k is "+k);

%>

<p>The value of k in html <%=k %>   </p>

the sum of 3 and 5 is <%=3+5 %> !!!!!

<%
int sum = add(333,444);
%>
<br>

<p> The sum of 333 and 444 is <%= sum %> </p>
<p> The sum of 333 and 544 is <%= add(333,544) %> </p>

<%
for(int s=0;s<3;s++){
	out.print(s+" ");
}
%>

<br>

<%
for(int s=0;s<3;s++){
%>
 The value s : <%=s %>
<% } %>


</body>
</html>