package com.sistemas.turnos.service;

import com.sistemas.turnos.model.security.User;
import com.sistemas.turnos.service.dto.UserDTO;

public interface UserService {

    String nuevoUsuario(UserDTO userDTO);

    UserDTO obtenerUsuario(String username);

    String eliminarUsuario(String username);

    String modificarUsuario(UserDTO userDTO);
}
