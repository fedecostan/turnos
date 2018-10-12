package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.EspecialidadRepository;
import com.sistemas.turnos.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

}
