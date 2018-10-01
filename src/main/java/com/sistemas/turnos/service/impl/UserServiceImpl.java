package com.sistemas.turnos.service.impl;

import com.sistemas.turnos.model.User;
import com.sistemas.turnos.repository.UserRepository;
import com.sistemas.turnos.service.UserService;
import com.sistemas.turnos.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setMobile(userDTO.getMobile());
        userRepository.save(user);
    }

    @Override
    public void updateUser(UserDTO userDTO, Integer id) {
        User user = userRepository.getOne(id);
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setMobile(userDTO.getMobile());
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
