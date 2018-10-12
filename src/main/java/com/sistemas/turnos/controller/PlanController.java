package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planController")
public class PlanController {

    @Autowired
    private PlanService planService;


}
