package com.mysugr.example.identitydemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public abstract class Identity implements Serializable {

    @Id
    @Column(unique = true, length = 36)
    private String id = UUID.randomUUID().toString();

    @Column
    private Boolean enabled = true;

    @Column
    private Profile profile;

    @JsonIgnore
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private User user;

}
