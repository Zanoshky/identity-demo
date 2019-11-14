package com.mysugr.example.identitydemo.repo;

import com.mysugr.example.identitydemo.model.PhoneIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneIdentityRepo extends JpaRepository<PhoneIdentity, String> {

}
