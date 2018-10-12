package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.PlanValorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planValorController")
public class PlanValorController {

    @Autowired
    private PlanValorService planValorService;


}
