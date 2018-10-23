package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.model.security.User;
import com.sistemas.turnos.repository.security.RoleRepository;
import com.sistemas.turnos.repository.security.UserRepository;
import com.sistemas.turnos.service.UserService;
import com.sistemas.turnos.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void nuevoUsuario(UserDTO userDTO) {
        User user = new User();
        user.setUserUsername(userDTO.getUsername());
        user.setUserPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        user.setRole(roleRepository.findByName(userDTO.getRole()));
        userRepository.save(user);
    }

}
