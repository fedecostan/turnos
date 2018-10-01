package com.sistemas.turnos.service;

import com.sistemas.turnos.model.User;
import com.sistemas.turnos.service.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getUser(Integer id);

    void saveUser(UserDTO user);

    void updateUser(UserDTO userDTO, Integer id);

    void deleteUser(Integer id);
}
