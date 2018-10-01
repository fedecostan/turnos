(function () {
  'use strict';
   myapp.controller('IndexController',
        function($scope, $window) {
            $scope.login = function(){
                $window.location.href = '/web/home.html';
            }
        })
}());