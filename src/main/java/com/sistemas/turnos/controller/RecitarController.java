package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.RecitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recitarController")
public class RecitarController {

    @Autowired
    private RecitarService recitarService;


}
