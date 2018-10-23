package com.sistemas.turnos.controller;

import com.sistemas.turnos.model.Especialidad;
import com.sistemas.turnos.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidadController")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping(value = "/todos")
    public @ResponseBody
    List<Especialidad> todos()  {
        return especialidadService.getAll();
    }


}
