package com.mysugr.example.identitydemo.repo;

import com.mysugr.example.identitydemo.model.AnonymousIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnonymousIdentityRepo extends JpaRepository<AnonymousIdentity, String> {

}
