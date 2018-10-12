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
        })
}());