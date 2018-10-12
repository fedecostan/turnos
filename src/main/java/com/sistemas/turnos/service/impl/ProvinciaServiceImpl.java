package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.ProvinciaRepository;
import com.sistemas.turnos.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

}
