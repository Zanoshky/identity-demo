package com.mysugr.example.identitydemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnonymousIdentity extends Identity {

    @Column(unique = true)
    private String identifier;

}
