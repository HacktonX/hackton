var app = angular.module("myApp", ["ngRoute"]);





app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "WelcomeJumbotron.html"
    })
    .when("/ChooseRest", {
        templateUrl : "Second.html"
    })
    .when("/ChoosePortion", {
        templateUrl : "Third.html"
    }) .when("/Pay", {
        templateUrl : "Fourth.html"
    });
});