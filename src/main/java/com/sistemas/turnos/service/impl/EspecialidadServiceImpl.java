package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.model.Especialidad;
import com.sistemas.turnos.repository.EspecialidadRepository;
import com.sistemas.turnos.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public List<Especialidad> getAll() {
        List<Especialidad> especialidadList = new ArrayList<>();
        Especialidad especialidad1 = new Especialidad();
        especialidad1.setCodigo(11L);
        especialidad1.setDescripcion("Especialidad 1");
        especialidad1.setConsulta(1);
        especialidad1.setId(1L);
        Especialidad especialidad2 = new Especialidad();
        especialidad2.setCodigo(12L);
        especialidad2.setDescripcion("Especialidad 2");
        especialidad2.setConsulta(2);
        especialidad2.setId(2L);
        Especialidad especialidad3 = new Especialidad();
        especialidad3.setCodigo(13L);
        especialidad3.setDescripcion("Especialidad 3");
        especialidad3.setConsulta(3);
        especialidad3.setId(3L);
        especialidadList.add(especialidad1);
        especialidadList.add(especialidad2);
        especialidadList.add(especialidad3);
        return especialidadList;
    }
}
