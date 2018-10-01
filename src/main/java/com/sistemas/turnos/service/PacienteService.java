package com.sistemas.turnos.service;

import com.sistemas.turnos.model.Paciente;
import com.sistemas.turnos.service.dto.PacienteDTO;

import java.util.List;

public interface PacienteService {

    List<PacienteDTO> getAll();

    void savePaciente(Paciente paciente);

    void createMockPaciente();
}
