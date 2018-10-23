(function () {
  'use strict';
   myapp.controller('AbmEspecialidadesController',
        function($scope, $http, $window, NgTableParams) {
            var self = this;
            $http({method: 'GET',url: '../especialidadController/todos'}).then(
                function successCallback(response) {
                    $scope.especialidadTable = new NgTableParams({}, { dataset: response.data});
                }, function errorCallback(response) {
            });
            $scope.nuevoUsuario = (function(){
                var postData = {
                    username:"fede",
                    password:"123",
                    role:"ADMIN"
                }
                $http({method: 'POST', url: '../usuarioController/nuevoUsuario', data:postData}).then(
                    function successCallback(response){
                    }, function errorCallback(response){
                });
            });
        })
}());