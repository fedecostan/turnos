package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.model.Paciente;
import com.sistemas.turnos.model.User;
import com.sistemas.turnos.repository.PacienteRepository;
import com.sistemas.turnos.repository.UserRepository;
import com.sistemas.turnos.service.PacienteService;
import com.sistemas.turnos.service.dto.PacienteDTO;
import com.sistemas.turnos.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<PacienteDTO> getAll() {
        List<Paciente> pacienteList = pacienteRepository.findAll();
        List<PacienteDTO> pacienteDTOList = new ArrayList<>();
        for (Paciente paciente : pacienteList){
            PacienteDTO pacienteDTO = new PacienteDTO();
            pacienteDTO.setNombre(paciente.getNombre());
            pacienteDTO.setApellido(paciente.getApellido());
            pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
            pacienteDTO.setDni(paciente.getDni());
            pacienteDTO.setTelefonoCasa(paciente.getTelefonoCasa());
            pacienteDTO.setTelefonoCelular(paciente.getTelefonoCelular());
            pacienteDTO.setDireccion(createAddress(paciente));
            pacienteDTOList.add(pacienteDTO);
        }
        return pacienteDTOList;
    }

    private String createAddress(Paciente paciente) {
        String address = paciente.getDireccionCalle() + " " + paciente.getDireccionAltura();
        if (paciente.getDireccionPiso()!=null) address = address + " " + paciente.getDireccionPiso();
        if (paciente.getDireccionDepartamento()!=null) address = address + "-" + paciente.getDireccionDepartamento();
        return address;
    }

    @Override
    public void savePaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public void createMockPaciente() {
        List<Paciente> pacienteList = new ArrayList<>();
        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Federico");
        paciente1.setApellido("Costantino");
        paciente1.setDni("38157990");
        paciente1.setFechaCreacion(new Date());
        paciente1.setTelefonoCasa("45842308");
        paciente1.setTelefonoCelular("1169209600");
        paciente1.setDireccionCalle("Tres Arroyos");
        paciente1.setDireccionAltura("2091");
        Paciente paciente2 = new Paciente();
        paciente2.setNombre("Daniel");
        paciente2.setApellido("Costantino");
        paciente2.setDni("14109486");
        paciente2.setFechaCreacion(new Date());
        paciente2.setTelefonoCasa("45842308");
        paciente2.setTelefonoCelular("1141668182");
        paciente2.setDireccionCalle("Tres Arroyos");
        paciente2.setDireccionAltura("2091");
        Paciente paciente3 = new Paciente();
        paciente3.setNombre("Elisa");
        paciente3.setApellido("Cardu");
        paciente3.setDni("17852309");
        paciente3.setFechaCreacion(new Date());
        paciente3.setTelefonoCasa("45629876");
        paciente3.setTelefonoCelular("1143667520");
        paciente3.setDireccionCalle("Gregorio");
        paciente3.setDireccionAltura("1778");
        Paciente paciente4 = new Paciente();
        paciente4.setNombre("Candida");
        paciente4.setApellido("Otero");
        paciente4.setDni("6529864");
        paciente4.setFechaCreacion(new Date());
        paciente4.setTelefonoCasa("45818089");
        paciente4.setTelefonoCelular("1175699784");
        paciente4.setDireccionCalle("Condarco");
        paciente4.setDireccionAltura("7525");
        paciente4.setDireccionPiso("3");
        paciente4.setDireccionDepartamento("C");
        pacienteList.add(paciente1);
        pacienteList.add(paciente2);
        pacienteList.add(paciente3);
        pacienteList.add(paciente4);
        pacienteRepository.saveAll(pacienteList);
    }

}
