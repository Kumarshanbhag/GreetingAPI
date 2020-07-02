/*****************************************************************************
 * @Purpose: To Add Users In Database
 * @Author: Kumar Shanbhag
 * @Date: 02/07/2020
 *****************************************************************************/
package com.greeting.controller;

import com.greeting.model.User;
import com.greeting.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
