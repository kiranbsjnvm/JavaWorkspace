<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#pageContent {
	margin-left: 50px;
	margin-top: 50px;
	border: 2px green solid;
	padding: 40px;
	width: 500;
}

.activeState{
	background : black;
	color:white;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.0/angular-route.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/1.0.3/angular-ui-router.min.js"></script>

<script type="text/javascript" src="myApp.js"></script>

<title>Login</title>
</head>
<body ng-app="myApp">

	<!-- ng Route example -->
	<!-- <h2>ng-Routing example</h2>
	<div id="links">
		<a href="#/home">Home</a> 
		<a href="#/courses">Courses</a> 
		<a href="#/students">Students</a>
	</div>
	<div id="pageContent">
		<ng-view></ng-view>
	</div> -->


	<!-- ui Route example -->
	<h2>ui-Routing example</h2>
	<div id="links">
		<a ui-sref="home" ui-sref-active="activeState">Home</a> 
		<a ui-sref="courses" ui-sref-active="activeState">Courses</a> 
		<a ui-sref="studentParent.students" ui-sref-active="activeState">Students</a>  adding parent state name  before child state
	</div>
	<div id="pageContent">
		<ui-view></ui-view>
	</div>

	<!-- *********** -->
	<div ng-controller="myController">

		<h3>Login Page</h3>

		<div ng-include="'loginForm.html'"></div>

		<p>{{loginMessage}}</p>
	</div>


	<!-- *********************** -->
	<div>

		<div ng-controller="myController">
			<a href="#" ng-click="openLoginModal()">Log in / Sign up</a>
		</div>

	</div>


	<!-- Custome directive  -->
	<p> invoke a directive by Element name :<my-Directive></my-Directive> </p>
	<p>invoke a directive by Attribute :<div my-Directive></div> </p>
	<p>invoke a directive by Class : <div class="my-Directive"></div> </p>

	<!-- Directive Life cycle -->
	<div ng-repeat="i in [0,1,2]">
		<simple name="kiran "> This will go as ng-transuclude - {{i}} </simple>
	</div>
	
	
</body>
</html>