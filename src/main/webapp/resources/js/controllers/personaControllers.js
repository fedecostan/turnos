(function () {
  'use strict';
   myapp.controller('PersonaController',
        function($scope, $http) {

            $scope.crearNuevoUser = (function() {
                var data = {
                    name:$scope.user.nombre,
                    email:$scope.user.mail,
                    mobile:$scope.user.telefono
                }
                $http.post("../userController/saveUser",
                    data,
                    {}
                );
            });
        })
}());