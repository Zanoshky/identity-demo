package com.mysugr.example.identitydemo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 * Represents central data model for storing info relating to users.
 */
@Entity
@Table(name = "profiles")
@Data
public class Profile implements Serializable {

    public enum Sex {MALE, FEMALE}

    @Id
    @Column(unique = true, length = 36)
    private String id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dayOfBirth;

    @Column
    private String country;

    @Column
    private String language;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

}
