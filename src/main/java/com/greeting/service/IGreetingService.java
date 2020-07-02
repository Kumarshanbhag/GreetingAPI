package com.greeting.service;

import com.greeting.model.User;

import java.util.List;

public interface IGreetingService {
    User addUser(User user);

    List<User> getAllUser();
}
