
var app = angular.module("MyApp", ["ngRoute"]);


app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "/Start"
    })
    .when("/ChooseRest", {
        templateUrl : "/RestChoose"
    })
    .when("/ChoosePortion", {
        templateUrl : "/PortionChoose"
    }) .when("/Pay", {
        templateUrl : "Fourth.html"
    });
    });

app.controller('MainController', function($scope) {
    $scope.currShop=[];
    $scope.names = [
        {name:'קפה קפה',ProdName1:'קפה',ProdName2:'מאפה',AmountProd1:13,AmountProd2:4,pic:'/img/Cafe.png'},
        {name:'קפה גו',ProdName1:'קפה',ProdName2:'מאפה',AmountProd1:1,AmountProd2:2,pic:'/img/JoeLogo.jpg'},
        {name:'בורגראנץ',ProdName1:'ציפס',ProdName2:'קולה',AmountProd1:3,AmountProd2:9,pic:'/img/Burger.png'}
    ];
    
    $scope.TakeShop = function(arr) {
       $scope.currShop = arr; 
    };
    
});