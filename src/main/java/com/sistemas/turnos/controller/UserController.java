package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.UserService;
import com.sistemas.turnos.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarioController")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/nuevoUsuario", consumes= MediaType.APPLICATION_JSON_VALUE)
    public void nuevoUsuario(@RequestBody UserDTO userDTO){
        userService.nuevoUsuario(userDTO);
    }

}
