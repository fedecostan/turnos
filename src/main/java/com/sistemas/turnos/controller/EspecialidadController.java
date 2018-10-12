package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidadController")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;


}
