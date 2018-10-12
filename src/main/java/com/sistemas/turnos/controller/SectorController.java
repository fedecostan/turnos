package com.sistemas.turnos.controller;

import com.sistemas.turnos.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sectorController")
public class SectorController {

    @Autowired
    private SectorService sectorService;


}
