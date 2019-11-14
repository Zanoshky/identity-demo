package com.mysugr.example.identitydemo.repo;

import com.mysugr.example.identitydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
