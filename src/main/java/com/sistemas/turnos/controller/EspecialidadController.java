package com.sistemas.turnos.controller;

import com.sistemas.turnos.model.Especialidad;
import com.sistemas.turnos.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/especialidadController")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public @ResponseBody
    List<Especialidad> todos()  {
        return especialidadService.getAll();
    }


}
