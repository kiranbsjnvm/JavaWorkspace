
function btnClick(){
	console.log("clicked");
};


var myapp = angular.module('myApp', []);


myapp.controller('myController', function ($scope) {

        $scope.message = "Hello World!";

        
        
    });