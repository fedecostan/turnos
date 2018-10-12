package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.RubroRepository;
import com.sistemas.turnos.service.RubroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroServiceImpl implements RubroService {

    @Autowired
    private RubroRepository rubroRepository;

}
