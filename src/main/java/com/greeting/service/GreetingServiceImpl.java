/*****************************************************************************
 * @Purpose: To Add, Find, Update and Delete  Users In Database
 * @Author: Kumar Shanbhag
 * @Date: 02/07/2020
 *****************************************************************************/
package com.greeting.service;

import com.greeting.dto.UserDTO;
import com.greeting.model.User;
import com.greeting.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements IGreetingService{
    @Autowired
    IGreetingRepository greetingRepository;

    /**
     * @Purpose: To Add User In Database
     * @param userDTO
     * @return
     */
    @Override
    public User addUser(UserDTO userDTO) {
        User user = new User(userDTO);
        return greetingRepository.save(user);
    }

    /**
     * @Purpose: To Get List Of All User From Database
     * @param
     * @return
     */
    @Override
    public List<User> getAllUser() {
        return greetingRepository.findAll();
    }

    /**
     * @Purpose: To Update User In Database
     * @param id
     * @param userDTO
     * @return
     */
    @Override
    public User updateUser(int id, UserDTO userDTO) {
        User user = greetingRepository.findById(id).get();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        return greetingRepository.save(user);
    }
    /**
     * @Purpose: To Delete User In Database
     * @param id
     * @return
     */
    @Override
    public String deleteUser(int id) {
        greetingRepository.deleteById(id);
        return "User Deleted Successfully";
    }
}
