package com.mysugr.example.identitydemo.service;

import com.mysugr.example.identitydemo.model.AnonymousIdentity;
import com.mysugr.example.identitydemo.model.EmailIdentity;
import com.mysugr.example.identitydemo.model.PhoneIdentity;
import com.mysugr.example.identitydemo.model.User;
import com.mysugr.example.identitydemo.repo.AnonymousIdentityRepo;
import com.mysugr.example.identitydemo.repo.EmailIdentityRepo;
import com.mysugr.example.identitydemo.repo.PhoneIdentityRepo;
import com.mysugr.example.identitydemo.repo.UserRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private final AnonymousIdentityRepo anonymousIdentityRepo;
    private final EmailIdentityRepo emailIdentityRepo;
    private final PhoneIdentityRepo phoneIdentityRepo;
    private final UserRepository userRepository;

    @Autowired
    public DemoService(AnonymousIdentityRepo anonymousIdentityRepo,
            EmailIdentityRepo emailIdentityRepo,
            PhoneIdentityRepo phoneIdentityRepo,
            UserRepository userRepository) {
        this.anonymousIdentityRepo = anonymousIdentityRepo;
        this.emailIdentityRepo = emailIdentityRepo;
        this.phoneIdentityRepo = phoneIdentityRepo;
        this.userRepository = userRepository;
    }

    public User createUser() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        userRepository.save(user);
        return user;
    }

    public EmailIdentity createEmailId(User user, String email, String password) {
        EmailIdentity emailId = new EmailIdentity(email, password);
        emailId.setId(UUID.randomUUID().toString());
        emailId.setUser(user);
        return emailIdentityRepo.save(emailId);
    }

    public PhoneIdentity createPhoneId(User user, String phoneNumber, String password) {
        PhoneIdentity phoneId = new PhoneIdentity(phoneNumber, password);
        phoneId.setId(UUID.randomUUID().toString());
        phoneId.setUser(user);
        return phoneIdentityRepo.save(phoneId);
    }

    public AnonymousIdentity createAnonymousIdentity(User user, String identifier) {
        AnonymousIdentity anonymousId = new AnonymousIdentity(identifier);
        anonymousId.setId(UUID.randomUUID().toString());
        anonymousId.setUser(user);
        return anonymousIdentityRepo.save(anonymousId);
    }
}
