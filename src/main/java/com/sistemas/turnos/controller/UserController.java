package com.sistemas.turnos.controller;

import com.sistemas.turnos.model.User;
import com.sistemas.turnos.service.UserService;
import com.sistemas.turnos.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public @ResponseBody
    User getById(@RequestParam("id") Integer id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
    }

    @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody UserDTO userDTO, @PathVariable("id") Integer id){
        userService.updateUser(userDTO, id);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam("id") Integer id){
        userService.deleteUser(id);
    }

}
