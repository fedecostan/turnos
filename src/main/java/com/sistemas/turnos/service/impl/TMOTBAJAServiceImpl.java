package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.TMOTBAJARepository;
import com.sistemas.turnos.service.TMOTBAJAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TMOTBAJAServiceImpl implements TMOTBAJAService {

    @Autowired
    private TMOTBAJARepository tmotbajaRepository;

}
