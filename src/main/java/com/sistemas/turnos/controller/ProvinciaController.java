package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provinciaController")
public class ProvinciaController {

    @Autowired
    private ProvinciaService provinciaService;


}
