package com.sistemas.turnos.controller;

import com.sistemas.turnos.model.security.User;
import com.sistemas.turnos.service.UserService;
import com.sistemas.turnos.service.dto.UserDTO;
import com.sistemas.turnos.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarioController")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/nuevoUsuario", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    JsonUtil nuevoUsuario(@RequestBody UserDTO userDTO){
        return new JsonUtil(userService.nuevoUsuario(userDTO));
    }

    @GetMapping(value = "/obtenerUsuario")
    public @ResponseBody
    UserDTO obtenerUsuario(@RequestParam String username){
        return userService.obtenerUsuario(username);
    }

    @DeleteMapping(value = "/eliminarUsuario")
    public @ResponseBody
    JsonUtil eliminarUsuario(@RequestParam String username){
        return new JsonUtil(userService.eliminarUsuario(username));
    }

    @PatchMapping(value = "/modificarUsuario")
    public @ResponseBody
    JsonUtil modificarUsuario(@RequestBody UserDTO userDTO){
        return new JsonUtil(userService.modificarUsuario(userDTO));
    }

}
