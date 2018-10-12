package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.SectorRepository;
import com.sistemas.turnos.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectoresServiceImpl implements SectorService {

    @Autowired
    private SectorRepository sectorRepository;

}
