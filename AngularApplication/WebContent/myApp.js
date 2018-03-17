var myapp = angular.module('myApp',['ngRoute','ui.router']);

	myapp.controller('myController', function($scope) {
	
		$scope.message = "Hello World!";
	
		$scope.loginMessage = "";
		$scope.formSubmit = function() {
			$scope.loginMessage = "Login Success";
		}
	    
	});
	
	
	//ng route
	myapp.config(function($routeProvider){
	
		$routeProvider
			.when("/home",{
				templateUrl:'home.html',
				controller : 'homeController'
			})
			.when("/courses",{
				templateUrl:'courses.html',
				controller : 'courseController'
			})
			.when("/students",{
				templateUrl:'students.html',
				controller : 'studentController'state
			})
			.when("/students/:id",{
				templateUrl:'studentDetails.html',
				controller : 'studentDetailsController'
			})
			.otherwise({
					redirectTo : "/home"
				});
	
		//$locationProvider.html5Mode(true); // to remove # in url
		
	});
	
	myapp.controller('homeController',function($scope){
		$scope.message = 'Home Page';
	});
	
	myapp.controller('courseController',function(){
		this.courses = ['C#','Java','PHP','Python','C'];
		
		//accessing cutome data created in config 
		this.courseCusomData1 = $state.current.data.customData1;  //state.current is current controller that is courses
		this.courseCusomData2 = $state.current.data.customData2;
		
		this.homeCusomData1 = $state.get("home").data.customData1;  //getting home state data
		
	});
	
	myapp.controller('studentController',function($scope){
		$scope.students = [
		                   {id:1,name:'Kiran',city:'hassan'},
		                   {id:2,name:'Shilpa',city:'hassan'},
		                   {id:3,name:'Divya',city:'hassan'},
		                   {id:4,name:'Manju',city:'hassan'},
		                   {id:5,name:'Roopesh',city:'hassan'},
		           ];
		
		$scope.totalStudents = this.total;
	});
	
	myapp.controller('studentDetailsController',function($scope,$routeParams, $stateParams){
		$scope.students = [
		                   {id:1,name:'Kiran',city:'hassan'},
		                   {id:2,name:'Shilpa',city:'hassan'},
		                   {id:3,name:'Divya',city:'hassan'},
		                   {id:4,name:'Manju',city:'hassan'},
		                   {id:5,name:'Roopesh',city:'hassan'},
		           ];
		
		//for ng-route
		//var id = $routeParams.id; //getting id from link (students/id)
		
		//for ui-route
		var id = $stateParams.id;
		
		
		for(var i=0;i<$scope.students.length;i++){
			if($scope.students[i].id == id)
			{
				$scope.student = $scope.students[i];
			}
		}
		
	});

	
	myapp.controller('studentParentController',function(){
		this.male = 5;
		this.female = 5;
		this.total = 10 ;
	});
	
	
	
	//ui-routing
	myapp.config(function($stateProvider,$urlRouterProvider){
		
		//setting default url
		$urlRouterProvider.otherwise('/home');
		
		$stateProvider
			.state("home",{
				url : '/home',
				templateUrl:'home.html',
				controller : 'homeController',
				data : {
					customData1 : 'Home custom data 1'
				}
			})
			.state("courses",{
				url : '/courses',
				templateUrl:'courses.html',
				controller : 'courseController',
				controllerAs : 'courseCtrl', 					//optional  , controller as syntax
				data : {
					customData1 : 'Course custom data 1',       // custom data , optional
					customData2 : 'Course custom data 2'
				}
			})
			.state("studentParent",{                      //parent state [explaining nested  veiw example]
				url : '/students',
				templateUrl:'studentParent.html',
				controller : 'studentParentController',
				controllerAs : 'studentParentCtrl',
				abstract : true
			})
			.state("studentParent.students",{
				url : '/',                    						//changing from /student to just / , /students is already there in parent
				templateUrl:'students.html',
				controller : 'studentController'
			})
			.state("studentParent.studentDetails",{						//child of studentParent
				url : '/:id',											//changing from /student/:id to just /:id , 
				templateUrl:'studentDetails.html',
				controller : 'studentDetailsController'
			})
			
	
	});
	
	
	
	//custome directive
	myapp.directive("myDirective",function(){
		
		return {
			template : '<h3>My custome directive</h3>'
		};
	});
	
	
	myapp.directive("simple", function(){
		   return {
		     restrict: "EA",
		     transclude:true,
		     scope : {name:'@'},
		     template:"{{name}} <div ng-transclude></div>",
		 
		     compile: function(element, attributes){
		    	 console.log("compile "+element+","+attributes);
		    	 
		         return {
		             pre: function(scope, element, attributes, controller, transcludeFn){
		            	 console.log("pre link ");
		             },
		             post: function(scope, element, attributes, controller, transcludeFn){
		            	 console.log("post link ");
		             }
		         }
		         
		     },
		     controller: function($scope){
		    	 console.log("controller ");
		     }
		   };
		});
	