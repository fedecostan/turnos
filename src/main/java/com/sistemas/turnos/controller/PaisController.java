package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paisController")
public class PaisController {

    @Autowired
    private PaisService paisService;


}
