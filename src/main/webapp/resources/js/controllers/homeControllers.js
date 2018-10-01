(function () {
  'use strict';
   myapp.controller('HomeController',
        function($scope, $window) {
            $scope.redirectPaciente = function(){
                $window.location.href = '/web/paciente.html';
            }
            $scope.redirectMedico = function(){
                $window.location.href = '/web/medico.html';
            }
        })
}());