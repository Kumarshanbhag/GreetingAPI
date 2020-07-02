/*****************************************************************************
 * @Purpose: To Add Users In Database
 * @Author: Kumar Shanbhag
 * @Date: 02/07/2020
 *****************************************************************************/
package com.greeting.service;

import com.greeting.model.User;
import com.greeting.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService{
    @Autowired
    IGreetingRepository greetingRepository;

    /**
     * @Purpose: To Add User In Database
     * @param user
     * @return
     */
    @Override
    public User addUser(User user) {
        return greetingRepository.save(user) ;
    }
}
