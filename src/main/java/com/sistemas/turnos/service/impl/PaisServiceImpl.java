package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.PaisRepository;
import com.sistemas.turnos.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

}
