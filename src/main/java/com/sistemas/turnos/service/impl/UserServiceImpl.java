package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.model.security.User;
import com.sistemas.turnos.repository.security.RoleRepository;
import com.sistemas.turnos.repository.security.UserRepository;
import com.sistemas.turnos.service.UserService;
import com.sistemas.turnos.service.dto.UserDTO;
import com.sistemas.turnos.util.ResponseEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public String nuevoUsuario(UserDTO userDTO) {
        if (userRepository.findByUserUsername(userDTO.getUsername()) == null){
            User user = new User();
            user.setUserUsername(userDTO.getUsername());
            user.setUserPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
            user.setRole(roleRepository.findByName(userDTO.getRole()));
            userRepository.save(user);
            System.out.println("USUARIO CREADO ["+userDTO.getUsername()+"]");
            return ResponseEnum.SUCCES.response();
        }
        System.out.println("NOMBRE DE USUARIO EXISTENTE ["+userDTO.getUsername()+"]");
        return ResponseEnum.ERROR.response();
    }

    @Override
    public UserDTO obtenerUsuario(String username) {
        User user = userRepository.findByUserUsername(username);
        if (user != null) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user.getUserUsername());
            userDTO.setRole(user.getRole().getName());
            System.out.println("USUARIO ENCONTRADO ["+username+"]");
            return userDTO;
        }
        System.out.println("USUARIO NO ENCONRADO ["+username+"]");
        return new UserDTO();
    }

    @Override
    public String eliminarUsuario(String username) {
        try {
            userRepository.delete(userRepository.findByUserUsername(username));
            System.out.println("USUARIO ELIMINADO ["+username+"]");
            return ResponseEnum.SUCCES.response();
        } catch (Exception e) {
            System.out.println("USUARIO NO ELIMINADO ["+username+"]");
            return ResponseEnum.ERROR.response();
        }
    }

    @Override
    public String modificarUsuario(UserDTO userDTO) {
        try {
            User user = userRepository.findByUserUsername(userDTO.getUsername());
            user.setUserPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
            user.setRole(roleRepository.findByName(userDTO.getRole()));
            userRepository.save(user);
            System.out.println("USUARIO MODIFICADO ["+userDTO.getUsername()+"]");
            return ResponseEnum.SUCCES.response();
        } catch (Exception e) {
            System.out.println("USUARIO NO MODIFICADO ["+userDTO.getUsername()+"]");
            return ResponseEnum.ERROR.response();
        }
    }

}
