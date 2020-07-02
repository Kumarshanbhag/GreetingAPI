/*****************************************************************************
 * @Purpose: To Add, Find and Update Users In Database
 * @Author: Kumar Shanbhag
 * @Date: 02/07/2020
 *****************************************************************************/
package com.greeting.controller;

import com.greeting.model.User;
import com.greeting.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    IGreetingService greetingService;

    /**
     * @Purpose: To Add User In Database
     * @param user
     * @return user
     */
    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return greetingService.addUser(user);
    }

    /**
     * @Purpose: To Get List Of All User From Database
     * @param
     * @return
     */
    @GetMapping("/user")
    public List<User> getAllUser() {
        return greetingService.getAllUser();
    }

    /**
     * @Purpose: To Update User In Database
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/user")
    public User addUser(@RequestParam(value = "id") int id, @RequestBody User user){
        return greetingService.updateUser(id, user);
    }
}
