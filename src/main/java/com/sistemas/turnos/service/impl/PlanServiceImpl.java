package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.PlanRepository;
import com.sistemas.turnos.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

}
