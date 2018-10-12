package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.RubroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rubroController")
public class RubroController {

    @Autowired
    private RubroService rubroService;


}
