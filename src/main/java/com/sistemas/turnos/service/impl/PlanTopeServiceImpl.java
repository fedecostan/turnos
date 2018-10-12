package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.PlanTopeRepository;
import com.sistemas.turnos.service.PlanTopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanTopeServiceImpl implements PlanTopeService {

    @Autowired
    private PlanTopeRepository planTopeRepository;

}
