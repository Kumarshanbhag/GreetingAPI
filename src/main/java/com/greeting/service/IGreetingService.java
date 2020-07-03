package com.greeting.service;

import com.greeting.dto.UserDTO;
import com.greeting.model.User;

import java.util.List;

public interface IGreetingService {
    User addUser(UserDTO userDTO);

    List<User> getAllUser();

    User updateUser(int id, UserDTO user);

    String deleteUser(int id);
}
