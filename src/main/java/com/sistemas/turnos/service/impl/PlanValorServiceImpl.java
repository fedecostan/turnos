package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.PlanValorRepository;
import com.sistemas.turnos.service.PlanValorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanValorServiceImpl implements PlanValorService {

    @Autowired
    private PlanValorRepository planValorRepository;

}
