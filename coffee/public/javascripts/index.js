var MyApp = angular.module('MyApp',[]);

angular.module('MyApp', []).controller('MainController', function($scope) {
    $scope.names = [
        {name:'קפה קפה',ProdName1:'קפה',ProdName2:'מאפה',AmountProd1:13,AmountProd2:4,pic:'Cafe.png'},
        {name:'קפה גו',ProdName1:'קפה',ProdName2:'מאפה',AmountProd1:1,AmountProd2:2,pic:'JoeLogo.jpg'},
        {name:'בורגראנץ',ProdName1:'ציפס',ProdName2:'קולה',AmountProd1:3,AmountProd2:9,pic:'Burger.png'}
    ];
});