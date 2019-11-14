package com.mysugr.example.identitydemo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Entity
@Table(name = "users")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@Data
public class User implements Serializable {

    @Id
    @Column(unique = true, length = 36)
    private String id = UUID.randomUUID().toString();

    @Column
    private Boolean enabled = true;

    @Column
    private Profile profile;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Identity> identities = new HashSet<>();

}
