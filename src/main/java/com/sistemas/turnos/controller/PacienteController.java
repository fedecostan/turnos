package com.sistemas.turnos.controller;

import com.sistemas.turnos.model.Paciente;
import com.sistemas.turnos.service.PacienteService;
import com.sistemas.turnos.service.dto.PacienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacienteController")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public @ResponseBody
    List<PacienteDTO> getAll(){
        return pacienteService.getAll();
    }

//    @RequestMapping(value = "/getById", method = RequestMethod.GET)
//    public @ResponseBody
//    User getById(@RequestParam("id") Integer id){
//        return userService.getUser(id);
//    }
//
    @RequestMapping(value = "/savePaciente", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody Paciente paciente){
        pacienteService.savePaciente(paciente);
    }
//
//    @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
//    public void updateUser(@RequestBody UserDTO userDTO, @PathVariable("id") Integer id){
//        userService.updateUser(userDTO, id);
//    }
//
//    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
//    public void deleteUser(@RequestParam("id") Integer id){
//        userService.deleteUser(id);
//    }

    @RequestMapping(value = "/createMockPaciente", method = RequestMethod.GET)
    public void createMockPaciente(){
        pacienteService.createMockPaciente();
    }

}
