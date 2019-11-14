package com.mysugr.example.identitydemo.repo;

import com.mysugr.example.identitydemo.model.EmailIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailIdentityRepo extends JpaRepository<EmailIdentity, String> {

}
