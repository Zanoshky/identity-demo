package com.mysugr.example.identitydemo.controller;

import com.mysugr.example.identitydemo.dto.UserCreation;
import com.mysugr.example.identitydemo.model.AnonymousIdentity;
import com.mysugr.example.identitydemo.model.EmailIdentity;
import com.mysugr.example.identitydemo.model.PhoneIdentity;
import com.mysugr.example.identitydemo.model.User;
import com.mysugr.example.identitydemo.service.DemoService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    DemoService demoService;

    @RequestMapping(method = RequestMethod.POST, path = "/register")
    public User greeting(@Valid @RequestBody UserCreation userToCreate) {
        User user = demoService.createUser();

        if (userToCreate.getEmail() != null && userToCreate.getPassword() != null) {
            EmailIdentity emailId = demoService.createEmailId(user, userToCreate.getEmail(), userToCreate.getPassword());
            user.getIdentities().add(emailId);
        }

        if (userToCreate.getPhoneNumber() != null && userToCreate.getPassword() != null) {
            PhoneIdentity phoneId = demoService.createPhoneId(user, userToCreate.getPhoneNumber(), userToCreate.getPassword());
            user.getIdentities().add(phoneId);
        }

        if(userToCreate.getIdentifier() != null) {
            AnonymousIdentity anonymousId = demoService.createAnonymousIdentity(user, userToCreate.getIdentifier());
            user.getIdentities().add(anonymousId);
        }

        return user;
    }
}
