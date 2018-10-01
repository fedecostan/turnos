(function () {
  'use strict';
   myapp.controller('PacienteController',
        function($scope, $http, $window, NgTableParams) {
            var self = this;
            $scope.goBack = function(){
                $window.location.href = '/web/home.html';
            }

            $http({method: 'GET',url: '../pacienteController/getAll'}).then(
                function successCallback(response) {
                    $scope.pacienteTable = new NgTableParams({}, { dataset: response.data});
                }, function errorCallback(response) {
            });
        })
}());