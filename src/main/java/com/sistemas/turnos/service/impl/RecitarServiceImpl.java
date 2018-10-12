package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.repository.RecitarRepository;
import com.sistemas.turnos.service.RecitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecitarServiceImpl implements RecitarService {

    @Autowired
    private RecitarRepository recitarRepository;

}
